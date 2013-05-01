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

import de.uni_mannheim.informatik.swt.ebnf.parser.EBNFLexer;
import de.uni_mannheim.informatik.swt.ebnf.parser.EBNFParser;

public class ParserMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception { // TODO: EXCEPTION THROWING NEEDS TO BE REMOVED LATER
		System.out.println("######################");
		System.out.println("# EBNF TO EMF PARSER #");
		System.out.println("######################");
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("test2.ebnf"));
		EBNFLexer lexer = new EBNFLexer(input);

		
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		EBNFParser parser = new EBNFParser(tokenStream);
		ParseTree tree = parser.syntax();
		ParseTreeWalker walker = new ParseTreeWalker();
		EBNFListenerEMF listener = new EBNFListenerEMF();
		walker.walk(listener, tree);
		
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMLResourceFactoryImpl());
		
		Resource resource = resourceSet.createResource(URI.createURI("./ebnf.ebnfmm"));
		
		resource.getContents().add(listener.getEbnfDescription());
		resource.save(null);
	}

}
