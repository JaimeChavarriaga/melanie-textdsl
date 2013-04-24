package de.uni_mannheim.informatik.swt.ebnf.parser.impl;

import de.uni_mannheim.informatik.swt.ebnf.parser.EBNFBaseVisitor;
import de.uni_mannheim.informatik.swt.ebnf.parser.EBNFParser.Syntax_ruleContext;
import ebnfmm.EBNFDescription;
import ebnfmm.EbnfmmFactory;
import ebnfmm.EbnfmmPackage;
import ebnfmm.NonTerminal;
import ebnfmm.Rule;

public class EBNFEvalVisitor extends EBNFBaseVisitor<EBNFDescription> {
	EbnfmmFactory ebnfFactory = EbnfmmFactory.eINSTANCE;
	EbnfmmPackage ebnfPackage = EbnfmmPackage.eINSTANCE;
	EBNFDescription ebnfDescription;

	public EBNFEvalVisitor() {
		this.ebnfDescription = ebnfFactory.createEBNFDescription();
	}

	@Override
	public EBNFDescription visitSyntax_rule(Syntax_ruleContext ctx) {
		System.out.println("Rule: " + ctx.META_IDENTIFIER());

		// create the rule
		Rule r = ebnfFactory.createRule();

		// create the meta-identifier
		NonTerminal nonTerminal = ebnfFactory.createNonTerminal();
		nonTerminal.setId(ctx.META_IDENTIFIER().getText());

		// associate meta-identifier with rule
		r.setMetaIdentifier(nonTerminal);

		// TODO: visit all children of the rule (right-hand side)

		// add rule to description
		ebnfDescription.getRules().add(r);
		
		return this.ebnfDescription;
	}

}
