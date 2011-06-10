package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
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
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Visualizer;

public class VisualizationPropertySectionAbstractPropertySection extends
		AbstractPropertySection {

	public VisualizationPropertySectionAbstractPropertySection() {
		// TODO Auto-generated constructor stub
	}

	private IGraphicalEditPart selectedElement = null;
	
	CCombo visualizerSelectionCombo = null;
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		
		if (selection instanceof StructuredSelection
				&& ((StructuredSelection) selection).getFirstElement() instanceof IGraphicalEditPart)
			selectedElement = (IGraphicalEditPart)((StructuredSelection) selection).getFirstElement();
		
		visualizerSelectionCombo.removeAll();
		
		if (visualizerSelectionCombo == null || ! (selectedElement.resolveSemanticElement() instanceof Element))
			return;
		
		
		Element e = (Element)selectedElement.resolveSemanticElement();
		
		for (Visualizer v : e.getVisualizer())
			visualizerSelectionCombo.add("Visualizer^" + v.getDurability());
		
		if (visualizerSelectionCombo.getItems().length > 0)
			visualizerSelectionCombo.select(0);
	}
	
	@Override
	public void createControls(Composite parent,
			TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		
		Composite composite = getWidgetFactory().createFlatFormComposite(parent);
		
		GridLayout gl = new GridLayout(2, false);
		composite.setLayout(gl);
		
		CLabel visualizerSelectionLabel = getWidgetFactory().createCLabel(composite, "Visualizer");
		visualizerSelectionCombo = getWidgetFactory().createCCombo(composite);
		
		GridData visualizerComboData = new GridData(GridData.FILL, GridData.FILL, true, false);
		visualizerSelectionCombo.setLayoutData(visualizerComboData);
		
		final TableViewer viewer = new TableViewer(composite);
		Table table = viewer.getTable();
		
		GridData tableGridData = new GridData(GridData.FILL, GridData.FILL, true, true);
		tableGridData.horizontalSpan = 2;
		
		table.setLayoutData(tableGridData);
		
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		//Add ContentProviders
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		
		TableViewerColumn column = new TableViewerColumn(viewer, SWT.NONE);
		column.getColumn().setText("Name");
		column.getColumn().setWidth(100);
		
		column.setLabelProvider(new CellLabelProvider() {
			
			@Override
			public void update(ViewerCell cell) {
				cell.setText(((Visualizer)cell.getElement()).toString());
			}
		});
		
		column.setEditingSupport(new EditingSupport(viewer) {
			
			@Override
			protected void setValue(Object element, Object value) {
				//((Visualizer)element).setName(value)
				viewer.refresh(element);
			}
			
			@Override
			protected Object getValue(Object element) {
				return ((Visualizer)element).toString();
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
		
		viewer.setInput(new Object[]{});
		
		/*FormData data = new FormData();
		data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, ITabbedPropertyConstants.VSPACE);*/
		
		
	}

}
