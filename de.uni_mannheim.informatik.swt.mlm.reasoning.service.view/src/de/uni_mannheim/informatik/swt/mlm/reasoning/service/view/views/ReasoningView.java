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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ContributionItem;
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
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.mlm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
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
	private Button runButton = null;
	
	ComboViewer reasoningActionComboViewer = null;
	
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
		reasoningSourceText.setLayoutData(reasoningSelectionGridData);
		reasoningSourceText.setEditable(false);
		reasoningSourceText.setText("<<Source>>");
		
		
		reasoningActionComboViewer = new ComboViewer(reasoningSelectionGroup, SWT.READ_ONLY);
		reasoningActionComboViewer.setContentProvider(ArrayContentProvider.getInstance());
		reasoningActionComboViewer.getCombo().setLayoutData(reasoningSelectionGridData);
		reasoningActionComboViewer.getCombo().select(0);
		reasoningActionComboViewer.getCombo().setEnabled(false);
		
		reasoningTargetText = new Text(reasoningSelectionGroup, SWT.SINGLE | SWT.BORDER);
		reasoningTargetText.setLayoutData(reasoningSelectionGridData);
		reasoningTargetText.setEditable(false);
		reasoningTargetText.setText("<<Target>>");
		
		runButton = new Button(reasoningSelectionGroup, SWT.NONE);
		runButton.setEnabled(false);
		runButton.setText("Run !");
		runButton.setLayoutData(reasoningSelectionGroupGridData);
		runButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					IReasoningService service = ExtensionPointService.Instance().getActiveReasoningService();
					if (reasoningTarget != null)
						service.run(name2commandId.get(reasoningActionComboViewer.getCombo().getText()), new EObject[]{reasoningTarget, reasoningSource});
					else
						service.run(name2commandId.get(reasoningActionComboViewer.getCombo().getText()), new EObject[]{reasoningSource});
				} catch (CoreException ex) {
					ex.printStackTrace();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//DO NOTHING
			}
		});
		
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
		
		makeActions();
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

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(collapseAllAction);
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
	}

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
	
	public void setReasoningSource(Element source){
		reasoningSource = source;
		
		String text = source.getName();
		
		if (text == null && source instanceof Connection)
			text = ((Connection)source).getHumanReadableName();
		else if (text == null)
			text = "";
		
		reasoningSourceText.setText(text);
		
		updateUI();
	}
	
	public Element getReasoningSource(){
		return reasoningSource;
	}
	
	public void setReasoningTarget(Element target){
		reasoningTarget = target;
		
		String text = target != null ? target.getName() : "<<Target>>";
		
		if (text == null && target instanceof Connection)
			text = ((Connection)target).getHumanReadableName();
		else if (text == null)
			text = "";
		
		reasoningTargetText.setText(text);
		
		updateUI();
	}
	
	public Element getReasoningTarget(){
		return reasoningTarget;
	}
	
	private void updateUI(){
		String[] possibleOperations = getPossibleReasoningOperations();
		reasoningActionComboViewer.setInput(getPossibleReasoningOperations());
		
		//Target is not checked here because we have resoning operations only working on source
		if (reasoningSource != null && possibleOperations.length > 0){
			reasoningActionComboViewer.getCombo().setEnabled(true);
			reasoningActionComboViewer.getCombo().select(0);
			runButton.setEnabled(true);
		}
	}
	
	Map<String, String> name2commandId = new HashMap<String, String>();
	
	private String[] getPossibleReasoningOperations(){
		try {
			IReasoningService service = ExtensionPointService.Instance().getActiveReasoningService();
			
			List<ContributionItem> items = null;
			
			if (reasoningTarget != null)
				items = service.getAvailableReasoningCommands(new EObject[]{reasoningTarget, reasoningSource});
			else
				items = service.getAvailableReasoningCommands(new EObject[]{reasoningSource});
			
			ArrayList<String> operations = new ArrayList<String>(items.size());
			for (ContributionItem ci : items){
				name2commandId.put(((CommandContributionItem)ci).getCommand().getName(), ((CommandContributionItem)ci).getCommand().getId());
				operations.add(((CommandContributionItem)ci).getCommand().getName());
			}
			
			return operations.toArray(new String[]{});
			
		} catch (CoreException e) {
			e.printStackTrace();
		}catch (NotDefinedException e) {
			e.printStackTrace();
		}

		
		return new String[]{};
	}
}