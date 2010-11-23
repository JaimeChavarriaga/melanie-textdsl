package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class DomainConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public DomainConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) {
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
		if (!(oldEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Model && newEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Model)) {
			return false;
		}
		if (getLink().getParticipant().size() != 1) {
			return false;
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject target = (de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) getLink()
				.getParticipant().get(0);
		return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDomainConnection_4001(getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject && newEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Model)) {
			return false;
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Model source = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) getLink()
				.eContainer();
		return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistDomainConnection_4001(getLink(),
						source, getNewTarget());
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
		getOldSource().setElements(null);
		getNewSource().setElements(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getParticipant().remove(getOldTarget());
		getLink().getParticipant().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection getLink() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.Model getOldSource() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.Model getNewSource() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) newEnd;
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
