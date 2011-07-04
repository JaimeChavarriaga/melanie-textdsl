/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/

package de.uni_mannheim.informatik.swt.plm.visualization.editor.views;


import java.util.EventObject;
import java.util.HashMap;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.EditorSite;
import org.eclipse.ui.internal.ViewSite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditor;
import de.uni_mannheim.informatik.swt.models.plm.PLM.presentation.PLMActionBarContributor;
import de.uni_mannheim.informatik.swt.models.plm.PLM.provider.PLMItemProviderAdapterFactory;
import de.uni_mannheim.informatik.swt.models.plm.PLM.util.PLMAdapterFactory;

/**
 * 
 * This class is archived as an example for how to reuse code from the
 * editor plug-in to create a tree outline.
 *
 */
public class ModelOutlineView extends ViewPart implements IMenuListener {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "de.uni_mannheim.informatik.swt.plm.visualization.editor.views.VisualizationEditorView";

	protected TreeViewer contentOutlineViewer;
	protected ComposedAdapterFactory adapterFactory;
	protected Composite container;
	//protected AdapterFactoryEditingDomain editingDomain;
	protected EditingDomain editingDomain;
	protected IStatusLineManager contentOutlineStatusLineManager;
	protected PLMActionBarContributor actionbarContributer;
	
	protected Composite getContainer() {
		return container;
	}
	
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new PLMItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		IEditorPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		if (part instanceof PLMDiagramEditor)
		{
			editingDomain = ((PLMDiagramEditor) part).getEditingDomain();
			return;
		}
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener
			(new CommandStackListener() {
				 public void commandStackChanged(final EventObject event) {
					 getContainer().getDisplay().asyncExec
						 (new Runnable() {
							  public void run() {
//								  firePropertyChange(IEditorPart.PROP_DIRTY);
//
//								  // Try to select the affected objects.
//								  //
//								  Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
//								  if (mostRecentCommand != null) {
//									  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
//								  }
//								  if (propertySheetPage != null && !propertySheetPage.getControl().isDisposed()) {
//									  propertySheetPage.refresh();
//								  }
							  }
						  });
				 }
			 });

		// Create the editing domain with a special command stack.
		//
		//editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
	}
	public EditingDomainActionBarContributor getActionBarContributor() {
		//return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
		return null;
	}
	
//	@Override
//	public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
//		super.makeContributions(menuManager, toolBarManager, statusLineManager);
//		contentOutlineStatusLineManager = statusLineManager;
//	}
	
//	@Override
//	public void setActionBars(IActionBars actionBars) {
//		super.setActionBars(actionBars);
//		getActionBarContributor().shareGlobalActions(this, actionBars);
//	}
	
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu= contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}


	@Override
	public void menuAboutToShow(IMenuManager manager) {
		actionbarContributer.menuAboutToShow(manager);
	}


	@Override
	public void createPartControl(Composite parent) {
		
		this.container = parent;
		initializeEditingDomain();
		
		TreeViewer treeViewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL);
        //treeViewer.addSelectionChangedListener(this);
		
		contentOutlineViewer = treeViewer;
		//contentOutlineViewer.addSelectionChangedListener(this);

		// Set up the tree viewer.
		//
		contentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		contentOutlineViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		contentOutlineViewer.setInput(editingDomain.getResourceSet());

		// Make sure our popups work.
		//
		actionbarContributer = new PLMActionBarContributor();
		createContextMenuFor(contentOutlineViewer);

		if (!editingDomain.getResourceSet().getResources().isEmpty()) {
		  // Select the root object in the view.
		  //
		  contentOutlineViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
		}
	}


	@Override
	public void setFocus() {

	}
}