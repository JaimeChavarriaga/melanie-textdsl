package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.popupbartools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.SharedCursors;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.gef.tools.AbstractTool;
import org.eclipse.gef.tools.TargetingTool;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IDiagramPreferenceSupport;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.LayoutHelper;
import org.eclipse.gmf.runtime.diagram.ui.internal.l10n.DiagramUIPluginImages;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.tools.AbstractPopupBarTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.PopupBarTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Display;

import de.uni_mannheim.informatik.swt.models.plm.diagram.providers.PLMElementTypes;

public class InstantiatatePopupBarTool extends AbstractPopupBarTool{

	/**
	 * Key modifier for ignoring snap while dragging. It's CTRL on Mac, and ALT
	 * on all other platforms.
	 */
	static final int MODIFIER_NO_SNAPPING;
	private static final int FLAG_LOCK_TARGET = AbstractTool.MAX_FLAG << 1;
	
	/**
	 * List of element types of which one will be created (of type
	 * <code>IElementType</code>).
	 */
	private static List<IElementType> elementTypes = new LinkedList<>();
	
	
	static {
		if (Platform.OS_MACOSX.equals(Platform.getOS())) {
			MODIFIER_NO_SNAPPING = SWT.CTRL;
		} else {
			MODIFIER_NO_SNAPPING = SWT.ALT;
		}
		
		elementTypes.add(PLMElementTypes.Entity_3069);
		elementTypes.add(PLMElementTypes.Entity_3085);
	}
	
	public InstantiatatePopupBarTool(EditPart epHost, IElementType theType) {
		
		super(epHost, theType);
		
		//Old from superclass
		setDefaultCursor(SharedCursors.CURSOR_TREE_ADD);
		setDisabledCursor(SharedCursors.NO);
		unlockTargetEditPart();
		//setDefaultCursor(CURSOR_SHAPE);
		//setDisabledCursor(CURSOR_SHAPE_NOT);
	}
	
	/**
	 * Releases the targeting lock, and updates the target in case the mouse is
	 * already over a new target.
	 */
	protected void unlockTargetEditPart() {
		setFlag(FLAG_LOCK_TARGET, false);
		updateTargetUnderMouse();
	}
	
	/**
	 * Property to be used in {@link AbstractTool#setProperties(java.util.Map)}
	 * for {@link #setFactory(CreationFactory)}.
	 */
	public static final Object PROPERTY_CREATION_FACTORY = "factory"; //$NON-NLS-1$

	private CreationFactory factory;
	private SnapToHelper helper;

	/**
	 * @see org.eclipse.gef.tools.AbstractTool#applyProperty(java.lang.Object,
	 *      java.lang.Object)
	 */
	protected void applyProperty(Object key, Object value) {
		if (PROPERTY_CREATION_FACTORY.equals(key)) {
			if (value instanceof CreationFactory)
				setFactory((CreationFactory) value);
			return;
		}
		super.applyProperty(key, value);
	}

	/**
	 * @see org.eclipse.gef.tools.AbstractTool#calculateCursor()
	 */
	protected Cursor calculateCursor() {
		/*
		 * Fix for Bug# 66010 The following two lines of code were added for the
		 * case where a tool is activated via the keyboard (that code hasn't
		 * been released yet). However, they were causing a problem as described
		 * in 66010. Since the keyboard activation code is not being released
		 * for 3.0, the following lines are being commented out.
		 */
		// if (isInState(STATE_INITIAL))
		// return getDefaultCursor();
		return super.calculateCursor();
	}

	/**
	 * @see org.eclipse.gef.tools.AbstractTool#getCommandName()
	 */
	protected String getCommandName() {
		return REQ_CREATE;
	}

	/**
	 * Cast the target request to a CreateRequest and returns it.
	 * 
	 * @return the target request as a CreateRequest
	 * @see TargetingTool#getTargetRequest()
	 */
	protected CreateRequest getCreateRequest() {
		return (CreateRequest) getTargetRequest();
	}

