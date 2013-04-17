// Generated from EBNF.g4 by ANTLR 4.0

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class EBNFBaseListener implements EBNFListener {
	@Override public void enterEmpty_sequence(EBNFParser.Empty_sequenceContext ctx) { }
	@Override public void exitEmpty_sequence(EBNFParser.Empty_sequenceContext ctx) { }

	@Override public void enterSyntax(EBNFParser.SyntaxContext ctx) { }
	@Override public void exitSyntax(EBNFParser.SyntaxContext ctx) { }

	@Override public void enterOptional_sequence(EBNFParser.Optional_sequenceContext ctx) { }
	@Override public void exitOptional_sequence(EBNFParser.Optional_sequenceContext ctx) { }

	@Override public void enterSingle_definition(EBNFParser.Single_definitionContext ctx) { }
	@Override public void exitSingle_definition(EBNFParser.Single_definitionContext ctx) { }

	@Override public void enterRepeated_sequence(EBNFParser.Repeated_sequenceContext ctx) { }
	@Override public void exitRepeated_sequence(EBNFParser.Repeated_sequenceContext ctx) { }

	@Override public void enterSyntactic_term(EBNFParser.Syntactic_termContext ctx) { }
	@Override public void exitSyntactic_term(EBNFParser.Syntactic_termContext ctx) { }

	@Override public void enterGrouped_sequence(EBNFParser.Grouped_sequenceContext ctx) { }
	@Override public void exitGrouped_sequence(EBNFParser.Grouped_sequenceContext ctx) { }

	@Override public void enterDefinitions_list(EBNFParser.Definitions_listContext ctx) { }
	@Override public void exitDefinitions_list(EBNFParser.Definitions_listContext ctx) { }

	@Override public void enterSyntactic_primary(EBNFParser.Syntactic_primaryContext ctx) { }
	@Override public void exitSyntactic_primary(EBNFParser.Syntactic_primaryContext ctx) { }

	@Override public void enterSyntactic_factor(EBNFParser.Syntactic_factorContext ctx) { }
	@Override public void exitSyntactic_factor(EBNFParser.Syntactic_factorContext ctx) { }

	@Override public void enterSyntax_rule(EBNFParser.Syntax_ruleContext ctx) { }
	@Override public void exitSyntax_rule(EBNFParser.Syntax_ruleContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}