/*******************************************************************************
 * Copyright (c) 2013 University of Mannheim: Chair for Software Engineering.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nikolai Hellwig - initial API and implementation
 ******************************************************************************/

package de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFLexer;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFParser;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.atl.Ebnf2lml;

/**
 * Class for Parsing an EBNF File to an PLM
 */
public class EBNF2EcoreParser {

	/**
	 * Transforming an EBNF file to an PLM file
	 * 
	 * @param inputFile
	 *            the EBNF file
	 * @param outputFile
	 *            the destination PLM file
	 * @param monitor
	 * @throws IOException
	 * @throws ATLCoreException
	 */
	public void transform(File inputFile, String outputFile,
			IProgressMonitor monitor) throws IOException, ATLCoreException {

		// init lexer and read file
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				inputFile));
		EBNFLexer lexer = new EBNFLexer(input);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		EBNFParser parser = new EBNFParser(tokenStream);

		// Parse file and walk parse tree
		ParseTree tree = parser.syntax();
		ParseTreeWalker walker = new ParseTreeWalker();
		EBNFListenerEMF listener = new EBNFListenerEMF();
		walker.walk(listener, tree);

		// generate an ecore temporary XMI serialization
		String tempFilename = "ecore.tmp";
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMLResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI
				.createURI(tempFilename));
		resource.getContents().add(listener.getEbnfDescription());
		resource.save(null);

		// hand file over to the ATL Transformer
		Ebnf2lml runner = new Ebnf2lml();
		runner.loadModels(tempFilename);
		runner.doEbnf2lml(monitor);
		runner.saveModels(outputFile);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("######################");
		System.out.println("# EBNF TO EMF PARSER #");
		System.out.println("######################");

		// ANTLRInputStream input = new ANTLRInputStream(new
		// FileInputStream("testEBNFs/java5.ebnf"));
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				"testEBNFs/factorTest.ebnf"));
		// ANTLRInputStream input = new ANTLRInputStream(new
		// FileInputStream("testEBNFs/factorTest.ebnf"));
		// ANTLRInputStream input = new ANTLRInputStream(new
		// FileInputStream("testEBNFs/test.ebnf"));
		// ANTLRInputStream input = new ANTLRInputStream(new
		// FileInputStream("testEBNFs/exceptTest.ebnf"));

		EBNFLexer lexer = new EBNFLexer(input);

		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		EBNFParser parser = new EBNFParser(tokenStream);
		ParseTree tree = parser.syntax();
		ParseTreeWalker walker = new ParseTreeWalker();
		EBNFListenerEMF listener = new EBNFListenerEMF();
		walker.walk(listener, tree);

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMLResourceFactoryImpl());

		Resource resource = resourceSet.createResource(URI
				.createURI("./m2m/ebnf.ebnfmm"));

		resource.getContents().add(listener.getEbnfDescription());
		resource.save(null);
	}

}