	/**
	 * @see org.eclipse.gef.tools.AbstractTool#getDebugName()
	 */
	protected String getDebugName() {
		return "Creation Tool";//$NON-NLS-1$
	}

	/**
	 * Returns the creation factory used to create the new EditParts.
	 * 
	 * @return the creation factory
	 */
	protected CreationFactory getFactory() {
		return factory;
	}

	/**
	 * The creation tool only works by clicking mouse button 1 (the left mouse
	 * button in a right-handed world). If any other button is pressed, the tool
	 * goes into an invalid state. Otherwise, it goes into the drag state,
	 * updates the request's location and calls
	 * {@link TargetingTool#lockTargetEditPart(EditPart)} with the edit part
	 * that was just clicked on.
	 * 
	 * @see org.eclipse.gef.tools.AbstractTool#handleButtonDown(int)
	 */
	protected boolean handleButtonDown(int button) {
		if (button != 1) {
			setState(STATE_INVALID);
			handleInvalidInput();
			return true;
		}
		if (firstClick){
			setEditDomain((EditDomain)((IGraphicalEditPart)getHost()).getDiagramEditDomain());
			activate();
			setState(STATE_TERMINAL);
		}
		else if (stateTransition(STATE_INITIAL, STATE_DRAG)) {
			getCreateRequest().setLocation(getLocation());
			lockTargetEditPart(getTargetEditPart());
			// Snap only when size on drop is employed
			if (getTargetEditPart() != null)
				helper = (SnapToHelper) getTargetEditPart().getAdapter(
						SnapToHelper.class);
			firstClick = true;
		}
		return true;
	}

	boolean firstClick = true;
	
	/**
	 * If the tool is currently in a drag or drag-in-progress state, it goes
	 * into the terminal state, performs some cleanup (erasing feedback,
	 * unlocking target edit part), and then calls {@link #performCreation(int)}
	 * .
	 * 
	 * @see org.eclipse.gef.tools.AbstractTool#handleButtonUp(int)
	 */
	protected boolean handleButtonUp(int button) {
		if (stateTransition(STATE_DRAG | STATE_DRAG_IN_PROGRESS, STATE_TERMINAL)) {
			eraseTargetFeedback();
			unlockTargetEditPart();
			performCreation(button);
		}

		setState(STATE_TERMINAL);
		handleFinished();

		return true;
	}

	/**
	 * Updates the request, sets the current command, and asks to show feedback.
	 * 
	 * @see org.eclipse.gef.tools.AbstractTool#handleDragInProgress()
	 */
	protected boolean handleDragInProgress() {
		if (isInState(STATE_DRAG_IN_PROGRESS)) {
			updateTargetRequest();
			setCurrentCommand(getCommand());
			showTargetFeedback();
		}
		return true;
	}

	/**
	 * @see org.eclipse.gef.tools.AbstractTool#handleDragStarted()
	 */
	protected boolean handleDragStarted() {
		return stateTransition(STATE_DRAG, STATE_DRAG_IN_PROGRESS);
	}

	/**
	 * If the user is in the middle of creating a new edit part, the tool erases
	 * feedback and goes into the invalid state when focus is lost.
	 * 
	 * @see org.eclipse.gef.tools.AbstractTool#handleFocusLost()
	 */
	protected boolean handleFocusLost() {
		if (isInState(STATE_DRAG | STATE_DRAG_IN_PROGRESS)) {
			eraseTargetFeedback();
			setState(STATE_INVALID);
			handleFinished();
			return true;
		}
		return false;
	}

	/**
	 * @see org.eclipse.gef.tools.TargetingTool#handleHover()
	 */
	protected boolean handleHover() {
		if (isInState(STATE_INITIAL))
			updateAutoexposeHelper();
		return true;
	}

	/*
	 * Add the newly created object to the viewer's selected objects.
	 */
	private void selectAddedObject(EditPartViewer viewer) {
		final Object model = getCreateRequest().getNewObject();
		if (model == null || viewer == null)
			return;
		Object editpart = viewer.getEditPartRegistry().get(model);
		viewer.flush();
		if (editpart != null && editpart instanceof EditPart
				&& ((EditPart) editpart).isSelectable()) {
			// Force the new object to get positioned in the viewer.
			viewer.select((EditPart) editpart);
		}
	}

