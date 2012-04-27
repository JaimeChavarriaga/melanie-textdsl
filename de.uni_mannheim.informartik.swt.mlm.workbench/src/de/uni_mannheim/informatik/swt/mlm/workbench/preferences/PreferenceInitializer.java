package de.uni_mannheim.informatik.swt.mlm.workbench.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.uni_mannheim.informatik.swt.mlm.workbench.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_ACTIVE_REASONING_ENGINE, "de.uni_mannheim.informatik.swt.mlm.reasoning.service");
		store.setDefault(PreferenceConstants.P_ACTIVE_EMENDATION_ENGINE, "de.uni_mannheim.informatik.swt.mlm.emendation.service");
		store.setDefault(PreferenceConstants.P_ACTIVE_VISUALIZATION_ENGINE, "de.uni_mannheim.informatik.swt.mlm.visualization.service");
		store.setDefault(PreferenceConstants.P_ACTIVE_PROXIMITY_INDICATION_ENGINE, "de.uni_mannheim.informatik.swt.mlm.proximityindication.service");
		store.setDefault(PreferenceConstants.P_ACTIVE_DSL_ENGINE, "de.uni_mannheim.informatik.swt.mlm.dsl.service");
	}

}
