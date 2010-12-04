package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class OntologyOntologyLevelCompartmentItemSemanticEditPolicy
		extends
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.policies.PLMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OntologyOntologyLevelCompartmentItemSemanticEditPolicy() {
		super(
				de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Ontology_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes.Model_3004 == req
				.getElementType()) {
			return getGEFWrapper(new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.commands.ModelCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
