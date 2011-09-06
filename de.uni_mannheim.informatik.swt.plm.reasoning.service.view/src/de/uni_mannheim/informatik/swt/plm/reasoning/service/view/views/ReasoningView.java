package de.uni_mannheim.informatik.swt.plm.reasoning.service.view.views;

import java.util.Iterator;
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
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.CompositeCheck;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.ReasoningResultModel;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.impl.ReasoningResultFactoryImpl;
import de.uni_mannheim.informatik.swt.models.plm.reasoningresult.ReasoningResult.provider.ReasoningResultItemProviderAdapterFactory;
import de.uni_mannheim.informatik.swt.plm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

public class ReasoningView extends ViewPart implements IPropertyChangeListener, ISelectionProvider {

	private static final String REASONING_ENGINE_ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service";
	private ComposedAdapterFactory factory;
	PropertySheetPage propertySheetPage;
	TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
	
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
			
			comboViewer.setInput(modelList);
			ISelection selection = new StructuredSelection(model);
			comboViewer.setSelection(selection);
			comboViewer.refresh();
		}
	}
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "de.uni_mannheim.informatik.swt.plm.reasoning.service.view.reasoningview";

	private TreeViewer treeViewer;
	ComboViewer comboViewer;
	private DrillDownAdapter drillDownAdapter;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;

	
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
		
		parent.setLayout(new GridLayout(1, false));
		
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
				
		comboViewer = new ComboViewer(parent, SWT.READ_ONLY);
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		comboViewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		comboViewer.getCombo().setLayoutData(comboViewGridData);
		
		comboViewer.addPostSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (event.getSelection() instanceof IStructuredSelection){
					treeViewer.setInput(((IStructuredSelection)event.getSelection()).getFirstElement());
					treeViewer.refresh();
				}
			}
		});
		
		treeViewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		treeViewer.getTree().setLayoutData(treeViewGridData);
		
//		drillDownAdapter = new DrillDownAdapter(viewer);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(factory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(factory));
		//viewer.setSorter(new NameSorter());
		
		treeViewer.addSelectionChangedListener(menuBuilder);
		
		//The view needs to register for listening to changes
		try {
			IReasoningService service = ExtensionPointService.Instance().getReasoningService(REASONING_ENGINE_ID).Instance();
			service.addPropertyChangeListener(this);
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		
//		viewer.setInput(model);
//		viewer.refresh();
		
//		makeActions();
//		hookContextMenu();
//		hookDoubleClickAction();
//		contributeToActionBars();
		
		getSite().setSelectionProvider(this);
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

	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ReasoningView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		treeViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, treeViewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = treeViewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		treeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			treeViewer.getControl().getShell(),
			"Reasoning View",
			message);
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
}