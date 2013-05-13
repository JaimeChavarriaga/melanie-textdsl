/*
 This Grammar is based on the ISO/IEC Standard 14977 (Extended BNF)
 The comments provides the number of the corresponding clause in the
 standard. This File uses the standard representation of characters not the alternative in Table 2.

 Author: Nikolai Hellwig (nhellwig@icloud.com)

 Part of Masterthesis
 */
grammar EBNF;

/*
	FRAGMENTS for LEXER
 */
// see 7.2
fragment LETTER: [a-zA-Z];

// see 7.2
fragment DECIMAL_DIGIT: [0-9];

fragment START_COMMENT_SYMBOL: '(*';
fragment END_COMMENT_SYMBOL: '*)';

// see 7.5
fragment OTHER_CHARACTER: ' ' | ':' | '+' | '_' | '%' | '@' | 
	'&' | '#' | '$' | '<' | '>' | '\\' | '^' | '`' |
	'~';
	
fragment RESERVED_CHARACTERS: ';' | '.' | '-' | '=' | ',' | '(' | ')' | '[' | ']' | '{' | '}' | '?' | '!' | '*' | '/' | '|';

// see 7.6
fragment SPACE_CHARACTER: ' ';
fragment HORIZONTAL_TABULATION_CHARACTER: '\t';
fragment NEW_LINE: [\r\n];
fragment VERTICAL_TABULATION_CHARACTER: '\u0013';
fragment FORM_FEED: '\f';

fragment FIRST_QUOTE_SYMBOL: '\'';
fragment SECOND_QUOTE_SYMBOL: '"';

fragment TERMINAL_CHARACTERS: (LETTER | DECIMAL_DIGIT | OTHER_CHARACTER | RESERVED_CHARACTERS);
fragment META_IDENTIFIER_CHARACTERS: LETTER | DECIMAL_DIGIT | ' ' | '_' ; // 'MODIFIED _ for more compatibility (not iso standard)'


/*
	LEXER RULES
 */
// see 7.3, 7.4 tables 1, 2 terminal-characters
CONCATENATE_SYMBOL: ',';
DEFINING_SYMBOL: '=';
DEFINITION_SEPERATOR_SYMBOL: '|' | '/' | '!';
END_GROUP_SYMBOL: ')';
END_OPTION_SYMBOL: ']' | '/)';
END_REPEAT_SYMBOL: '}' | ':)';
EXCEPT_SYMBOL: '-';
REPETITION_SYMBOL: '*';
SPECIAL_SEQUENCE_SYMBOL: '?';
START_GROUP_SYMBOL: '(';
START_OPTION_SYMBOL: '[' | '(/';
START_REPEAT_SYMBOL: '{' | '(:';
TERMINATOR_SYMBOL: ';' | '.';


META_IDENTIFIER: LETTER META_IDENTIFIER_CHARACTERS* LETTER; // some version allow whitespaces in the meta-identfier, although it is not standard
INTEGER: DECIMAL_DIGIT+;
TERMINAL_STRING: (FIRST_QUOTE_SYMBOL (TERMINAL_CHARACTERS | SECOND_QUOTE_SYMBOL)+ FIRST_QUOTE_SYMBOL)
	| (SECOND_QUOTE_SYMBOL (TERMINAL_CHARACTERS | FIRST_QUOTE_SYMBOL)+ SECOND_QUOTE_SYMBOL) ;

COMMENT: START_COMMENT_SYMBOL .*? END_COMMENT_SYMBOL;
SPECIAL_SEQUENCE: SPECIAL_SEQUENCE_SYMBOL .*? SPECIAL_SEQUENCE_SYMBOL;


// SKIP THESE
GAP_SEPERATOR: (SPACE_CHARACTER | HORIZONTAL_TABULATION_CHARACTER | NEW_LINE 
	| VERTICAL_TABULATION_CHARACTER | FORM_FEED)+ -> skip;

/* 
	Abstract Syntax of EBNF
	PARSER RULES
*/
// see 4.2
syntax: (COMMENT | syntax_rule)+;
// see 4.3
syntax_rule: META_IDENTIFIER DEFINING_SYMBOL definitions_list TERMINATOR_SYMBOL;
// see 4.4
definitions_list: single_definition (DEFINITION_SEPERATOR_SYMBOL single_definition)*;
// see 4.5
single_definition: syntactic_term (CONCATENATE_SYMBOL syntactic_term)*;
// see 4.6
syntactic_term: syntactic_factor (EXCEPT_SYMBOL syntactic_factor)?;
// see 4.8
syntactic_factor: (INTEGER REPETITION_SYMBOL)? syntactic_primary;
// see 4.10
syntactic_primary: optional_sequence | repeated_sequence | grouped_sequence
	| META_IDENTIFIER | TERMINAL_STRING | SPECIAL_SEQUENCE | empty_sequence;

optional_sequence: START_OPTION_SYMBOL definitions_list END_OPTION_SYMBOL;
repeated_sequence: START_REPEAT_SYMBOL definitions_list END_REPEAT_SYMBOL;
grouped_sequence: START_GROUP_SYMBOL definitions_list END_GROUP_SYMBOL;

empty_sequence: '';

