package de.uni_mannheim.informatik.swt.ebnf.parser.impl;

import java.io.FileInputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

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
		
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("test.ebnf"));
		EBNFLexer lexer = new EBNFLexer(input);
		
		List<? extends Token> tokens = lexer.getAllTokens();
		
		for (Token t : tokens){
			System.out.println("Type: " + EBNFLexer.tokenNames[t.getType()] + " Text: " + t.getText());
		}
		
		//EBNFParser parser = new EBNFParser(lexer.get);
	}

}
