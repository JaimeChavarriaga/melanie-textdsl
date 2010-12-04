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
public class BinaryGeneralizationReorientCommand extends EditElementCommand {

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
	public BinaryGeneralizationReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization) {
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
		if (!(oldEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject && newEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)) {
			return false;
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject target = getLink()
				.getSupertype();
		if (!(getLink().eContainer() instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Model)) {
			return false;
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Model container = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) getLink()
				.eContainer();
		return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistBinaryGeneralization_4004(
						container, getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject && newEnd instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject)) {
			return false;
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject source = getLink()
				.getSubtype();
		if (!(getLink().eContainer() instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Model)) {
			return false;
		}
		de.uni_mannheim.informatik.swt.models.plm.PLM.Model container = (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) getLink()
				.eContainer();
		return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistBinaryGeneralization_4004(
						container, getLink(), source, getNewTarget());
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
		getLink().setSubtype(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSupertype(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization getLink() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.BinaryGeneralization) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject getOldSource() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject getNewSource() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) newEnd;
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
