/*******************************************************************************
 * Copyright (c) 2011, 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralph Gerbig - initial API and implementation and initial documentation
 *******************************************************************************/

package de.uni_mannheim.informatik.swt.mlm.reasoning.service.view.views;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.models.reasoningresult.ReasoningResult.provider.ReasoningResultItemProviderAdapterFactory;

public class ReasoningView extends ViewPart implements IPropertyChangeListener, ISelectionProvider {

	private ComposedAdapterFactory factory;
	private PropertySheetPage propertySheetPage;
	private TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
	
	private Element reasoningSource = null;
	private Text reasoningSourceText = null;
	private Element reasoningTarget = null;
	private Text reasoningTargetText = null;
	
	/**
	 * Called whenever the reasoning history changes
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		if (event.getNewValue() instanceof List<?>){
			//Take the last (= newest element from the list)
			List<?> modelList = ((List<?>)event.getNewValue());
			ReasoningResultModel model = (ReasoningResultModel)modelList.get(modelList.size() - 1);
			treeViewer.setInput(model);
			treeViewer.refresh();
			treeViewer.expandAll();
			
			comboViewer.setInput(modelList);
			ISelection selection = new StructuredSelection(model);
			comboViewer.setSelection(selection);
			comboViewer.refresh();
		}
	}
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "de.uni_mannheim.informatik.swt.mlm.reasoning.service.view";

	private TreeViewer treeViewer;
	ComboViewer comboViewer;
	private DrillDownAdapter drillDownAdapter;
	private Action collapseAllAction;
//	private Action doubleClickAction;

	
	/**
	 * The constructor.
	 */
	public ReasoningView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		
		//parent.setLayout(new GridLayout(1, false));
		
		parent.setLayout(new FillLayout());
		
		CTabFolder tabFolder = new CTabFolder(parent, SWT.BOTTOM);
		tabFolder.setSimple(false);
		
		//****************************************
		//Tab Page - Reasoning Result
		//****************************************
		CTabItem reasoningResultPage = new CTabItem(tabFolder, SWT.NONE);
		reasoningResultPage.setText("Reasoning Results");
		Composite reasoningResultComposite = new Composite(tabFolder, SWT.NONE);
		reasoningResultComposite.setLayout(new GridLayout(1, false));
		reasoningResultPage.setControl(reasoningResultComposite);
		
		GridData reasoningSelectionGroupGridData = new GridData();
		reasoningSelectionGroupGridData.grabExcessHorizontalSpace = true;
		reasoningSelectionGroupGridData.horizontalAlignment = SWT.FILL;
		
		Group reasoningSelectionGroup = new Group(reasoningResultComposite, SWT.SHADOW_ETCHED_IN);
		reasoningSelectionGroup.setText("Reasoning Selection");
		reasoningSelectionGroup.setLayoutData(reasoningSelectionGroupGridData);
		reasoningSelectionGroup.setLayout(new GridLayout(1, false));
		
		GridData reasoningSelectionGridData = new GridData();
		reasoningSelectionGridData.grabExcessHorizontalSpace = true;
		reasoningSelectionGridData.horizontalAlignment = SWT.FILL;
		
		reasoningSourceText = new Text(reasoningSelectionGroup, SWT.SINGLE | SWT.BORDER);
		reasoningSourceText.setMessage("Type");
		reasoningSourceText.setLayoutData(reasoningSelectionGridData);
		
		ComboViewer reasoningActionComboViewer = new ComboViewer(reasoningSelectionGroup, SWT.READ_ONLY);
		reasoningActionComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		reasoningActionComboViewer.setInput(new String[]{"conformsTo"});
		reasoningActionComboViewer.getCombo().setLayoutData(reasoningSelectionGridData);
		reasoningActionComboViewer.getCombo().select(0);
		
		reasoningTargetText = new Text(reasoningSelectionGroup, SWT.SINGLE | SWT.BORDER);
		reasoningTargetText.setMessage("Instance");
		reasoningTargetText.setLayoutData(reasoningSelectionGridData);
		
		GridData reasoningResultGroupGridData = new GridData();
		reasoningResultGroupGridData.grabExcessHorizontalSpace = true;
		reasoningResultGroupGridData.horizontalAlignment = SWT.FILL;
		reasoningResultGroupGridData.grabExcessVerticalSpace = true;
		reasoningResultGroupGridData.verticalAlignment = SWT.FILL;
		
		Group reasoningResultGroup = new Group(reasoningResultComposite, SWT.SHADOW_ETCHED_IN);
		reasoningResultGroup.setText("Reasoning Result");
		reasoningResultGroup.setLayoutData(reasoningResultGroupGridData);
		reasoningResultGroup.setLayout(new GridLayout(1, false));
		
		factory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		GridData treeViewGridData = new GridData();
		treeViewGridData.grabExcessHorizontalSpace = true;
		treeViewGridData.horizontalAlignment = SWT.FILL;
		treeViewGridData.grabExcessVerticalSpace = true;
		treeViewGridData.verticalAlignment = SWT.FILL;
		
		GridData comboViewGridData = new GridData();
		comboViewGridData.grabExcessHorizontalSpace = true;
		comboViewGridData.horizontalAlignment = SWT.FILL;
		
		factory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		factory.addAdapterFactory(new ReasoningResultItemProviderAdapterFactory());
		factory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
				
		comboViewer = new ComboViewer(reasoningResultGroup, SWT.READ_ONLY);
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		comboViewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		comboViewer.getCombo().setLayoutData(comboViewGridData);
		
		comboViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection){
					treeViewer.setInput(((IStructuredSelection)event.getSelection()).getFirstElement());
					treeViewer.refresh();
					treeViewer.expandAll();
				}
			}
		});
		
		treeViewer = new TreeViewer(reasoningResultGroup, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		treeViewer.getTree().setLayoutData(treeViewGridData);
		
		drillDownAdapter = new DrillDownAdapter(treeViewer);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		//viewer.setSorter(new NameSorter());
		
		treeViewer.addSelectionChangedListener(menuBuilder);
		
		//The view needs to register for listening to changes
		try {
			IReasoningService service = ExtensionPointService.Instance().getActiveReasoningService().Instance();
			service.addPropertyChangeListener(this);
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		
//		viewer.setInput(model);
//		viewer.refresh();
		
		makeActions();
//		hookContextMenu();
//		hookDoubleClickAction();
		contributeToActionBars();
		
		getSite().setSelectionProvider(this);
		//This is needed to have the first tab visible
		
		//****************************************
		// Tab Page - Introspection
		//****************************************
		CTabItem introspectPage = new CTabItem(tabFolder, SWT.NONE);
		introspectPage.setText("Introspection");
		Composite introspectResultComposite = new Composite(tabFolder, SWT.NONE);
		introspectResultComposite.setLayout(new GridLayout(1, false));
		introspectPage.setControl(introspectResultComposite); 
		
		tabFolder.setSelection(0);
	}

	ISelectionChangedListener menuBuilder = new ISelectionChangedListener() {
		/**
		 * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener},
		 * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings
		 * that can be added to the selected object and updating the menus accordingly.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			
			setSelection(event.getSelection());
			propertySheetPage.refresh();
		}
	};

	
//	private void hookContextMenu() {
//		MenuManager menuMgr = new MenuManager("#PopupMenu");
//		menuMgr.setRemoveAllWhenShown(true);
//		menuMgr.addMenuListener(new IMenuListener() {
//			public void menuAboutToShow(IMenuManager manager) {
//				ReasoningView.this.fillContextMenu(manager);
//			}
//		});
//		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
//		treeViewer.getControl().setMenu(menu);
//		getSite().registerContextMenu(menuMgr, treeViewer);
//	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		//fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

//	private void fillLocalPullDown(IMenuManager manager) {
//		manager.add(collapseAllAction);
//		manager.add(new Separator());
//	}

//	private void fillContextMenu(IMenuManager manager) {
//		manager.add(collapseAllAction);
//		manager.add(new Separator());
//		drillDownAdapter.addNavigationActions(manager);
//		// Other plug-ins can contribute there actions here
//		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
//	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(collapseAllAction);
		//manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		
		collapseAllAction = new Action() {
			public void run() {
				treeViewer.collapseAll();
			}
		};
		collapseAllAction.setText("Collapse All");
		collapseAllAction.setToolTipText("Collapse All");
		collapseAllAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_ELCL_COLLAPSEALL));
	
//		doubleClickAction = new Action() {
//			public void run() {
//				ISelection selection = treeViewer.getSelection();
//				Object obj = ((IStructuredSelection)selection).getFirstElement();
//				showMessage("Double-click detected on "+obj.toString());
//			}
//		};
	}

//	private void hookDoubleClickAction() {
//		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
//			public void doubleClick(DoubleClickEvent event) {
//				doubleClickAction.run();
//			}
//		});
//	}
//	private void showMessage(String message) {
//		MessageDialog.openInformation(
//			treeViewer.getControl().getShell(),
//			"Reasoning View",
//			message);
//	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		treeViewer.getControl().setFocus();
	}
	
	/**
	 * This is need to return a property sheet page. If not implemented the 
	 * property sheet does not get updated correctly in some cases.
	 * 
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		else if (key.equals(IGotoMarker.class)) {
			return this;
		}
		else {
			return super.getAdapter(key);
		}
	}
	
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			
			propertySheetPage =
				new ExtendedPropertySheetPage((AdapterFactoryEditingDomain)domain) {
					@Override
					public void setSelectionToViewer(List<?> selection) {
						this.setSelectionToViewer(selection);
						this.setFocus();
					}
					
					@Override
					public void setActionBars(IActionBars actionBars) {
						super.setActionBars(actionBars);
						//getActionBarContributor().shareGlobalActions(this, actionBars);
					}
				};
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(factory));
		}
		
		return propertySheetPage;
	}
	
	List<ISelectionChangedListener> listeners = new LinkedList<ISelectionChangedListener>();

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);		
	}
	
	@Override
	public ISelection getSelection() {
		return treeViewer.getSelection();
	}

	@Override
	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	ISelection viewSelection;
	
	@Override
	public void setSelection(ISelection selection) {
		
		for (ISelectionChangedListener l : listeners)
			l.selectionChanged(new SelectionChangedEvent(treeViewer, selection));
		
		viewSelection = selection;
	}
	
	@Override
	public void dispose() {
		//Throws exception if workbench is closing -> We do not care about this
		try{
			getSite().setSelectionProvider(null);
			propertySheetPage = null;
		}catch(Exception ex){}
		
		super.dispose();
	}
	
	public void setReasoningSource(Element source){
		reasoningSource = source;
		reasoningSourceText.setText(source.getName());
	}
	
	public Element getReasoningSource(){
		return reasoningSource;
	}
	
	public void setReasoningTarget(Element target){
		reasoningTarget = target;
		reasoningTargetText.setText(target.getName());
	}
	
	public Element getReasoningTarget(){
		return reasoningTarget;
	}
}