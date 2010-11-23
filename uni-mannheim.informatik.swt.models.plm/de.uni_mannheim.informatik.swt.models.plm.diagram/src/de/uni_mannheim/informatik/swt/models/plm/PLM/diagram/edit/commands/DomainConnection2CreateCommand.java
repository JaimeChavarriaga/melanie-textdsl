package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

/**
 * @generated
 */
public class DomainConnection2CreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final EObject source;

	/**
	 * @generated
	 */
	private final EObject target;

	/**
	 * @generated
	 */
	public DomainConnection2CreateCommand(CreateRelationshipRequest request,
			EObject source, EObject target) {
		super(request.getLabel(), null, request);
		this.source = source;
		this.target = target;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (source == null && target == null) {
			return false;
		}
		if (source != null
				&& false == source instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Model) {
			return false;
		}
		if (target != null
				&& false == target instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) {
			return false;
		}
		if (getSource() == null) {
			return true; // link creation is in progress; source is not defined yet
		}
		// target may be null here but it's possible to check constraint
		return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy
				.getLinkConstraints().canCreateDomainConnection_4001(
						getSource(), getTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in create link command"); //$NON-NLS-1$
		}

		de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection newElement = de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory.eINSTANCE
				.createDomainConnection();
		getSource().setElements(newElement);
		newElement.getParticipant().add(getTarget());
		doConfigure(newElement, monitor, info);
		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);

	}

	/**
	 * @generated
	 */
	protected void doConfigure(
			de.uni_mannheim.informatik.swt.models.plm.PLM.DomainConnection newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		configureRequest.setParameter(CreateRelationshipRequest.SOURCE,
				getSource());
		configureRequest.setParameter(CreateRelationshipRequest.TARGET,
				getTarget());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

	/**
	 * @generated
	 */
	protected void setElementToEdit(EObject element) {
		throw new UnsupportedOperationException();
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.Model getSource() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.Model) source;
	}

	/**
	 * @generated
	 */
	protected de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject getTarget() {
		return (de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject) target;
	}

}
