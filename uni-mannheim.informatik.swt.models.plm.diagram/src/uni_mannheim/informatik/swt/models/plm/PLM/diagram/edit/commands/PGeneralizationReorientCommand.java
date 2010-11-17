package uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands;

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
public class PGeneralizationReorientCommand extends EditElementCommand {

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
	public PGeneralizationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) {
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
		if (!(oldEnd instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject && newEnd instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject)) {
			return false;
		}
		if (getLink().getParticipants().size() != 1) {
			return false;
		}
		uni_mannheim.informatik.swt.models.plm.PLM.PClabject target = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) getLink()
				.getParticipants().get(0);
		if (!(getLink().eContainer() instanceof uni_mannheim.informatik.swt.models.plm.PLM.Model)) {
			return false;
		}
		uni_mannheim.informatik.swt.models.plm.PLM.Model container = (uni_mannheim.informatik.swt.models.plm.PLM.Model) getLink()
				.eContainer();
		return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPGeneralization_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject && newEnd instanceof uni_mannheim.informatik.swt.models.plm.PLM.PClabject)) {
			return false;
		}
		if (getLink().getParticipants().size() != 1) {
			return false;
		}
		uni_mannheim.informatik.swt.models.plm.PLM.PClabject source = (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) getLink()
				.getParticipants().get(0);
		if (!(getLink().eContainer() instanceof uni_mannheim.informatik.swt.models.plm.PLM.Model)) {
			return false;
		}
		uni_mannheim.informatik.swt.models.plm.PLM.Model container = (uni_mannheim.informatik.swt.models.plm.PLM.Model) getLink()
				.eContainer();
		return uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistPGeneralization_4001(container,
						getLink(), source, getNewTarget());
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
		getLink().getParticipants().remove(getOldSource());
		getLink().getParticipants().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getParticipants().remove(getOldTarget());
		getLink().getParticipants().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization getLink() {
		return (uni_mannheim.informatik.swt.models.plm.PLM.PGeneralization) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected uni_mannheim.informatik.swt.models.plm.PLM.PClabject getOldSource() {
		return (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected uni_mannheim.informatik.swt.models.plm.PLM.PClabject getNewSource() {
		return (uni_mannheim.informatik.swt.models.plm.PLM.PClabject) newEnd;
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
