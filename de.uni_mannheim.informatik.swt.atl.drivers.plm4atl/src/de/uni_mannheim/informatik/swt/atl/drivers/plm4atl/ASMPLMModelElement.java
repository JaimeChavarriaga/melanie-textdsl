package de.uni_mannheim.informatik.swt.atl.drivers.plm4atl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModelElement;
import org.eclipse.m2m.atl.engine.vm.ClassNativeOperation;
import org.eclipse.m2m.atl.engine.vm.StackFrame;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMBoolean;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModelElement;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclType;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMString;

public class ASMPLMModelElement extends ASMEMFModelElement {

	protected ASMPLMModelElement(Map modelElements, ASMModel model,
			EObject object) {
		super(modelElements, model, object);
		// TODO Auto-generated constructor stub
	}

	private static void registerMOFOperation(String modelelementName, String methodName, Class[] args)
	throws Exception {
		List realArgs = new ArrayList(Arrays.asList(args));
		realArgs.add(0, ASMEMFModelElement.class);
		realArgs.add(0, StackFrame.class);
		ClassNativeOperation no = new ClassNativeOperation(ASMEMFModelElement.class.getMethod(methodName,
				(Class[])realArgs.toArray(args)));
		ASMModelElement amme = ASMEMFModel.getMOF().findModelElement(modelelementName);
		amme.registerVMOperation(no);
	}
}