	/**
	 * Sets the creation factory used to create the new edit parts.
	 * 
	 * @param factory
	 *            the factory
	 */
	public void setFactory(CreationFactory factory) {
		this.factory = factory;
	}

	/**
	 * Sets the location (and size if the user is performing size-on-drop) of
	 * the request.
	 * 
	 * @see org.eclipse.gef.tools.TargetingTool#updateTargetRequest()
	 */
	protected void updateTargetRequest() {
		CreateRequest createRequest = getCreateRequest();
		if (isInState(STATE_DRAG_IN_PROGRESS)) {
			Point loq = getStartLocation();
			Rectangle bounds = new Rectangle(loq, loq);
			bounds.union(loq.getTranslated(getDragMoveDelta()));
			createRequest.setSize(bounds.getSize());
			createRequest.setLocation(bounds.getLocation());
			createRequest.getExtendedData().clear();
			createRequest.setSnapToEnabled(!getCurrentInput().isModKeyDown(
					MODIFIER_NO_SNAPPING));
			if (helper != null && createRequest.isSnapToEnabled()) {
				PrecisionRectangle baseRect = new PrecisionRectangle(bounds);
				PrecisionRectangle result = baseRect.getPreciseCopy();
				helper.snapRectangle(createRequest, PositionConstants.NSEW,
						baseRect, result);
				createRequest.setLocation(result.getLocation());
				createRequest.setSize(result.getSize());
			}
			enforceConstraintsForSizeOnDropCreate(createRequest);
		} else {
			createRequest.setSize(null);
			createRequest.setLocation(getLocation());
			createRequest.setSnapToEnabled(false);
		}
	}

	/**
	 * Ensures size constraints (by default minimum and maximum) are respected
	 * by the given request. May be overwritten by clients to enforce additional
	 * constraints.
	 * 
	 * @since 3.7
	 */
	protected void enforceConstraintsForSizeOnDropCreate(CreateRequest request) {
		CreateRequest createRequest = (CreateRequest) getTargetRequest();
		if (createRequest.getSize() != null) {
			// ensure create request respects minimum and maximum size
			// constraints
			PrecisionRectangle constraint = new PrecisionRectangle(
					createRequest.getLocation(), createRequest.getSize());
			((GraphicalEditPart) getTargetEditPart()).getContentPane()
					.translateToRelative(constraint);
			constraint.setSize(Dimension.max(constraint.getSize(),
					getMinimumSizeFor(createRequest)));
			constraint.setSize(Dimension.min(constraint.getSize(),
					getMaximumSizeFor(createRequest)));
			((GraphicalEditPart) getTargetEditPart()).getContentPane()
					.translateToAbsolute(constraint);
			createRequest.setSize(constraint.getSize());
		}
	}

	/**
	 * Determines the <em>maximum</em> size for CreateRequest's size on drop. It
	 * is called from
	 * {@link #enforceConstraintsForSizeOnDropCreate(CreateRequest)} during
	 * creation. By default, a large <code>Dimension</code> is returned.
	 * 
	 * @param request
	 *            the request.
	 * @return the minimum size
	 * @since 3.7
	 */
	protected Dimension getMaximumSizeFor(CreateRequest request) {
		return IFigure.MAX_DIMENSION;
	}

	/**
	 * Determines the <em>minimum</em> size for CreateRequest's size on drop. It
	 * is called from
	 * {@link #enforceConstraintsForSizeOnDropCreate(CreateRequest)} during
	 * creation. By default, a small <code>Dimension</code> is returned.
	 * 
	 * @param request
	 *            the request.
	 * @return the minimum size
	 * @since 3.7
	 */
	protected Dimension getMinimumSizeFor(CreateRequest request) {
		return IFigure.MIN_DIMENSION;
	}
	
