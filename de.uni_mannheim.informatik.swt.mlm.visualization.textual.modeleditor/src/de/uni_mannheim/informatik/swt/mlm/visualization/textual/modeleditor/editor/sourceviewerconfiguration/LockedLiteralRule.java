package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.sourceviewerconfiguration;

import java.util.List;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

import de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor.MultiLevelModelEditorInput;
import de.uni_mannheim.informatik.swt.models.plm.PLM.Attribute;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

public class LockedLiteralRule implements IRule {

	MultilevelColorProvider colorProvider;
	WeavingModel weavingModel;
	
	public LockedLiteralRule(MultilevelColorProvider colorProvider){
		this.colorProvider = colorProvider;
		this.weavingModel = MultiLevelModelEditorInput.LatestInstance.getWeavingModel();
	}
	
	private int buffer;
	
	@Override
	public IToken evaluate(ICharacterScanner scanner) {		
		int offset = ((MultilevelLiteralScanner)scanner).getOffset();
		buffer = scanner.read();
		
		System.out.println(offset);
		
		if (buffer == ICharacterScanner.EOF){
			scanner.unread();
			buffer = 0;
			return Token.UNDEFINED;
		}
			
		
		Color backgroundColor = colorProvider.getColor(new RGB(230,230,230));
		IToken lockedToken = new Token(new TextAttribute(null, backgroundColor, SWT.NORMAL));
		
		List<TextElement> textElements = weavingModel.findTextElementForOffset(offset);
		if (textElements.size() == 0)
			return Token.UNDEFINED;
		
		TextElement currentTextElement = textElements.get(0);
		WeavingLink currentWeavingLink = (WeavingLink)currentTextElement.eContainer();
		
		if (currentWeavingLink.getModelElement() instanceof Attribute){
			return Token.UNDEFINED;
		}
		else{
			return lockedToken;
		}
	}

}
