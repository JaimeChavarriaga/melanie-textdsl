package de.uni_mannheim.informatik.swt.atl.drivers.plm4atl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModelElement;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
import org.eclipse.m2m.atl.engine.vm.StackFrame;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModelElement;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;

import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;

public class ASMPLMModel extends ASMEMFModel {

	private Map classifiers;
	
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
}