	/************************************************************************************************
	 * 
	 * CLASS 2
	 * 
	 ************************************************************************************************/
	
	// temporarily disable the autoexpose helper since it interferes with menu selection.
		// see defect RATLC00525995	
		/**
		 * the anti scroll flag
		 */
		protected boolean antiScroll = false;
		
		/** Constant used to specify no point has been defined for the shape creation
		 * request.  It will be up to the layout edit policy to lay the shape in 
		 * the correct position*/
		private static final Point UNDEFINED_POINT = LayoutHelper.UNDEFINED.getLocation();
		/** the requested element kind */
		private IElementType elementType =null;

		static private Cursor CURSOR_SHAPE = new Cursor(Display.getDefault(),
			DiagramUIPluginImages.DESC_SHAPECURSOR_SOURCE.getImageData(),
			DiagramUIPluginImages.DESC_SHAPECURSOR_MASK.getImageData(), 7, 7);

		static private Cursor CURSOR_SHAPE_NOT = new Cursor(Display.getDefault(),
			DiagramUIPluginImages.DESC_NOSHAPECURSOR_SOURCE.getImageData(),
			DiagramUIPluginImages.DESC_NOSHAPECURSOR_MASK.getImageData(), 7, 7);		

		/**
		 * Gets the preferences hint that is to be used to find the appropriate
		 * preference store from which to retrieve diagram preference values. The
		 * preference hint is mapped to a preference store in the preference
		 * registry <@link DiagramPreferencesRegistry>.
		 * 
		 * @return the preferences hint
		 */
		protected PreferencesHint getPreferencesHint() {
			EditPartViewer viewer = getCurrentViewer();
			if (viewer != null) {
				RootEditPart rootEP = viewer.getRootEditPart();
				if (rootEP instanceof IDiagramPreferenceSupport) {
					return ((IDiagramPreferenceSupport) rootEP)
						.getPreferencesHint();
				}
			}
			return PreferencesHint.USE_DEFAULTS;
		}

		/**
		 * Since both the view and semantic requests contain results we need to free
		 * them when the tool is deactivated
		 */
		public void deactivate() {
			super.deactivate();
			setTargetRequest(null);
		}

		protected void performCreation(int button) {
			
			antiScroll = true;
					
			EditPartViewer viewer = getCurrentViewer();
			Command c = getCurrentCommand();
			executeCurrentCommand();
			selectAddedObject(viewer, DiagramCommandStack.getReturnValues(c));
			
			antiScroll = false;
		}

		/**
		 * Select the newly added shape view by default
		 * @param viewer
		 * @param objects
		 */
		protected void selectAddedObject(EditPartViewer viewer, Collection objects) {
			final List editparts = new ArrayList();
			for (Iterator i = objects.iterator(); i.hasNext();) {
				Object object = i.next();
				if (object instanceof IAdaptable) {
					Object editPart =
						viewer.getEditPartRegistry().get(
							((IAdaptable)object).getAdapter(View.class));
					if (editPart != null)
						editparts.add(editPart);
				}
			}

			if (!editparts.isEmpty()) {
				viewer.setSelection(new StructuredSelection(editparts));
			
				// automatically put the first shape into edit-mode
				Display.getCurrent().asyncExec(new Runnable() {
					public void run(){
						EditPart editPart = (EditPart) editparts.get(0);
						//
						// add active test since test scripts are failing on this
						// basically, the editpart has been deleted when this 
						// code is being executed. (see RATLC00527114)
						if ( editPart.isActive() ) {
							editPart.performRequest(new Request(RequestConstants.REQ_DIRECT_EDIT));
							revealEditPart((EditPart)editparts.get(0));
						}
					}
				});
			}
		}

		/**
		*  Handles double click to create the shape in defualt position
		*/
		protected boolean handleDoubleClick(int button) {

			createShapeAt(UNDEFINED_POINT);
			setState(STATE_TERMINAL);
			handleFinished();
			
			return true;

		}
		
