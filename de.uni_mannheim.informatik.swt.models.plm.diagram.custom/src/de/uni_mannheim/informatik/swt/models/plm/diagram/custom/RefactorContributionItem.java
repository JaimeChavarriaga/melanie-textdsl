package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import java.util.HashMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.MenuUtil;

import de.uni_mannheim.informatik.swt.plm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IRefactoringService;

public class RefactorContributionItem extends CompoundContributionItem {

	private final static String REFACTORING_SERVICE_ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service";
	
	@Override
	protected IContributionItem[] getContributionItems() {
		
		IRefactoringService refactorer = null;
		
		try {
			refactorer = ExtensionPointService.Instance().getRefactoringService(REFACTORING_SERVICE_ID);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		//No refactoring service found -> return no refactoring options
		if (refactorer == null)
			return new IContributionItem[0];
		
		
		
		
		IContributionItem[] result = new IContributionItem[1];
		CommandContributionItemParameter param = 
				new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), "id", "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.renameclabjectcommand", CommandContributionItem.STYLE_PUSH);
		param.label = "Rename Clabject";
		result[0] = new CommandContributionItem(param);
	
		//MenuUtil.ANY_POPUP
		
		return result;
	}
}
