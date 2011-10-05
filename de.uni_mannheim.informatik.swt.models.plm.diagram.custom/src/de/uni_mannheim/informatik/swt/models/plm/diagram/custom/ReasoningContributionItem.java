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
package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
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
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IRefactoringService;

/**
 * @author Ralph
 *
 */
public class ReasoningContributionItem extends CompoundContributionItem {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.actions.CompoundContributionItem#getContributionItems()
	 */
	@Override
	protected IContributionItem[] getContributionItems() {
		IReasoningService reasoner = null;
		
		try {
			reasoner = ExtensionPointService.Instance().getActiveReasoningService();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		//No refactoring service found -> return no refactoring options
		if (reasoner == null)
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
		
		IGraphicalEditPart part = (IGraphicalEditPart)selection.getFirstElement();
		
		List<IContributionItem> contributionItems = new LinkedList<IContributionItem>();
		
		for(Entry<String, String> entry : reasoner.getAvailableReasoningCommands(part.resolveSemanticElement()).entrySet()){
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), entry.getKey() + ".menuEntry", entry.getKey(), CommandContributionItem.STYLE_PUSH);
			param.label = entry.getValue();
			contributionItems.add(new CommandContributionItem(param));
		}
			
		return contributionItems.toArray(new IContributionItem[] {});
	}

}
