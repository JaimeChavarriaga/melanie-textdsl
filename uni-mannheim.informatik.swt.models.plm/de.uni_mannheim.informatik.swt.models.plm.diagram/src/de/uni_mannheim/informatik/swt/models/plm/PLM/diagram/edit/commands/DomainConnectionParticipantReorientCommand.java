package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands;

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
public class DomainConnectionParticipantReorientCommand extends
		EditElementCommand {

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
	public DomainConnectionParticipantReorientCommand(
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
		if (false == referenceOwner instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) {
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
		if (!(oldEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject && newEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection)) {
			return false;
		}
		return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDomainConnectionParticipant_4003(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject && newEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)) {
			return false;
		}
		return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDomainConnectionParticipant_4003(
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
		getOldSource().getParticipant().remove(getOldTarget());
		getNewSource().getParticipant().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getParticipant().remove(getOldTarget());
		getOldSource().getParticipant().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection getOldSource() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection getNewSource() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) newEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject getOldTarget() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject getNewTarget() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) newEnd;
	}
}
