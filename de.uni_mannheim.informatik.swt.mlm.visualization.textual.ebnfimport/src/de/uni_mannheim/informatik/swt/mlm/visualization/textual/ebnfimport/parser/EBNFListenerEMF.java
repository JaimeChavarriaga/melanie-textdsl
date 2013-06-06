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

import java.util.HashMap;
import java.util.Stack;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFBaseListener;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFParser.Definitions_listContext;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFParser.Single_definitionContext;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFParser.Syntactic_factorContext;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFParser.Syntactic_primaryContext;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFParser.Syntactic_termContext;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFParser.SyntaxContext;
import de.uni_mannheim.informatik.swt.mlm.visualization.textual.ebnfimport.EBNFParser.Syntax_ruleContext;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Choice;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Choose;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Control;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EBNFDescription;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.EbnfmmFactory;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Except;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.FactorableSymbol;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Group;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminal;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.NonTerminalReference;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Optional;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Repetition;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.SpecialSequence;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Symbol;
import de.uni_mannheim.informatik.swt.models.ebnf.ebnfmm.Terminal;

public class EBNFListenerEMF extends EBNFBaseListener {
	private EbnfmmFactory ebnfFactory = EbnfmmFactory.eINSTANCE;
	private EBNFDescription ebnfDescription;

	private NonTerminal currentRule;
	private Stack<Symbol> symbolStack;

	private HashMap<String, NonTerminal> rules;

	// TODO: Implement EXCEPT SYMBOL

	public EBNFListenerEMF() {
		this.ebnfDescription = ebnfFactory.createEBNFDescription();
		this.symbolStack = new Stack<Symbol>();
		this.rules = new HashMap<String, NonTerminal>();
	}

	@Override
	public void enterSyntax(SyntaxContext ctx) {
		// add all rules
		for (Syntax_ruleContext syntaxContext : ctx.syntax_rule()) {
			// create the rule & empty control stack
			currentRule = ebnfFactory.createNonTerminal();
			symbolStack.removeAllElements();

			// create the meta-identifier
			currentRule.setId(syntaxContext.META_IDENTIFIER().getText());

			// add rule to description
			getEbnfDescription().getRules().add(currentRule);

			// add Rule to index
			rules.put(currentRule.getId(), currentRule);
		}
		super.enterSyntax(ctx);
	}

	@Override
	public void enterDefinitions_list(Definitions_listContext ctx) {
		if (ctx.single_definition().size() > 1) { // do not create a choose
													// instance, if there is
													// only one class to choose
													// from
			// create a new choose instance
			Choice choose = ebnfFactory.createChoice();
			addToRuleOrControl(choose);
			symbolStack.push(choose);
		}
	}

	@Override
	public void exitDefinitions_list(Definitions_listContext ctx) {
		if (ctx.single_definition().size() > 1) {
			symbolStack.pop();
		}
	}

	@Override
	public void enterSyntax_rule(Syntax_ruleContext ctx) {
		System.out.println("Rule: " + ctx.META_IDENTIFIER());
		currentRule = rules.get(ctx.META_IDENTIFIER().getText());
	}

	@Override
	public void enterSingle_definition(Single_definitionContext ctx) {
		if (ctx.syntactic_term().size() > 1) {
			Group group = ebnfFactory.createGroup();
			addToRuleOrControl(group);
			symbolStack.push(group);
		}
	}

	@Override
	public void exitSingle_definition(Single_definitionContext ctx) {
		if (ctx.syntactic_term().size() > 1) {
			symbolStack.pop();
		}
	}

	@Override
	public void enterSyntactic_term(Syntactic_termContext ctx) {
		if (ctx.EXCEPT_SYMBOL() != null) {
			Except ex = ebnfFactory.createExcept();

			addToRuleOrControl(ex);

			symbolStack.push(ex);
		}
	}

	@Override
	public void exitSyntactic_term(Syntactic_termContext ctx) {
		if (ctx.EXCEPT_SYMBOL() != null) {
			symbolStack.pop();
		}
	}

