package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
