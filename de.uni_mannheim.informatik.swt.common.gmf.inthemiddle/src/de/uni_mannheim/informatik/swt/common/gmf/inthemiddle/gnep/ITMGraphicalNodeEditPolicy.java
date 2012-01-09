/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * and others All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev - initial API and implementation and initial documentation
 *    Ralph Gerbig    - extension
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.common.gmf.inthemiddle.gnep;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionAnchorsCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.SetConnectionEndsCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateOrSelectElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SemanticCreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.INodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.NoteEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ocl.ParserException;
import org.eclipse.swt.widgets.Display;

import de.uni_mannheim.informatik.swt.common.EMFReflectionHelper;
import de.uni_mannheim.informatik.swt.common.OCLHelper;

/**
 * Inherited GraphicalNodeEditPolicy that does the following: <br />
 * 
 * <ul>
 * 	<li>Enable advanced link creation (two roles + connection with one line)</li>
 *  <li>Modifies the content of the displayed popup menu when drawing a connection</li>
 *</ul>
 *
 */
public class ITMGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {

	public static final String DISPLAY_NAME = "DisplayName";
	//The linguistic meta-model type e.g. Role
	public static final String ELEMENT_TYPE = "ElementType";
	//The ontologic meta-model type
	public static final String DSL_TYPE = "DSL_TYPE";
	

	protected class PromptAndCreateConnectionCommand
		extends CreateOrSelectElementCommand {

		/**
		 * Cache the request because it needs to be passed to
		 * {@link #getCommandForMenuSelection(Object, CreateConnectionRequest)}.
		 */
		private CreateConnectionRequest request;

		/**
		 * Creates a new instance.
		 * 
		 * @param content
		 *            The list of items making up the content of the popup menu.
		 * @param request
		 *            The relevant create connection request.
		 */
		public PromptAndCreateConnectionCommand(List content,
				CreateConnectionRequest request) {
			super(CREATE_CONNECTION_COMMAND_LABEL, Display.getCurrent()
				.getActiveShell(), content);
			this.request = request;
		}

		/**
		 * The command to create the connection that may need to be
		 * undone/redone.
		 */
		private Command createCommand;

		/**
		 * Pops up the dialog with the content provided, gets the command to be
		 * executed based on the user selection, and then executes the command.
		 */
		protected CommandResult doExecuteWithResult(
                IProgressMonitor progressMonitor, IAdaptable info)
            throws ExecutionException {
            
			CommandResult cmdResult = super.doExecuteWithResult(progressMonitor, info);
			if (!cmdResult.getStatus().isOK()) {
				return cmdResult;
			}

            Object connectionType = (cmdResult.getReturnValue() instanceof IElementType) ? cmdResult.getReturnValue() : ((Request)cmdResult.getReturnValue()).getExtendedData().get(ELEMENT_TYPE);
            
            if (cmdResult.getReturnValue() instanceof Request)
            	getRequest().getExtendedData().put(DSL_TYPE,  ((Request)cmdResult.getReturnValue()).getExtendedData().get(DSL_TYPE));
            
            Command cmd = getConnectionCompleteCommand(connectionType, getRequest());
            
			Assert.isTrue(cmd != null && cmd.canExecute());
			cmd.execute();
			createCommand = cmd;
            
            if (connectionType instanceof IElementType) {
                CreateRequest createRequest = ((CreateUnspecifiedTypeConnectionRequest) request)
                    .getRequestForType((IElementType) connectionType);
                
                Object newObject = createRequest.getNewObject();

                return CommandResult.newOKCommandResult(newObject);
            }
            return CommandResult.newOKCommandResult();
		}

		protected CommandResult doUndoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			if (createCommand != null) {
				createCommand.undo();
			}
			return super.doUndoWithResult(progressMonitor, info);
		}

		protected CommandResult doRedoWithResult(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
			if (createCommand != null) {
				createCommand.redo();
			}
			return super.doRedoWithResult(progressMonitor, info);
		}

