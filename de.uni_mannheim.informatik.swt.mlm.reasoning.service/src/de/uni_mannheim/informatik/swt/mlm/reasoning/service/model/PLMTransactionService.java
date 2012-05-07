package de.uni_mannheim.informatik.swt.mlm.reasoning.service.model;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;

import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Element;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Model;
import de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage;

public class PLMTransactionService {
	
	Model model;
	TransactionalEditingDomain domain;
	CompoundCommand cCommand;
	
	public PLMTransactionService(Model model, String name) {
		this.model = model;
		domain = TransactionUtil.getEditingDomain(model);
		cCommand = new CompoundCommand(name);
	}
	
	public void newModelElement(Element element) {
		Command command = AddCommand.create(domain, model, PLMPackage.eINSTANCE.getModel_Content(), element);
		cCommand.append(command);
	}
	
	public void execute() {
		try {		
			ExtensionPointService.Instance().getActiveEmendationService().stopListening(EcoreUtil.getRootContainer(model));
			domain.getCommandStack().execute(cCommand);
			ExtensionPointService.Instance().getActiveEmendationService().startListening(EcoreUtil.getRootContainer(model));
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
