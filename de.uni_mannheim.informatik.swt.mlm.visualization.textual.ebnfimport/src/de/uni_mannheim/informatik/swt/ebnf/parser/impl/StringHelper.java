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

/**
 * Helper Library for trimming EBNF Quoted Terminal-Strings
 * @author nikolaihellwig
 *
 */
public final class StringHelper {
	
	
	/**
	 * remove " or ' depending on first character
	 * @param input Input-String
	 * @return trimmed String
	 */
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
