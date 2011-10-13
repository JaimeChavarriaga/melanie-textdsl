package de.uni_mannheim.informatik.swt.plm.refactoring.service.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Feature;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;
import de.uni_mannheim.informatik.swt.plm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.plm.workbench.interfaces.IReasoningService;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class DeleteFeatureCommand extends AbstractHandler {
	
	public final static String ID = "de.uni_mannheim.informatik.swt.plm.refactoring.service.commands.deletefeaturecommand";
	
	/**
	 * The constructor.
	 */
	public DeleteFeatureCommand() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		Feature featureToChange = (Feature)event.getObjectParameterForExecution("feature");
		Clabject containingClabject = (Clabject)featureToChange.eContainer();
		
		List<Clabject> instances = containingClabject.getModelInstances();
		
		CompoundCommand refactoringCommand = new CompoundCommand("Refactoring");
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(featureToChange);
		
		for (Clabject instance: instances)
			for (Feature feature : instance.getAllFeatures())
				try {
					if (ExtensionPointService.Instance().getActiveReasoningService().run(IReasoningService.FEATURE_CONFORMS, new Object[] {featureToChange, feature})){
						refactoringCommand.append(RemoveCommand.create(domain, feature));
					}
						
				} catch (CoreException e) {
					e.printStackTrace();
				}
		
		refactoringCommand.append(RemoveCommand.create(domain, featureToChange));
		domain.getCommandStack().execute(refactoringCommand);
		
		return false;
	}
}
