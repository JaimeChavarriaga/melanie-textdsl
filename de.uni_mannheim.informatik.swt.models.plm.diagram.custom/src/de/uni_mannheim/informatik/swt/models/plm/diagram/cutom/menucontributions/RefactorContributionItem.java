package de.uni_mannheim.informatik.swt.models.plm.diagram.cutom.menucontributions;

import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;

import de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditor;
import de.uni_mannheim.informatik.swt.plm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IRefactoringService;

public class RefactorContributionItem extends CompoundContributionItem {
	
	@Override
	protected IContributionItem[] getContributionItems() {
		
		IRefactoringService refactorer = null;
		
		try {
			refactorer = ExtensionPointService.Instance().getActiveRefactoringService();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		//No refactoring service found -> return no refactoring options
		if (refactorer == null)
			return new IContributionItem[0];
		
		IEditorPart editPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		//Check if PLM diagram editor is opened
		if (! (editPart instanceof PLMDiagramEditor))
			return new IContributionItem[0];
		
		//Check if we have a IStructeredSeclection
		if (! (((PLMDiagramEditor)editPart).getSite().getSelectionProvider().getSelection() instanceof IStructuredSelection))
			return new IContributionItem[0];
		
		IStructuredSelection selection = (IStructuredSelection)((PLMDiagramEditor)editPart).getSite().getSelectionProvider().getSelection();
		
		//Check if exactly one element is selected and the first one is a IGraphicalEditPart
		if (selection.size() != 1 && !(selection.getFirstElement() instanceof IGraphicalEditPart))
			return new IContributionItem[0];
		
		Object[] parts = selection.toArray();
		EObject[] modelElements = new EObject[parts.length];
		
		for (int i = 0; i < parts.length; i++)
			if (parts[i] instanceof IGraphicalEditPart)
				modelElements[i] = ((IGraphicalEditPart)parts[i]).resolveSemanticElement();
		
		return refactorer.getAvailableRefactoringCommands(modelElements).toArray(new IContributionItem[] {});
	}
}