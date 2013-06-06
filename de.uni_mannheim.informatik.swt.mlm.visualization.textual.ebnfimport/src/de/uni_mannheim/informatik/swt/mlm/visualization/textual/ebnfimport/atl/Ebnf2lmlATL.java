/*******************************************************************************
 * Copyright (c) 2013 University of Mannheim: Chair for Software Engineering.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	   Obeo	- generation of file template
 *     Nikolai Hellwig - initial API and implementation
 ******************************************************************************/

package de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.atl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.ui.vm.RegularVMLauncher;
import org.eclipse.m2m.atl.core.ui.vm.asm.ASMExtractor;
import org.eclipse.m2m.atl.core.ui.vm.asm.ASMFactory;
import org.eclipse.m2m.atl.core.ui.vm.asm.ASMInjector;
import org.eclipse.m2m.atl.drivers.emf4atl.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;

import de.uni_mannheim.informatik.swt.atl.drivers.plm4atl.AtlPLMModelHandler;

/**
 * Entry point of the 'Ebnf2lml' transformation module.
 */
public class Ebnf2lmlATL {

	/**
	 * The property file. Stores module list, the metamodel and library
	 * locations.
	 * 
	 * @generated
	 */
	private Properties properties;

	/**
	 * The IN model.
	 * 
	 * @generated
	 */
	protected IModel inModel;

	/**
	 * The OUT model.
	 * 
	 * @generated
	 */
	protected IModel outModel;

	/**
	 * Constructor.
	 * 
	 * @generated
	 */
	public Ebnf2lmlATL() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("Ebnf2lml.properties").openStream());
		EPackage.Registry.INSTANCE
				.put(getMetamodelUri("PLM"),
						de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.textualrepresentation.TextualrepresentationPackage.eINSTANCE);
		EPackage.Registry.INSTANCE
				.put(getMetamodelUri("EBNF"),
						de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmPackage.eINSTANCE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE
				.getExtensionToFactoryMap()
				.put("EBNF",
						new de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.impl.EbnfmmFactoryImpl());

		AtlModelHandler.registerDefaultHandler("MLM", new AtlPLMModelHandler());
		AtlModelHandler.registerDefaultHandler("EMF", new AtlEMFModelHandler());
	}

	/**
	 * Load the input and input/output models, initialize output models.
	 * 
	 * @param inModelPath
	 *            the IN model path
	 * @throws ATLCoreException
	 *             if a problem occurs while loading models
	 * 
	 * @generated
	 */
	public void loadModels(String inModelPath) throws ATLCoreException {
		ModelFactory factory = new ASMFactory();
		IInjector injector = new ASMInjector();

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modelHandlerName", "MLM");
		options.put("newModel", "true");
		IReferenceModel plmMetamodel = factory.newReferenceModel(options);
		injector.inject(plmMetamodel, getMetamodelUri("PLM"));

		Map<String, Object> options2 = new HashMap<String, Object>();
		options2.put("modelHandlerName", "EMF");
		options2.put("newModel", "false");
		IReferenceModel ebnfMetamodel = factory.newReferenceModel(options2);
		injector.inject(ebnfMetamodel, getMetamodelUri("EBNF"));

		this.inModel = factory.newModel(ebnfMetamodel, options2);
		injector.inject(inModel, inModelPath);

		this.outModel = factory.newModel(plmMetamodel, options);
	}

	/**
	 * Save the output and input/output models.
	 * 
	 * @param outModelPath
	 *            the OUT model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 * 
	 * @generated
	 */
	public void saveModels(String outModelPath) throws ATLCoreException {
		IExtractor extractor = new ASMExtractor();
		extractor.extract(outModel, outModelPath);
	}

	/**
	 * Transform the models.
	 * 
	 * @param monitor
	 *            the progress monitor
	 * @throws ATLCoreException
	 *             if an error occurs during models handling
	 * @throws IOException
	 *             if a module cannot be read
	 * @throws ATLExecutionException
	 *             if an error occurs during the execution
	 * 
	 * @generated
	 */
	private ILauncher launcher;

	public Object doEbnf2lml(IProgressMonitor monitor) throws ATLCoreException,
			IOException, ATLExecutionException {
		launcher = new RegularVMLauncher();
		// launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(inModel, "IN", "EBNF");
		launcher.addOutModel(outModel, "OUT", "PLM");
		return launcher.launch("run", monitor, launcherOptions,
				(Object[]) getModulesList());
	}

	/**
	 * Returns an Array of the module input streams, parameterized by the
	 * property file.
	 * 
	 * @return an Array of the module input streams
	 * @throws IOException
	 *             if a module cannot be read
	 * 
	 * @generated
	 */
	protected InputStream[] getModulesList() throws IOException {
		InputStream[] modules = null;
		String modulesList = properties.getProperty("Ebnf2lml.modules");
		if (modulesList != null) {
			String[] moduleNames = modulesList.split(",");
			modules = new InputStream[moduleNames.length];
			for (int i = 0; i < moduleNames.length; i++) {
				String asmModulePath = new Path(moduleNames[i].trim())
						.removeFileExtension().addFileExtension("asm")
						.toString();
				modules[i] = getFileURL(asmModulePath).openStream();
			}
		}
		return modules;
	}

	/**
	 * Returns the URI of the given metamodel, parameterized from the property
	 * file.
	 * 
	 * @param metamodelName
	 *            the metamodel name
	 * @return the metamodel URI
	 * 
	 * @generated
	 */
	protected String getMetamodelUri(String metamodelName) {
		return properties.getProperty("Ebnf2lml.metamodels." + metamodelName);
	}

	/**
	 * Returns the file name of the given library, parameterized from the
	 * property file.
	 * 
	 * @param libraryName
	 *            the library name
	 * @return the library file name
	 * 
	 * @generated
	 */
	protected InputStream getLibraryAsStream(String libraryName)
			throws IOException {
		return getFileURL(
				properties.getProperty("Ebnf2lml.libraries." + libraryName))
				.openStream();
	}

	/**
	 * Returns the options map, parameterized from the property file.
	 * 
	 * @return the options map
	 * 
	 * @generated
	 */
	protected Map<String, Object> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("Ebnf2lml.options.")) {
				options.put(
						entry.getKey().toString()
								.replaceFirst("Ebnf2lml.options.", ""), entry
								.getValue().toString());
			}
		}
		return options;
	}

	/**
	 * Finds the file in the plug-in. Returns the file URL.
	 * 
	 * @param fileName
	 *            the file name
	 * @return the file URL
	 * @throws IOException
	 *             if the file doesn't exist
	 * 
	 * @generated
	 */
	protected static URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = Ebnf2lmlATL.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = Ebnf2lmlATL.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}

	/**
	 * Tests if eclipse is running.
	 * 
	 * @return <code>true</code> if eclipse is running
	 * 
	 * @generated
	 */
	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}
