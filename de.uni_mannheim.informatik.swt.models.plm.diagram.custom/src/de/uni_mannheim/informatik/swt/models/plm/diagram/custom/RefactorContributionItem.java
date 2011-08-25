package de.uni_mannheim.informatik.swt.models.plm.diagram.custom;

import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;

import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMFactory;
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
		
		List<IContributionItem> contributionItems = new LinkedList<IContributionItem>();
		
		for(Entry<String, String> entry : refactorer.getAvailableRefactoringCommands(PLMFactory.eINSTANCE.createFeature()).entrySet()){
			CommandContributionItemParameter param = 
					new CommandContributionItemParameter(PlatformUI.getWorkbench().getActiveWorkbenchWindow(), entry.getKey() + ".menuEntry", entry.getKey(), CommandContributionItem.STYLE_PUSH);
			param.label = entry.getValue();
			contributionItems.add(new CommandContributionItem(param));
		}
			
		return contributionItems.toArray(new IContributionItem[] {});
		
	}
}
