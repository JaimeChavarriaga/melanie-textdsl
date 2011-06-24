package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Connection;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer;
import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ConnectionEditPart;
import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMFactoryImpl;
import de.uni_mannheim.informatik.swt.models.plm.PLM.impl.PLMPackageImpl;

public class AssociatePropertySectionAbstractPropertySection extends
		AbstractPropertySection {

	public AssociatePropertySectionAbstractPropertySection() {
		// TODO Auto-generated constructor stub
	}

	private IGraphicalEditPart selectedElement = null;
	
	
	CCombo associateSelectionCombo = null;
	Connection connection = null;
	List<Clabject> associates = null;
	TableViewer viewer;
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		
		if (selection instanceof StructuredSelection
				&& ((StructuredSelection) selection).getFirstElement() instanceof IGraphicalEditPart)
			selectedElement = (IGraphicalEditPart)((StructuredSelection) selection).getFirstElement();
		
		associateSelectionCombo.removeAll();
		
		if (associateSelectionCombo == null || ! (selectedElement.resolveSemanticElement() instanceof Connection))
			return;
		
		
		connection = (Connection)selectedElement.resolveSemanticElement();
		
		for (Clabject associate : connection.getParticipant())
			associateSelectionCombo.add(associate.getName());
		
		associates = connection.getParticipant();
		
		if (associateSelectionCombo.getItems().length > 0)
		{
			associateSelectionCombo.select(0);
			viewer.setInput(new Object[]{"role=" + connection.getRoleName().get(0), "navigable= " + connection.getIsNavigable().get(0), "lower= " + connection.getLower().get(0), "upper= " + connection.getUpper().get(0)});
			viewer.refresh();
		}
	}
	
	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		
		GridLayout gl = new GridLayout(5, false);
		composite.setLayout(gl);
		
		CLabel visualizerSelectionLabel = getWidgetFactory().createCLabel(composite, "Associate");
		
		associateSelectionCombo = getWidgetFactory().createCCombo(composite);
		
		Button addButton = getWidgetFactory().createButton(composite, "Add", SWT.NONE);
		Button removeButton = getWidgetFactory().createButton(composite, "Remove", SWT.NONE);
		Button editButton = getWidgetFactory().createButton(composite, "Edit", SWT.NONE);
		
		viewer = new TableViewer(composite, SWT.FULL_SELECTION);
		
		associateSelectionCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				int index = associateSelectionCombo.getSelectionIndex();
				viewer.setInput(new Object[]{"role= " + connection.getRoleName().get(index), "navigable= " + connection.getIsNavigable().get(index), "lower= " + connection.getLower().get(index), "upper= " + connection.getUpper().get(index)});
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				int index = associateSelectionCombo.getSelectionIndex();
				viewer.setInput(new Object[]{"role= " + connection.getRoleName().get(index), "navigable= " + connection.getIsNavigable().get(index), "lower= " + connection.getLower().get(index), "upper= " + connection.getUpper().get(index)});
			}
		});
		
		GridData visualizerComboData = new GridData(GridData.FILL, GridData.CENTER, true, false);
		associateSelectionCombo.setLayoutData(visualizerComboData);
		
		Table table = viewer.getTable();
		
		GridData tableGridData = new GridData(GridData.FILL, GridData.FILL, true, true);
		tableGridData.horizontalSpan = 5;
		
		table.setLayoutData(tableGridData);
		
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		//Add ContentProviders
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		
		TableViewerColumn keyColumn = new TableViewerColumn(viewer, SWT.NONE);
		keyColumn.getColumn().setText("Name");
		keyColumn.getColumn().setWidth(200);
		
		keyColumn.setLabelProvider(new CellLabelProvider() {
			
			@Override
			public void update(ViewerCell cell) {
				String keyValuePair = (String)cell.getElement();
				String key = keyValuePair.substring(0, keyValuePair.indexOf("=")).trim();
				cell.setText(key);
			}
		});
		
		TableViewerColumn valueColumn = new TableViewerColumn(viewer, SWT.NONE);
		valueColumn.getColumn().setText("Value");
		valueColumn.getColumn().setWidth(100);
		
		valueColumn.setLabelProvider(new CellLabelProvider() {
			
			@Override
			public void update(ViewerCell cell) {
				String keyValuePair = (String)cell.getElement();
				int equalIndex = keyValuePair.indexOf("=") + 1;
				String value = keyValuePair.substring(equalIndex, keyValuePair.length()).trim();
				cell.setText(value);
			}
		});
		
		valueColumn.setEditingSupport(new EditingSupport(viewer) {
			
			@Override
			protected void setValue(Object element, Object value) {
			
				int index = associateSelectionCombo.getSelectionIndex();
				
				String keyValuePair = (String)element;
				String key = keyValuePair.substring(0, keyValuePair.indexOf("=")).trim();
				
				EAttribute attr = null;
				
				CommandParameter parameters = null;
				
				try{
				if ("lower".equals(key))
				{
					attr = PLMPackageImpl.eINSTANCE.getConnection_Lower();
					parameters = new CommandParameter(connection, attr, Integer.parseInt((String)value), index);
				}	
				else if ("upper".equals(key))
				{
					attr = PLMPackageImpl.eINSTANCE.getConnection_Upper();
					parameters = new CommandParameter(connection, attr, Integer.parseInt((String)value), index);
				}
				else if ("navigable".equals(key))
				{
					attr = PLMPackageImpl.eINSTANCE.getConnection_IsNavigable();
					parameters = new CommandParameter(connection, attr, Boolean.parseBoolean((String)value), index);
				}
				else if ("role".equals(key))
				{
					attr = PLMPackageImpl.eINSTANCE.getConnection_RoleName();
					parameters = new CommandParameter(connection, attr, value, index);
				}
				else
					return;
				

				Command cmd = selectedElement.getEditingDomain().createCommand(SetCommand.class, parameters);
				selectedElement.getEditingDomain().getCommandStack().execute(cmd);
				
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
				
				
				if (selectedElement instanceof ConnectionEditPart)
					((ConnectionEditPart)selectedElement).updateView(false);
				
				
				//We need to change the source of the viewer again as we do not change
				//the underlying array in the connection -> See visualization propertiesview
				viewer.setInput(new Object[]{"role= " + connection.getRoleName().get(index), "navigable= " + connection.getIsNavigable().get(index), "lower= " + connection.getLower().get(index), "upper= " + connection.getUpper().get(index)});
				
				viewer.refresh();
			}
			
			@Override
			protected Object getValue(Object element) {
				String keyValuePair = (String)element;
				int equalIndex = keyValuePair.indexOf("=") + 1;
				String value = keyValuePair.substring(equalIndex, keyValuePair.length()).trim();
				return value;
			}
			
			@Override
			protected CellEditor getCellEditor(Object element) {
				return new TextCellEditor(viewer.getTable());
			}
			
			@Override
			protected boolean canEdit(Object element) {
				return true;
			}
		});
		
		//viewer.setInput(new Object[]{});
		
		/*FormData data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);*/
		
		
	}

}
