package uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy
		extends
		uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModelItemSemanticEditPolicy() {
		super(
				uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Model_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PNode_2001 == req
				.getElementType()) {
			return getGEFWrapper(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.PNodeCreateCommand(
					req));
		}
		if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.PRelationship_2002 == req
				.getElementType()) {
			return getGEFWrapper(new uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.PRelationshipCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
