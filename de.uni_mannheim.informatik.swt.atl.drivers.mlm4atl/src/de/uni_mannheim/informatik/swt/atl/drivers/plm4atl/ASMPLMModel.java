/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/

package de.uni_mannheim.informatik.swt.atl.drivers.plm4atl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModelElement;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
import org.eclipse.m2m.atl.engine.vm.StackFrame;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModelElement;
import org.eclipse.ui.internal.ReopenEditorMenu;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Entity;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMFactoryImpl;

public class ASMPLMModel extends ASMEMFModel {

	private Map classifiers;
	
	public void setExtent(Resource r){
		extent = r;
	}
	
	protected ASMPLMModel(String name, Resource extent, ASMEMFModel metamodel,
			boolean isTarget, ModelLoader ml) {
		super(name, extent, metamodel, isTarget, ml);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ASMModelElement findModelElement(String name) {
		return getClassifier(name);
	}
	
	/**
	 * Returns the classifier with the given name.
	 * 
	 * @param name
	 *            the classifier name
	 * @return the classifier with the given name
	 */
	private synchronized ASMModelElement getClassifier(String name) {
		// TODO reinstate double checked locking with final field when switching to Java 5
		if (classifiers == null) {
			classifiers = initClassifiersInAllExtents();
		}
		EObject eo = (EObject)classifiers.get(name);

		ASMModelElement ret = null;
		if (eo != null) {
			ret = getASMModelElement(eo);
		}
		return ret;
	}
	
	/**
	 * Indexes all classifiers in main extent and referenced extents.
	 * 
	 * @return The classifier map to build.
	 * @see #register(Map, String, EObject)
	 * @author <a href="mailto:dennis.wagelaar@vub.ac.be">Dennis Wagelaar</a>
	 */
	private Map initClassifiersInAllExtents() {
		//********************************************************************
		//We need to register the ontological types as meta model elements
		//********************************************************************
		ASMPLMModel in = null;
		
		Map m = PLMModelLoader.eInstance.getLoadedModels();

		for (Object o : m.values())
		{
			if (o instanceof ASMPLMModel &&
				((ASMPLMModel)o).getMetamodel() == this)
			{
					in = (ASMPLMModel)o;
					break;
			}
		}
		//********************************************************************
		//END
		//********************************************************************
		
		Map allClassifiers = new HashMap();
		
		//*******************************************************************************
		//Additionally to the linguistic type we need to register the ontological ones
		//*******************************************************************************
		initClassifiers(in.getExtent().getContents().iterator(), allClassifiers, null);
		//This part is needed as 
		if (in.getExtent().getContents().size() == 0)
		{
			URI resourceURI = in.getExtent().getURI();
			ResourceSet resSet = new ResourceSetImpl();
			in.setExtent(resSet.getResource(URI.createURI("platform:/resource/sum2uml/sum_target.lml"),true));
			initClassifiers(in.getExtent().getContents().iterator(), allClassifiers, null);
		}
		//*******************************************************************************
		//END
		//*******************************************************************************
		
		initClassifiers(getExtent().getContents().iterator(), allClassifiers, null);
		Iterator refExtents = referencedExtents.iterator();
		while (refExtents.hasNext()) {
			initClassifiers(((Resource)refExtents.next()).getContents().iterator(), allClassifiers, null);
		}
		return allClassifiers;
	}

	private void initClassifiers(Iterator i, Map allClassifiers, String base) {
		for ( ; i.hasNext();) {
			EObject eo = (EObject)i.next();
			if (eo instanceof EPackage) {
				String name = ((EPackage)eo).getName();
				if (base != null) {
					name = base + "::" + name;
				}
				initClassifiers(((EPackage)eo).eContents().iterator(), allClassifiers, name);
			} else if (eo instanceof EClassifier) {
				String name = ((EClassifier)eo).getName();
				// register the classifier under its simple name
				register(allClassifiers, name, eo);
				if (base != null) {
					name = base + "::" + name;
					// register the classifier under its full name
					register(allClassifiers, name, eo);
				}
			}
			else if (eo instanceof DomainElement){
				String name = ((DomainElement)eo).getName();
				String modelName = ((Model)eo.eContainer()).getName();
				register(allClassifiers, modelName + "::" + name, eo);
			}
			else {
				// No meta-package or meta-class => just keep digging.
				// N.B. This situation occurs in UML2 profiles, where
				// EPackages containing EClasses are buried somewhere
				// underneath other elements.
				initClassifiers(eo.eContents().iterator(), allClassifiers, base);
			}
		}
	}
	
	private void register(Map allClassifiers, String name, EObject classifier) {
		if (allClassifiers.containsKey(name)) {
			ATLLogger.warning("metamodel contains several classifiers with same name: " + name);
		}
		allClassifiers.put(name, classifier);
	}
	
	/**
	 * Returns the ASMModelElement corresponding to the given {@link EObject}.
	 * 
	 * @param object
	 *            the given {@link EObject}
	 * @return the {@link ASMModelElement}
	 */
	public synchronized ASMModelElement getASMModelElement(EObject object) {
		// TODO reinstate double checked locking with final field when switching to Java 5
		ASMModelElement ret = (ASMModelElement)modelElements.get(object);
		if (ret == null) {
			//***********************************************
			//We are only interested in onotological types
			//***********************************************
			if (object instanceof DomainElement)
				ret = new ASMPLMModelElement(modelElements, this, object);
			else
				ret = super.getASMModelElement(object);
		}
		return ret;
	}
	
	@Override
	public ASMModelElement newModelElement(ASMModelElement type) {
		ASMModelElement ret = null;

		EObject eObjectType = ((ASMEMFModelElement)type).getObject();
		
		//This is the standard code from ASMEMFModel to create a type instance
		if (eObjectType instanceof EClass){
			EClass t = (EClass)((ASMEMFModelElement)type).getObject();
			EObject eo = t.getEPackage().getEFactoryInstance().create(t);
			ret = getASMModelElement(eo);
			getExtent().getContents().add(eo);
		}
		else if (eObjectType instanceof Entity){
			Entity instance = PLMFactory.eINSTANCE.createEntity();
			Model classifiedModel = ((Clabject) eObjectType).getModel().getClassifiedModel();
			
			//Happens if no level below existed before
			if (classifiedModel == null){
				classifiedModel = PLMFactory.eINSTANCE.createModel();
				((Clabject) eObjectType).getModel().getOntology().getContent().add(classifiedModel);
				classifiedModel.setName("O?");
			}
			
			classifiedModel.getContent().add(instance);
			PLMFactory.eINSTANCE.dressInstanceFromType((Clabject)eObjectType, instance);
			ret = getASMModelElement(instance);
		}
		
		return ret;
	}
}
