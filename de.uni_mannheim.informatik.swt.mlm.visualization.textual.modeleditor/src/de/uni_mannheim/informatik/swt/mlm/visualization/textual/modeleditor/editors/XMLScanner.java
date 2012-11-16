package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors;

import org.eclipse.jface.text.rules.*;
import org.eclipse.jface.text.*;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editors.sourceviewerconfiguration.MultilevelColorProvider;

public class XMLScanner extends RuleBasedScanner {

	public XMLScanner(MultilevelColorProvider manager) {
		IToken procInstr =
			new Token(
				new TextAttribute(
					manager.getColor(IMultiLevelModelColorConstants.PROC_INSTR)));

		IRule[] rules = new IRule[2];
		//Add rule for processing instructions
		rules[0] = new SingleLineRule("<?", "?>", procInstr);
		// Add generic whitespace rule.
		rules[1] = new WhitespaceRule(new XMLWhitespaceDetector());

		setRules(rules);
	}
}
