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
import org.eclipse.m2m.atl.engine.vm.ASMExecEnv;
import org.eclipse.m2m.atl.engine.vm.ClassNativeOperation;
import org.eclipse.m2m.atl.engine.vm.StackFrame;
import org.eclipse.m2m.atl.engine.vm.VMException;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMBoolean;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModelElement;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclAny;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclSimpleType;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclType;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMOclUndefined;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMString;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.util.Bag;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.DomainElement;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.util.PLMAdapterFactory;

public class ASMPLMModelElement extends ASMEMFModelElement {

	protected ASMPLMModelElement(Map modelElements, ASMModel model,
			EObject object) {
		super(modelElements, model, object);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Gets the helper. Extended to also support helpers that are
	 * defined on an ontological context.
	 */
	@Override
	public ASMOclAny getHelper(StackFrame frame, String name) {
		Boolean cachedOntologicalMode = ontologicalMode;
		
		//We need to do this as the implementation calls getType
		//which will give a wrong result if helper is defined on
		//ontological type.
		ontologicalMode = false;
		ASMOclAny h = super.getHelper(frame, name);
		
		if (h instanceof ASMOclUndefined)
		{
			ontologicalMode = true;
			h = super.getHelper(frame, name);
			ontologicalMode = cachedOntologicalMode;
		}
		
		return h;
	}
	
	/**
	 * Can get the linguistic or ontologic type according to
	 * the value of ontologicalMode. 
	 */
	@Override
	public ASMOclType getType() {
		
		ASMOclType t = null;
		
		if (ontologicalMode == null || !ontologicalMode)
			 t =  super.getType();
		else
			t = getOntologicalType();
		return t;
	}
	
	/**
	 * Retrieves the ontological type from the !meta-model!
	 * 
	 * @param frame
	 * @return
	 */
	private ASMModelElement getOntologicalType(){
		Clabject[] type = null;
		OCL ocl = OCL.newInstance();
		OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
				.createOCLHelper();
		OCLExpression<EClassifier> q;
		
		helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.CLABJECT);
		
		try {
			q = helper.createQuery("Instantiation.allInstances()->select(i | i.instance = self).type->asSequence()");
		
			type = ((ArrayList<Clabject>) ocl.evaluate(object, q)).toArray(new Clabject[] {});
			String qn = ((Model)type[0].eContainer()).getName() + "::" + type[0].getName();
			return ((ASMPLMModel)PLMModelLoader.eInstance.getLoadedModels().get("PLM")).findModelElement(qn);
		}
		catch (ParserException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	//Have to override this as we are not only looking for helpers on linguistic
	//types but also ontological ones
	@Override
	public boolean isHelper(StackFrame frame, String name) {
		boolean isHelper = ((ASMExecEnv)frame.getExecEnv()).isHelper(getType(), name);
		
		//linguistic helper not found -> look for ontological one
		if (!isHelper)
		{
			isHelper = ((ASMExecEnv)frame.getExecEnv()).isHelper(getOntologicalType(), name);	
		}
		return isHelper;
	}
	
	@Override
	public ASMOclAny get(StackFrame frame, String name) {
		
		if ("_o_".equals(name))
		{
			ontologicalMode = true;
			return this;
		}
		else if ("_l_".equals(name))
		{
			ontologicalMode = false;
			return this;
		}
		else if ((frame != null) && isHelper(frame, name))
			return getHelper(frame, name);
		else if (ontologicalMode == null)
		{
			throw new VMException(frame, "Neither linguistic (_l_) nor ontological (_o_) dimension were selected!", null);
		}
		else if (ontologicalMode)
		{
			Element[] feature = null;
			
			OCL ocl = OCL.newInstance();
			OCLHelper<EClassifier, ?, ?, Constraint> helper = ocl
					.createOCLHelper();

			helper.setContext(de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.Literals.CLABJECT);

			try {

				//At first do the easy part check the attributes
				OCLExpression<EClassifier> q = helper.createQuery("self.feature->select(f | f.name = '" + name + "')");
				
				feature = ((HashSet<Element>) ocl.evaluate(object, q)).toArray(new Element[] {});
				
				//No attributes found -> check the connections (references)
				if (feature.length == 0)
				{
					q = helper.createQuery("Connection.allInstances()->select(c | c.participant->includes(self)).participant->reject(p | p = self)->select(p | Instantiation.allInstances()->select(i | i.type.name = '" + name + "').instance->includes(p))");
					
					feature = ((Bag<Element>) ocl.evaluate(object, q)).toArray(new Element[] {});
				}
					
			} catch (ParserException e) {
				e.printStackTrace();
			}
			
			if (feature.length == 0)
			{
				throw new VMException(frame, "Feature " + name + " does not exist on ontologic type " + getType(), null);
			}
			
			ontologicalMode = null;
		 	return feature[0] instanceof Attribute? emf2ASM(frame, ((Attribute)feature[0]).getValue()) : emf2ASM(frame, feature[0]);
		}
		else
		{
			ontologicalMode = null;
			return super.get(frame, name);
		}
	}
	
	//Specifies wheter the model element is in ontologic mode
	//can be explicitly controlled via _o_ and _l_
	private Boolean ontologicalMode = null;
}
