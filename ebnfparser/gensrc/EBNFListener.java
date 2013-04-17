// Generated from EBNF.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface EBNFListener extends ParseTreeListener {
	void enterEmpty_sequence(EBNFParser.Empty_sequenceContext ctx);
	void exitEmpty_sequence(EBNFParser.Empty_sequenceContext ctx);

	void enterSyntax(EBNFParser.SyntaxContext ctx);
	void exitSyntax(EBNFParser.SyntaxContext ctx);

	void enterOptional_sequence(EBNFParser.Optional_sequenceContext ctx);
	void exitOptional_sequence(EBNFParser.Optional_sequenceContext ctx);

	void enterSingle_definition(EBNFParser.Single_definitionContext ctx);
	void exitSingle_definition(EBNFParser.Single_definitionContext ctx);

	void enterRepeated_sequence(EBNFParser.Repeated_sequenceContext ctx);
	void exitRepeated_sequence(EBNFParser.Repeated_sequenceContext ctx);

	void enterSyntactic_term(EBNFParser.Syntactic_termContext ctx);
	void exitSyntactic_term(EBNFParser.Syntactic_termContext ctx);

	void enterGrouped_sequence(EBNFParser.Grouped_sequenceContext ctx);
	void exitGrouped_sequence(EBNFParser.Grouped_sequenceContext ctx);

	void enterDefinitions_list(EBNFParser.Definitions_listContext ctx);
	void exitDefinitions_list(EBNFParser.Definitions_listContext ctx);

	void enterSyntactic_primary(EBNFParser.Syntactic_primaryContext ctx);
	void exitSyntactic_primary(EBNFParser.Syntactic_primaryContext ctx);

	void enterSyntactic_factor(EBNFParser.Syntactic_factorContext ctx);
	void exitSyntactic_factor(EBNFParser.Syntactic_factorContext ctx);

	void enterSyntax_rule(EBNFParser.Syntax_ruleContext ctx);
	void exitSyntax_rule(EBNFParser.Syntax_ruleContext ctx);
}