		/**
		 * Gets the request.
		 * 
		 * @return Returns the request.
		 */
		private CreateConnectionRequest getRequest() {
			return request;
		}
	}

	/**
	 * The label used for the command to create a new connection.
	 */
	private static final String CREATE_CONNECTION_COMMAND_LABEL = DiagramUIMessages.GraphicalNodeEditPolicy_createRelationshipCommand_label;
	
	/**
	 * Diagrams that install modified edit policy for
	 * {@link org.eclipse.gef.EditPolicy#GRAPHICAL_NODE_ROLE} also require to
	 * install it into all default nodes, normally created outside the diagram
	 * plugin.
	 * 
	 * @see #315953
	 */
	public static class ITMNoteEditPart extends NoteEditPart {

		public ITMNoteEditPart(View view) {
			super(view);
		}

		protected void createDefaultEditPolicies() {
			super.createDefaultEditPolicies();

			removeEditPolicy(org.eclipse.gef.EditPolicy.GRAPHICAL_NODE_ROLE);
			installEditPolicy(org.eclipse.gef.EditPolicy.GRAPHICAL_NODE_ROLE,
					new ITMGraphicalNodeEditPolicy());

		}
	}

	public ITMGraphicalNodeEditPolicy() {
		super();
	}

	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		if (!(request instanceof CreateConnectionViewRequest)) {
			return null;
		}

		CreateConnectionViewRequest req = (CreateConnectionViewRequest) request;
		TransactionalEditingDomain editingDomain = getHostImpl().getEditingDomain();

		ITMCreateLinkCommand result = new ITMCreateLinkCommand(editingDomain,
				getHostImpl().getDiagramPreferencesHint());
		result.setSourceParameters(computeParameters(request));
		result.registerInRequest(request);

		Diagram diagramView = getView().getDiagram();

		CreateCommand createCommand = new CreateCommand(editingDomain, req
				.getConnectionViewDescriptor(), diagramView);
		result.setEdgeCreation(createCommand);

		IAdaptable edgeAdaptor = (IAdaptable) createCommand.getCommandResult()
				.getReturnValue();
		result.setEdgeAdapter(edgeAdaptor);

		SetConnectionEndsCommand sceCommand = result
				.getSetConnectionEndsCommand();
		sceCommand.setNewSourceAdaptor(new EObjectAdapter(getView()));
		ConnectionAnchor sourceAnchor = getConnectableEditPart()
				.getSourceConnectionAnchor(request);

		SetConnectionAnchorsCommand scaCommand = result
				.getSetConnectionAnchorsCommand();
		scaCommand.setNewSourceTerminal(getConnectableEditPart()
				.mapConnectionAnchorToTerminal(sourceAnchor));

		Command c = new ICommandProxy(result);
		request.setStartCommand(c);

		return c;
	}

	@Override
	protected INodeEditPart getConnectableEditPart() {
		return getHost() instanceof INodeEditPart ? (INodeEditPart) getHost()
				: null;
	}

	@SuppressWarnings("restriction")
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {
		if (request.getStartCommand() != null &&
				!(((ICommandProxy)request.getStartCommand()).getICommand() instanceof ITMCreateLinkCommand))
			return super.getConnectionCompleteCommand(request);
		
		ITMCreateLinkCommand cc = unwrapStartCommand(request);
		if (cc == null) {
			return null;
		}

		// reset the target edit-part for the request
		INodeEditPart targetEP = getConnectionCompleteEditPart(request);
		if (targetEP == null) {
			return null;
		}

		ConnectionAnchor targetAnchor = targetEP
				.getTargetConnectionAnchor(request);
		SetConnectionEndsCommand sceCommand = cc.getSetConnectionEndsCommand();
		sceCommand.setNewTargetAdaptor(new EObjectAdapter(
				((IGraphicalEditPart) targetEP).getNotationView()));

		SetConnectionAnchorsCommand scaCommand = cc
				.getSetConnectionAnchorsCommand();
		scaCommand.setNewTargetTerminal(targetEP
				.mapConnectionAnchorToTerminal(targetAnchor));

		INodeEditPart sourceEditPart = (INodeEditPart) request
				.getSourceEditPart();
		//FIX: This works with the connection fixed anchors
		ConnectionAnchor sourceAnchor = sourceEditPart.getSourceConnectionAnchor(request);
				//.mapTerminalToConnectionAnchor(scaCommand
				//		.getNewSourceTerminal());
		PointList pointList = new PointList();
		if (request.getLocation() == null) {
			pointList.addPoint(sourceAnchor.getLocation(targetAnchor
					.getReferencePoint()));
			pointList.addPoint(targetAnchor.getLocation(sourceAnchor
					.getReferencePoint()));
		} else {
			pointList.addPoint(sourceAnchor.getLocation(request.getLocation()));
			pointList.addPoint(targetAnchor.getLocation(request.getLocation()));
		}

		cc.getSetConnectionBendpointsCommand().setNewPointList(pointList,
				sourceAnchor.getReferencePoint(),
				targetAnchor.getReferencePoint());
		return request.getStartCommand();
	}

	protected Command getConnectionAndRelationshipCompleteCommand(
			CreateConnectionViewAndElementRequest request) {
		if (request.getStartCommand() != null &&
				!(((ICommandProxy)request.getStartCommand()).getICommand() instanceof ITMCreateLinkCommand))
			return super.getConnectionAndRelationshipCompleteCommand(request);
		
		// get the element descriptor
		CreateElementRequestAdapter requestAdapter = request
				.getConnectionViewAndElementDescriptor()
				.getCreateElementRequestAdapter();
		// get the semantic request
		CreateRelationshipRequest createElementRequest = (CreateRelationshipRequest) requestAdapter
				.getAdapter(CreateRelationshipRequest.class);

		createElementRequest.setPrompt(!request.isUISupressed());

		// complete the semantic request by filling in the source and
		// destination
		INodeEditPart targetEP = getConnectionCompleteEditPart(request);
		View sourceView = (View) request.getSourceEditPart().getModel();
		View targetView = (View) targetEP.getModel();

		// resolve the source
		EObject source = ViewUtil.resolveSemanticElement(sourceView);
		if (source == null) {
			source = sourceView;
		}

		createElementRequest.setSource(source);

		// resolve the target
		EObject target = ViewUtil.resolveSemanticElement(targetView);
		if (target == null) {
			target = targetView;
		}
		createElementRequest.setTarget(target);

		ITMCreateParametersImpl computeParameters = computeParameters(request);
		ITMCreateLinkCommand unwrapStartCommand = unwrapStartCommand(request);

		if (null != unwrapStartCommand && computeParameters != null) {
			unwrapStartCommand.setTargetParameters(computeParameters);
		}

		Command createElementCommand = targetEP.getCommand(//
				new EditCommandRequestWrapper(//
						(CreateRelationshipRequest) requestAdapter
								.getAdapter(CreateRelationshipRequest.class), //
						request.getExtendedData()));

		// create the create semantic element wrapper command
		if (null == createElementCommand) {
			return null;
		}

		SemanticCreateCommand semanticCommand = new SemanticCreateCommand(
				requestAdapter, createElementCommand);

		// get the view command
		ICommandProxy result = (ICommandProxy) getConnectionCompleteCommand(request);
		if (null == result) {
			return null;
		}

		ITMCreateLinkCommand viewCommandImpl = (ITMCreateLinkCommand) result
				.getICommand();

		// set semantic creation to be executed before edge creation and setup
		viewCommandImpl.setSemanticCreation(semanticCommand);

		return result;
	}

	@Override
	protected Command getConnectionCompleteCommand(Object connectionType,
			CreateConnectionRequest request) {
		if (connectionType instanceof IElementType) {
			if (request instanceof CreateUnspecifiedTypeConnectionRequest) {
				CreateRequest createRequest = ((CreateUnspecifiedTypeConnectionRequest) request)
						.getRequestForType((IElementType) connectionType);
				
				//This modification is needed to put the DSL type into the request which is
				//used for connection and role creation
				if (request.getExtendedData().get(DSL_TYPE) != null)
					createRequest.getExtendedData().put(DSL_TYPE, request.getExtendedData().get(DSL_TYPE));
				
				if (createRequest != null) {
					return getHost().getCommand(createRequest);
				}
			}
		}
		return null;
	}
	
	private IGraphicalEditPart getHostImpl() {
		return (IGraphicalEditPart) getHost();
	}

	protected ITMCreateLinkCommand unwrapStartCommand(
			CreateConnectionRequest request) {
		ICommandProxy proxy = (ICommandProxy) request.getStartCommand();
		if (proxy == null) {
			return null;
		}
		return (ITMCreateLinkCommand) proxy.getICommand();
	}

	protected ITMCreateParametersImpl computeParameters(
			CreateConnectionRequest request) {
		ITMCreateParametersImpl parameters = new ITMCreateParametersImpl();
		parameters.setParentView(getHostImpl().getNotationView());

		if (request.getLocation() != null) {
			IFigure hostContentPane = getHostImpl().getContentPane();
			Point origin;
			if (hostContentPane.getLayoutManager() instanceof XYLayout) {
				origin = ((XYLayout) hostContentPane.getLayoutManager())
						.getOrigin(hostContentPane);
			} else {
				origin = hostContentPane.getClientArea().getLocation();
			}
			Point relativeLocation = new Point(request.getLocation());
			hostContentPane.translateToRelative(relativeLocation);
			relativeLocation.translate(origin.getNegated());
			parameters.setRelativeLocation(relativeLocation);
		}

		return parameters;
	}
	
	/**
	 * 
	 * <p>Takes care that all possible DSL connections are listed when creating
	 * a connection at instance level.</p>
	 * 
	 * <p><b>Must be refactored to get rid of reflective API. May this must be abstract and
	 * implemented in plugin.</b></p>
	 */
	@Override
	protected List getConnectionMenuContent(CreateConnectionRequest request) {
		List result = super.getConnectionMenuContent(request);
		//This is specialized for Roles
		if (request instanceof CreateUnspecifiedTypeConnectionRequest)
		{
			try {
				EObject source = ((IGraphicalEditPart)request.getSourceEditPart()).resolveSemanticElement();
				EObject target = ((IGraphicalEditPart)request.getTargetEditPart()).resolveSemanticElement();
			
				//Only on Clabject and Clabject
				if (! (Boolean)OCLHelper.execute(source, "self.oclIsKindOf(Clabject)") ||
						! (Boolean)OCLHelper.execute(target, "self.oclIsKindOf(Clabject)"))
						return result;
				
				EList<EObject> sourceTypes = (EList<EObject>)EMFReflectionHelper.executeOperation(source, "getModelTypes");
				EList<EObject> targetTypes = (EList<EObject>)EMFReflectionHelper.executeOperation(target, "getModelTypes");
				
				//Only applied if both are instances
				if (sourceTypes.size() < 1 || targetTypes.size() < 1)
					return result;
				
				EList<EObject> sourceConnections = new BasicEList<EObject>((HashSet<EObject>)OCLHelper.execute(source, "self.getModelTypes().getAllConnections()->asSet()"));
				
				EList<EObject> connections = new BasicEList<EObject>();
				
				//Look for all connections that contain a type of the target instance
				for (EObject obj : sourceConnections){
					//OCL here because getParticipants does not return duplicates
					EList<EObject> participants = new BasicEList<EObject>((List<EObject>)OCLHelper.execute(obj, "self.role.destination->asSequence()"));
					
					boolean found = false;
					
					//Delete the source only once
					for (EObject sourceType : sourceTypes)
					{
						for (int i = 0; i < participants.size(); i++)
							if (participants.get(i).equals(sourceType))
							{
								participants.remove(i);
								break;
							}
						if (found)
							break;
					}
					
					found = false;
					for (EObject participant : participants)
						//participant is in targetType => suitable connection found
						if (targetTypes.contains(participant))
						{
							found = true;
							break;
						}
					
					if (found)
						connections.add(obj);
				}
				
				IElementType elementType = null;
				for (IElementType type: (List<IElementType>)((CreateUnspecifiedTypeConnectionRequest)request).getElementTypes())
					if (type.toString().contains("Role"))
						elementType = type;
						
				
				for (EObject connection : connections){
					//Here we do only create the captions
					Request clone = cloneRequest((CreateUnspecifiedTypeConnectionRequest)request);
					clone.getExtendedData().put(DISPLAY_NAME, EMFReflectionHelper.executeOperation(connection, "getHumanReadableName").toString());
					clone.getExtendedData().put(DSL_TYPE, connection);
					clone.getExtendedData().put(ELEMENT_TYPE, elementType);
					result.add(clone);
				}
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (ParserException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	private CreateUnspecifiedTypeConnectionRequest cloneRequest(CreateUnspecifiedTypeConnectionRequest request){
		CreateUnspecifiedTypeConnectionRequest result = new CreateUnspecifiedTypeConnectionRequest(request.getElementTypes(), request.useModelingAssistantService(), getHostImpl().getDiagramPreferencesHint());
		result.setTargetEditPart(request.getTargetEditPart());
		result.setSourceEditPart(request.getSourceEditPart());
		result.setDirectionReversed(request.isDirectionReversed());
		
		return result;
	}
	
	//This needs to be overriden to provide the right text for the content
	protected ICommand getPromptAndCreateConnectionCommand(List content,
			CreateConnectionRequest request) {
		
		return new PromptAndCreateConnectionCommand(content, request){
			
			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor progressMonitor, IAdaptable info)
					throws ExecutionException {
				return super.doExecuteWithResult(progressMonitor, info);
			}
			
			@Override
			protected ILabelProvider getLabelProvider() {
				return new LabelProvider(){
					@Override
					public String getText(Object object) {
						if (object instanceof Request && ((Request) object).getExtendedData().get(DISPLAY_NAME) != null)
							return ((Request) object).getExtendedData().get(DISPLAY_NAME).toString();
						return super.getText(object);
					}
				};
			}
		};
	}
}