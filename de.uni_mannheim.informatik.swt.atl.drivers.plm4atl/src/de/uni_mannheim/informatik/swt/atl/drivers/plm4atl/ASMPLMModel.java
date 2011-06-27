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
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModelElement;

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
		// TODO Auto-generated method stub
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
		
		ASMPLMModel in = (ASMPLMModel)PLMModelLoader.eInstance.getLoadedModels().get("IN");
		
		Map allClassifiers = new HashMap();
		
		//Additionally to the linguistic type we need to register the ontological ones
		initClassifiers(in.getExtent().getContents().iterator(), allClassifiers, null);
		
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
	
	@Override
	public Set getAllElementsByType(ASMModelElement type) {
		// TODO Auto-generated method stub
		return super.getAllElementsByType(type);
	}
	
	@Override
	public Set getAllElementsByType(String typeName) {
		// TODO Auto-generated method stub
		return super.getAllElementsByType(typeName);
	}
	
	@Override
	public Set getElementsByType(ASMModelElement type) {
		// TODO Auto-generated method stub
		return super.getElementsByType(type);
	}
	
	@Override
	public Set getElementsByType(String typeName) {
		// TODO Auto-generated method stub
		return super.getElementsByType(typeName);
	}
}
