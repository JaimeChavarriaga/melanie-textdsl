package de.uni_mannheim.informatik.swt.common;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ParserException;

public class EMFReflectionHelper {
	
	public static Object executeOperation(EObject context, String name) throws InvocationTargetException, ParserException{
		EOperation opration = (EOperation)OCLHelper.execute(context.eClass(), "self.eAllOperations->select(o | o.name = '" + name + "')->first()");
		return context.eInvoke(opration, new BasicEList<>());
	}
	
	public static Object getFeature(EObject context, String name) throws ParserException{
		EStructuralFeature feature = (EStructuralFeature)OCLHelper.execute(context.eClass(), "self.eAllStructuralFeatures->select(o | o.name = '" + name + "')->first()");
		return context.eGet(feature);
	}
}
