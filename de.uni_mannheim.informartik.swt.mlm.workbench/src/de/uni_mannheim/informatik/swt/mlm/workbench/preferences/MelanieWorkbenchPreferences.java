package de.uni_mannheim.informatik.swt.mlm.workbench.preferences;

import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.uni_mannheim.informatik.swt.mlm.workbench.Activator;
import de.uni_mannheim.informatik.swt.mlm.workbench.ExtensionPointService;

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
		
		//Reasoning Service
		String[] reasoningEngineKeySet = ExtensionPointService.Instance().getId2ReasoningServiceConfigurationElement().keySet().toArray(new String[]{});
		String[][] reasoningEngineIds = new String[reasoningEngineKeySet.length][2];
		
		
		for (int i = 0; i < reasoningEngineKeySet.length; i++)
			reasoningEngineIds[i][0] = reasoningEngineIds[i][1] = reasoningEngineKeySet[i];
		
		if (reasoningEngineIds.length == 0)
			reasoningEngineIds = new String[][]{{"", ""}};
		
		addField(new ComboFieldEditor(
				PreferenceConstants.P_ACTIVE_REASONING_ENGINE,
					"Active Reasoning Engine",
					reasoningEngineIds,
					getFieldEditorParent()
					)
		);

		
		//Emendation Service
		String[] refactoringEngineKeySet = ExtensionPointService.Instance().getId2EmendationServiceConfigurationElement().keySet().toArray(new String[]{});
		String[][] reafctoringEngineIds = new String[refactoringEngineKeySet.length][2];
		
		for (int i = 0; i < refactoringEngineKeySet.length; i++)
			reafctoringEngineIds[i][0] = reafctoringEngineIds[i][1] = refactoringEngineKeySet[i];
		
		addField(new ComboFieldEditor(
				PreferenceConstants.P_ACTIVE_EMENDATION_ENGINE,
					"Active Emendation Engine",
					reafctoringEngineIds,
					getFieldEditorParent()
					)
		);
		
		//DSL Service
		String[] dslEngineKeySet = ExtensionPointService.Instance().getId2DSLServiceConfigurationElement().keySet().toArray(new String[]{});
		String[][] dslEngineIds = new String[dslEngineKeySet.length][2];
		
		for (int i = 0; i < dslEngineKeySet.length; i++)
			dslEngineIds[i][0] = dslEngineIds[i][1] = dslEngineKeySet[i];
		
		addField(new ComboFieldEditor(
				PreferenceConstants.P_ACTIVE_DSL_ENGINE,
					"Active DSL Engine",
					dslEngineIds,
					getFieldEditorParent()
					)
		);
		
		//Visualization Service
		String[] visualizationEngineKeySet = ExtensionPointService.Instance().getId2VisualizationServiceConfigurationElement().keySet().toArray(new String[]{});
		String[][] visualizationEngineIds = new String[visualizationEngineKeySet.length][2];
		
		for (int i = 0; i < visualizationEngineKeySet.length; i++)
			visualizationEngineIds[i][0] = visualizationEngineIds[i][1] = visualizationEngineKeySet[i];
		
		addField(new ComboFieldEditor(
				PreferenceConstants.P_ACTIVE_VISUALIZATION_ENGINE,
					"Active Visualization Engine",
					visualizationEngineIds,
					getFieldEditorParent()
					)
		);
		
		//Proximity Indication Service
		String[] proximityIndicationEngineKeySet = ExtensionPointService.Instance().getId2ProximityIndicationServiceConfigurationElement().keySet().toArray(new String[]{});
		String[][] proximityIndicationEngineIds = new String[proximityIndicationEngineKeySet.length][2];
		
		for (int i = 0; i < proximityIndicationEngineKeySet.length; i++)
			proximityIndicationEngineIds[i][0] = proximityIndicationEngineIds[i][1] = proximityIndicationEngineKeySet[i];
		
		addField(new ComboFieldEditor(
				PreferenceConstants.P_ACTIVE_PROXIMITY_INDICATION_ENGINE,
					"Active Proximity Indication Engine",
					proximityIndicationEngineIds,
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