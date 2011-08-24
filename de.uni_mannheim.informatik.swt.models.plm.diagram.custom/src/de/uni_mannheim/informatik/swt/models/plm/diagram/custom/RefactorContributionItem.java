package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import java.util.HashMap;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.MenuUtil;

public class RefactorContributionItem extends CompoundContributionItem {

	@Override
	protected IContributionItem[] getContributionItems() {
		IContributionItem[] result = new IContributionItem[1];
		CommandContributionItemParameter param = 
				new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), "id", "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.renameclabjectcommand", CommandContributionItem.STYLE_PUSH);
		param.label = "Rename Clabject";
		result[0] = new CommandContributionItem(param);
	
		//MenuUtil.ANY_POPUP
		
		return result;
	}
}
