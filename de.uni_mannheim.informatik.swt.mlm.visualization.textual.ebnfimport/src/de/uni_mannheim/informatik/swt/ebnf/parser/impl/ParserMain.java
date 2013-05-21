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
package de.uni_mannheim.informatik.swt.ebnf.parser.impl;

import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFLexer;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFParser;

public class ParserMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception { // TODO: EXCEPTION THROWING NEEDS TO BE REMOVED LATER
		System.out.println("######################");
		System.out.println("# EBNF TO EMF PARSER #");
		System.out.println("######################");
		
//		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("testEBNFs/java5.ebnf"));
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("testEBNFs/test2.ebnf"));
//		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("testEBNFs/factorTest.ebnf"));
//		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("testEBNFs/test.ebnf"));
//		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("testEBNFs/exceptTest.ebnf"));
		
		EBNFLexer lexer = new EBNFLexer(input);

		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		EBNFParser parser = new EBNFParser(tokenStream);
		ParseTree tree = parser.syntax();
		ParseTreeWalker walker = new ParseTreeWalker();
		EBNFListenerEMF listener = new EBNFListenerEMF();
		walker.walk(listener, tree);

		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
		
		Resource resource = resourceSet.createResource(URI.createURI("./m2m/ebnf.ebnfmm"));
		
		resource.getContents().add(listener.getEbnfDescription());
		resource.save(null);
	}

}
