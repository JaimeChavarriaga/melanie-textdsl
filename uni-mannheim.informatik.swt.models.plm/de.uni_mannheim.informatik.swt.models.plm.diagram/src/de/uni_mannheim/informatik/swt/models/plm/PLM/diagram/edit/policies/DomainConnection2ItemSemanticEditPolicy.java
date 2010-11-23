package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class DomainConnection2ItemSemanticEditPolicy
		extends
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DomainConnection2ItemSemanticEditPolicy() {
		super(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_4001 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.DomainConnection_4001 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.DomainConnection2CreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnection2EditPart.VISUAL_ID:
			return getGEFWrapper(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.DomainConnectionReorientCommand(
					req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