		/**
		 * Create the shape corresponding to the current selected tool
		 * on the current diagram at the <code>point</code> specified
		 * @param point to create shape at
		 */
		protected void createShapeAt(Point point) {
			setTargetEditPart(getCurrentViewer().getRootEditPart().getContents());
			getCreateRequest().setLocation(point);
			setCurrentCommand(getCommand());
			performCreation(0);
		}

		/*  Overide to handle use case when the user has selected an tool
		 * and then click on the enter key which translated to SWT.Selection
		 * it will result in the new shape being created
		 * @see org.eclipse.gef.tools.AbstractTool#handleKeyUp(org.eclipse.swt.events.KeyEvent)
		 */
		protected boolean handleKeyUp(KeyEvent e) {
			if (e.keyCode==SWT.Selection){
				setEditDomain(getCurrentViewer().getEditDomain());
				createShapeAt(UNDEFINED_POINT);
				setState(STATE_TERMINAL);
				handleFinished();
				return true;
			}
			return false;
		}

		protected void setTargetEditPart(EditPart editpart) {
			// Set the target request to null if the target editpart has changed.
			// This needs to be done so that the context element (if applicable) in
			// the request can be reset.
			if (editpart != getTargetEditPart()) {
				setTargetRequest(null);
			}
			super.setTargetEditPart(editpart);
		}
		/**
		 * @return Returns the elementType.
		 */
		public IElementType getElementType() {
			return elementType;
		}
		/**
		 * @param elementType The elementType to set.
		 */
		private void setElementType(IElementType elementType) {
			this.elementType = elementType;
		}

		/**
		 * Overridden so that the current tool will remain active (locked) if the
		 * user is pressing the ctrl key.
		 */
		protected void handleFinished() {
			if (!getCurrentInput().isControlKeyDown()) {
				super.handleFinished();
			} else {
				reactivate();
			}
		}
		
			
		/* (non-Javadoc)
		 * @see org.eclipse.gef.tools.CreationTool#handleMove()
		 */
		protected boolean handleMove() {
			if (!antiScroll)
				return super.handleMove();
			return false;
		}
		
		
		/* (non-Javadoc)
		 * @see org.eclipse.gef.tools.TargetingTool#doAutoexpose()
		 */
		protected void doAutoexpose() {
			if (!antiScroll)
				super.doAutoexpose();
			return;
		}
		
		/**
		 * Queries the target editpart for a command.
		 * 
		 * @see org.eclipse.gef.tools.AbstractTool#getCommand()
		 */
		protected Command getCommandSuper() {
			if (getTargetEditPart() == null)
				return null;
			return getTargetEditPart().getCommand(getTargetRequest());
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.gef.tools.TargetingTool#getCommand()
		 */
		protected Command getCommand() {	
			if (!antiScroll)
				return getCommandSuper();
			return null;
		}
		
		/**
		 * Reveals the newly created editpart
		 * @param editPart
		 */
		protected void revealEditPart(EditPart editPart){
			if ((editPart != null)&&
					(editPart.getViewer() != null))
					editPart.getViewer().reveal(editPart);
		}

		/**
		 * Creates the request.
		 * 
		 * @see #createTargetRequest()
		 */
		public final Request createCreateRequest() {
			return createTargetRequest();
	}
		/**
		 * Selects the new shapes and puts them in direct edit mode if desired.
		 * 
		 * @param viewer
		 *            the editpart viewer
		 * @param objects
		 *            the collection of new shapes
		 * @see #selectAddedObject(EditPartViewer, Collection)
		 */
		public final void selectNewShapes(EditPartViewer viewer, Collection objects) {
			selectAddedObject(viewer, objects);
		}
		
		/*****************************************************************************************************
		 * 
		 * CLASS 3
		 * 
		 * 
		 ******************************************************************************************************/
		
		
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.gef.tools.TargetingTool#createTargetRequest()
		 */
		protected Request createTargetRequest() {
			return new CreateUnspecifiedTypeRequest(elementTypes, getPreferencesHint());
		}

}