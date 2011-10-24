package de.uni_mannheim.informatik.swt.plm.workbench.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.uni_mannheim.informatik.swt.plm.workbench.Activator;

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
		store.setDefault(PreferenceConstants.P_ACTIVE_REASONING_ENGINE, "de.uni_mannheim.informatik.swt.plm.reasoning.service");
		store.setDefault(PreferenceConstants.P_ACTIVE_REFACTORING_ENGINE, "de.uni_mannheim.informatik.swt.plm.refactoring.service");
		store.setDefault(PreferenceConstants.P_ACTIVE_VISUALIZATION_ENGINE, "de.uni_mannheim.informatik.swt.plm.visualization.service");
	}

}
