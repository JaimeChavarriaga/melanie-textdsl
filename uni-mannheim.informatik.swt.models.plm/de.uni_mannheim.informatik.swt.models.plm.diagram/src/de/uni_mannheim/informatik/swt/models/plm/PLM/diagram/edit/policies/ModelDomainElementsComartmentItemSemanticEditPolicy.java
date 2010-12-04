package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ModelDomainElementsComartmentItemSemanticEditPolicy
		extends
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModelDomainElementsComartmentItemSemanticEditPolicy() {
		super(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Model_3004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.DomainEntityCreateCommand(
					req));
		}
		if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_3006 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.DomainConnectionCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
