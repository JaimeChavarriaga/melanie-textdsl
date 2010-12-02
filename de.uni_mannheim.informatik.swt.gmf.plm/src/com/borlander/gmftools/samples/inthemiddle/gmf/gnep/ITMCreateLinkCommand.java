package com.borlander.gmftools.samples.inthemiddle.gmf.gnep;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoableOperation;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionAnchorsCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionEndsCommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.SetConnectionBendpointsCommand;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

@SuppressWarnings("restriction")
public class ITMCreateLinkCommand extends CompositeCommand {

	private static final String REQUEST_PARAMETER_KEY = ITMCreateLinkCommand.class.getCanonicalName() + ":request:parameter:key"; //$NON-NLS-1$

	private ICommand mySemanticCreation;

	private ICommand myEdgeCreation;

	private SetConnectionEndsCommand mySetConnectionEndsCommand;

	private SetConnectionAnchorsCommand mySetConnectionAnchorsCommand;

	private SetConnectionBendpointsCommand mySetConnectionBendpointsCommand;

	private ITMCreateParameters mySourceParameters;

	private ITMCreateParameters myTargetParameters;

	private final PreferencesHint myPreferencesHint;

	public ITMCreateLinkCommand(TransactionalEditingDomain domain, PreferencesHint preferencesHint) {
		super(DiagramUIMessages.Commands_CreateCommand_Connection_Label);
		myPreferencesHint = preferencesHint;

		mySetConnectionEndsCommand = new SetConnectionEndsCommand(domain, StringStatics.BLANK);
		mySetConnectionAnchorsCommand = new SetConnectionAnchorsCommand(domain, StringStatics.BLANK);
		mySetConnectionBendpointsCommand = new SetConnectionBendpointsCommand(domain);
	}

	public PreferencesHint getPreferencesHint() {
		return myPreferencesHint;
	}

	@Override
	public void add(IUndoableOperation operation) {
		assertNotExecuted();
		super.add(operation);
	}

	@Override
	public boolean canExecute() {
		if (mySemanticCreation != null && !mySemanticCreation.canExecute()) {
			return false;
		}
		if (myEdgeCreation != null && !myEdgeCreation.canExecute()) {
			return false;
		}
		if (mySetConnectionEndsCommand != null && !mySetConnectionEndsCommand.canExecute()) {
			return false;
		}
		if (mySetConnectionAnchorsCommand != null && !mySetConnectionAnchorsCommand.canExecute()) {
			return false;
		}
		if (mySetConnectionBendpointsCommand != null && !mySetConnectionBendpointsCommand.canExecute()) {
			return false;
		}
		if (isEmpty()) {
			//we are not actually empty, we do have 5 commands before
			return true;
		}
		return super.canExecute();
	}

	@Override
	public IStatus execute(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
		addNotNull(mySemanticCreation);
		addNotNull(myEdgeCreation);
		addNotNull(mySetConnectionEndsCommand);
		addNotNull(mySetConnectionAnchorsCommand);
		addNotNull(mySetConnectionBendpointsCommand);

		IStatus result = super.execute(progressMonitor, info);
		if (result != null && result.getSeverity() == IStatus.CANCEL && !isExecuted()) {
			removeNotNull(mySemanticCreation);
			removeNotNull(myEdgeCreation);
			removeNotNull(mySetConnectionEndsCommand);
			removeNotNull(mySetConnectionAnchorsCommand);
			removeNotNull(mySetConnectionBendpointsCommand);
		}

		return result;
	}

	/**
	 * Intentionally package local, only U2TGraphicalNodeEditPolicy can call this. 
	 */
	void setSemanticCreation(ICommand semanticCreation) {
		assertNotExecuted();
		mySemanticCreation = semanticCreation;
	}

	/**
	 * Intentionally package local, only U2TGraphicalNodeEditPolicy can call this. 
	 */
	void setSourceParameters(ITMCreateParameters sourceParameters) {
		mySourceParameters = sourceParameters;
	}

	/**
	 * Intentionally package local, only U2TGraphicalNodeEditPolicy can call this. 
	 */
	void setTargetParameters(ITMCreateParameters targetParameters) {
		myTargetParameters = targetParameters;
	}

	public void setEdgeCreation(ICommand edgeAndSemantic) {
		assertNotExecuted();
		myEdgeCreation = edgeAndSemantic;
	}

	public void setEdgeAdapter(IAdaptable edgeAdaptor) {
		assertNotExecuted();
		mySetConnectionEndsCommand.setEdgeAdaptor(edgeAdaptor);
		mySetConnectionAnchorsCommand.setEdgeAdaptor(edgeAdaptor);
		mySetConnectionBendpointsCommand.setEdgeAdapter(edgeAdaptor);
	}

	public void setSetConnectionAnchorsCommand(SetConnectionAnchorsCommand setConnectionAnchorsCommand) {
		assertNotExecuted();
		mySetConnectionAnchorsCommand = setConnectionAnchorsCommand;
	}

	public void setSetConnectionEndsCommand(SetConnectionEndsCommand setConnectionEndsCommand) {
		assertNotExecuted();
		mySetConnectionEndsCommand = setConnectionEndsCommand;
	}

	public void setSetConnectionBendpointsCommand(SetConnectionBendpointsCommand setConnectionBendpointsCommand) {
		assertNotExecuted();
		mySetConnectionBendpointsCommand = setConnectionBendpointsCommand;
	}

	public ICommand getSemanticCreation() {
		return mySemanticCreation;
	}

	public ICommand getEdgeCreation() {
		return myEdgeCreation;
	}

	public SetConnectionAnchorsCommand getSetConnectionAnchorsCommand() {
		return mySetConnectionAnchorsCommand;
	}

	public SetConnectionEndsCommand getSetConnectionEndsCommand() {
		return mySetConnectionEndsCommand;
	}

	public SetConnectionBendpointsCommand getSetConnectionBendpointsCommand() {
		return mySetConnectionBendpointsCommand;
	}

	public ITMCreateParameters getSourceParameters() {
		return mySourceParameters;
	}

	public ITMCreateParameters getTargetParameters() {
		return myTargetParameters;
	}

	private void addNotNull(IUndoableOperation operation) {
		if (operation != null) {
			add(operation);
		}
	}

	private void removeNotNull(IUndoableOperation operation) {
		if (operation != null) {
			remove(operation);
		}
	}

	@SuppressWarnings("unchecked")
	public void registerInRequest(Request request) {
		request.getExtendedData().put(REQUEST_PARAMETER_KEY, this);
	}

	public static ITMCreateLinkCommand getFromRequest(Request request) {
		return (ITMCreateLinkCommand) request.getExtendedData().get(REQUEST_PARAMETER_KEY);
	}

	public static ITMCreateLinkCommand getFromRequest(IEditCommandRequest request) {
		return (ITMCreateLinkCommand) request.getParameter(REQUEST_PARAMETER_KEY);
	}

}
