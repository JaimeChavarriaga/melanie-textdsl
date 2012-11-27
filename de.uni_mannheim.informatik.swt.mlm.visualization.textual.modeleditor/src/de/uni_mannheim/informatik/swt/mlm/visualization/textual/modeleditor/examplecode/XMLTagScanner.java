package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.examplecode;
//package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor;
//
//import org.eclipse.jface.text.*;
//import org.eclipse.jface.text.rules.*;
//
//import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration.MultilevelColorProvider;
//
//public class XMLTagScanner extends RuleBasedScanner {
//
//	public XMLTagScanner(MultilevelColorProvider manager) {
//		IToken string =
//			new Token(
//				new TextAttribute(manager.getColor(MultiLevelModelColorConstants.STRING)));
//
//		IRule[] rules = new IRule[3];
//
//		// Add rule for double quotes
//		rules[0] = new SingleLineRule("\"", "\"", string, '\\');
//		// Add a rule for single quotes
//		rules[1] = new SingleLineRule("'", "'", string, '\\');
//		// Add generic whitespace rule.
//		rules[2] = new WhitespaceRule(new XMLWhitespaceDetector());
//
//		setRules(rules);
//	}
//}
