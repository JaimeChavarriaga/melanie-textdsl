package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DomainEntityDomainEntityFieldsCompartmentItemSemanticEditPolicy
		extends
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DomainEntityDomainEntityFieldsCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainEntity_3005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Field_3007 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.FieldCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
