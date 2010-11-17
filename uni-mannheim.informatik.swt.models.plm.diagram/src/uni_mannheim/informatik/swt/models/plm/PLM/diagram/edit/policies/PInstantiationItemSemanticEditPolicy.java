package uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

/**
 * @generated
 */
public class PInstantiationItemSemanticEditPolicy
		extends
		uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PInstantiationItemSemanticEditPolicy() {
		super(
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PInstantiation_4003);
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
		if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PConnectorParticipants_4005 == req
				.getElementType()) {
			return getGEFWrapper(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.PConnectorParticipantsCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PConnectorParticipants_4005 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PConnectorParticipantsEditPart.VISUAL_ID:
			return getGEFWrapper(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.PConnectorParticipantsReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
