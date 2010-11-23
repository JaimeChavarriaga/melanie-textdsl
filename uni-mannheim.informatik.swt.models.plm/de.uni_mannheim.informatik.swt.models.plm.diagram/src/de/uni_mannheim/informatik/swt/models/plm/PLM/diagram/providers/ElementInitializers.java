package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
