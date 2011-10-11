package de.uni_mannheim.informatik.swt.plm.workbench.preferences;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.uni_mannheim.informatik.swt.plm.workbench.Activator;
import de.uni_mannheim.informatik.swt.plm.workbench.ExtensionPointService;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class MelanieWorkbenchPreferences
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public MelanieWorkbenchPreferences() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Configuration for MelAniE's extension points");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		
		String[] reasoningEngineKeySet = ExtensionPointService.Instance().getId2ReasoningServiceConfigurationElement().keySet().toArray(new String[]{});
		String[][] reasoningEngineIds = new String[reasoningEngineKeySet.length][2];
		
		for (int i = 0; i < reasoningEngineKeySet.length; i++)
			reasoningEngineIds[i][0] = reasoningEngineIds[i][1] = reasoningEngineKeySet[i];
		
		addField(new ComboFieldEditor(
				PreferenceConstants.P_ACTIVE_REFACTORING_ENGINE,
					"Active Reasoning Engine",
					reasoningEngineIds,
					getFieldEditorParent()
					)
		);

		String[] refactoringEngineKeySet = ExtensionPointService.Instance().getId2RefactoringServiceConfigurationElement().keySet().toArray(new String[]{});
		String[][] reafctoringEngineIds = new String[reasoningEngineKeySet.length][2];
		
		for (int i = 0; i < reasoningEngineKeySet.length; i++)
			reafctoringEngineIds[i][0] = reafctoringEngineIds[i][1] = refactoringEngineKeySet[i];
		
		addField(new ComboFieldEditor(
				PreferenceConstants.P_ACTIVE_REFACTORING_ENGINE,
					"Active Refactoring Engine",
					reafctoringEngineIds,
					getFieldEditorParent()
					)
		);
		
		String[] visualizationEngineKeySet = ExtensionPointService.Instance().getId2VisualizationServiceConfigurationElement().keySet().toArray(new String[]{});
		String[][] visualizationEngineIds = new String[reasoningEngineKeySet.length][2];
		
		for (int i = 0; i < reasoningEngineKeySet.length; i++)
			visualizationEngineIds[i][0] = visualizationEngineIds[i][1] = visualizationEngineKeySet[i];
		
		addField(new ComboFieldEditor(
				PreferenceConstants.P_ACTIVE_REFACTORING_ENGINE,
					"Active Visualization Engine",
					visualizationEngineIds,
					getFieldEditorParent()
					)
		);
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}