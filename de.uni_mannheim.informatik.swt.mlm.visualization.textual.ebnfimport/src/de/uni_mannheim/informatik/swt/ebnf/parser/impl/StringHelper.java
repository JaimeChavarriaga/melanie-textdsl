package de.uni_mannheim.informatik.swt.ebnf.parser.impl;

public final class StringHelper {
	
	
	public final static String trimQuotes(String input){
		if(input.charAt(0) == '\''){
			input = input.substring(1);
			if(input.charAt(input.length() - 1) == '\''){
				input = input.substring(0, input.length() - 1);
			}
		} else if(input.charAt(0) == '\"'){
			input = input.substring(1);
			if(input.charAt(input.length() - 1) == '\"'){
				input = input.substring(0, input.length() - 1);
			}
		}
		
		return input;
	}

}
