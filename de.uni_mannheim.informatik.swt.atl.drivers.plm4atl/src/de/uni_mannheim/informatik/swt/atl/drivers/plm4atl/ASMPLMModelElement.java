package de.uni_mannheim.informatik.swt.atl.drivers.plm4atl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.m2m.atl.common.ATLLogger;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModelElement;
import org.eclipse.m2m.atl.engine.vm.ClassNativeOperation;
import org.eclipse.m2m.atl.engine.vm.StackFrame;
import org.eclipse.m2m.atl.engine.vm.VMException;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMBoolean;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModelElement;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclType;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMString;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;

public class ASMPLMModelElement extends ASMEMFModelElement {

	protected ASMPLMModelElement(Map modelElements, ASMModel model,
			EObject object) {
		super(modelElements, model, object);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ASMOclAny getHelper(StackFrame frame, String name) {
		// TODO Auto-generated method stub
		return super.getHelper(frame, name);
	}
	
	@Override
	public ASMOclAny get(StackFrame frame, String name) {
		
		if ("_o_".equals(name))
		{
			ontologicAttribute = true;
			return this;
		}
		else if ("_l_".equals(name))
		{
			ontologicAttribute = false;
			return this;
		}
		else if (ontologicAttribute == null)
		{
			throw new VMException(frame, "Neither linguistic (_l_) nor ontological (_o_) dimension were selected!", null);
		}
		else if (ontologicAttribute)
		{
			Feature[] feature = null;
			//find all visualizers in the model
			OCL ocl = OCL.newInstance();
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();

			helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.CLABJECT);

			try {

				OCLExpression<EClassifier> q = helper.createQuery("self.feature->select(f | f.name = '" + name + "')");

				feature = ((HashSet<Feature>) ocl.evaluate(object, q)).toArray(new Feature[] {});
			} catch (ParserException e) {
				e.printStackTrace();
			}
			
			if (feature.length == 0)
			{
				throw new VMException(frame, "Feature " + name + " does not exist on ontologic type " + getType(), null);
			}
			
			ontologicAttribute = null;
			return emf2ASM(frame, ((Attribute)feature[0]).getValue());
		}
		else
		{
			ontologicAttribute = null;
			return super.get(frame, name);
		}
	}
	
	private Boolean ontologicAttribute = null;
}
