package uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class PConnectorParticipantsReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public PConnectorParticipantsReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof uni_mannheim.informatik.swt.models.plm.PLM.PConnector) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject && newEnd instanceof uni_mannheim.informatik.swt.models.plm.PLM.PConnector)) {
			return false;
		}
		return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPConnectorParticipants_4005(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject && newEnd instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject)) {
			return false;
		}
		return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPConnectorParticipants_4005(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getParticipants().remove(getOldTarget());
		getNewSource().getParticipants().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getParticipants().remove(getOldTarget());
		getOldSource().getParticipants().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected uni_mannheim.informatik.swt.models.plm.PLM.PConnector getOldSource() {
		return (uni_mannheim.informatik.swt.models.plm.PLM.PConnector) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected uni_mannheim.informatik.swt.models.plm.PLM.PConnector getNewSource() {
		return (uni_mannheim.informatik.swt.models.plm.PLM.PConnector) newEnd;
	}

	/**
	 * @generated
	 */
	protected uni_mannheim.informatik.swt.models.plm.PLM.PClabject getOldTarget() {
		return (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected uni_mannheim.informatik.swt.models.plm.PLM.PClabject getNewTarget() {
		return (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) newEnd;
	}
}