	@Override
	public void enterSyntactic_primary(Syntactic_primaryContext ctx) {

		if (ctx.META_IDENTIFIER() != null) {
			// find nonTerminal in HashMap and add it to the reference
			// dummy-objects
			NonTerminal nonTerminal = rules
					.get(ctx.META_IDENTIFIER().getText());
			NonTerminalReference reference = ebnfFactory
					.createNonTerminalReference();
			reference.setNonTerminal(nonTerminal);

			// set factor (multiplicity if present)
			setFactorIfPresent(ctx, reference);

			// add current symbol to rule or control
			addToRuleOrControl(reference);
		} else if (ctx.TERMINAL_STRING() != null) {
			// create terminal string & set text
			Terminal terminal = ebnfFactory.createTerminal();
			terminal.setTerminalString(StringHelper.trimQuotes(ctx
					.TERMINAL_STRING().getText()));

			// set factor (multiplicity if present)
			setFactorIfPresent(ctx, terminal);

			// add current symbol to rule or control
			addToRuleOrControl(terminal);
		} else if (ctx.SPECIAL_SEQUENCE() != null) {
			SpecialSequence seq = ebnfFactory.createSpecialSequence();
			seq.setText(ctx.SPECIAL_SEQUENCE().getText());

			// set factor (multiplicity if present)
			setFactorIfPresent(ctx, seq);

			// add current symbol to rule or control
			addToRuleOrControl(seq);
		} else if (ctx.optional_sequence() != null) {
			Optional option = ebnfFactory.createOptional();

			// set factor (multiplicity if present)
			setFactorIfPresent(ctx, option);

			// add current symbol to rule or control
			addToRuleOrControl(option);

			// push control to stack
			symbolStack.push(option);
		} else if (ctx.repeated_sequence() != null) {
			Repetition rep = ebnfFactory.createRepetition();

			// set factor (multiplicity if present)
			setFactorIfPresent(ctx, rep);

			// add current symbol to rule or control
			addToRuleOrControl(rep);

			// push control to stack
			symbolStack.push(rep);
		} else if (ctx.grouped_sequence() != null) {
			Group group = ebnfFactory.createGroup();

			// set factor (multiplicity if present)
			setFactorIfPresent(ctx, group);

			// add current symbol to rule or control
			addToRuleOrControl(group);

			// push control to stack
			symbolStack.push(group);
		} else if (ctx.empty_sequence() != null) {
			// Do Nothing
			return;
		}

	}

	@Override
	public void exitSyntactic_primary(Syntactic_primaryContext ctx) {
		if (ctx.optional_sequence() != null || ctx.repeated_sequence() != null
				|| ctx.grouped_sequence() != null) {
			symbolStack.pop();
		}
	}

	/**
	 * Helpers
	 */

	/**
	 * Set the factor attribute of the symbol, if there is a value provided
	 * 
	 * @param ctx
	 *            active context
	 * @param symbol
	 *            to use
	 */
	private void setFactorIfPresent(Syntactic_primaryContext ctx,
			FactorableSymbol symbol) {
		// find current context for factor
		Syntactic_factorContext factorCtx = (Syntactic_factorContext) ctx.parent;

		if (factorCtx.INTEGER() != null) { // factor present, so set it
			symbol.setFactor(Integer.parseInt(factorCtx.INTEGER().getText()));
		}
	}

	/**
	 * Add the symbol to the current rule or the currently active control
	 * 
	 * @param symbol
	 *            to add
	 */
	private void addToRuleOrControl(Symbol symbol) {
		if (!symbolStack.empty()) { // control is active
			Symbol currentSymbol = symbolStack.peek();

			if (currentSymbol instanceof Choose) {
				Choose choose = (Choose) currentSymbol;
				choose.getDefinitionList().add(symbol);
			} else if (currentSymbol instanceof Control) {
				Control currentControl = (Control) currentSymbol;
				if (currentControl instanceof Except
						&& !currentControl.getDefinitionList().isEmpty()) {
					Except except = (Except) currentControl;
					except.setExcept(symbol);
				} else {
					currentControl.getDefinitionList().add(symbol);
				}
			}
		} else { // no controls, add directly to the rule
			currentRule.getDefinitionList().add(symbol);
		}
	}

	public EBNFDescription getEbnfDescription() {
		return ebnfDescription;
	}
}
