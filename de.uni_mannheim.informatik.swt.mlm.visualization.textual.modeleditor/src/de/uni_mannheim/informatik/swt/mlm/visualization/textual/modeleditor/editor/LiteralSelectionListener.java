package de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.SearchStrategy;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.TextElement;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingLink;
import de.uni_mannheim.informatik.swt.models.plm.textualrepresentation.weaving.M2TWeaving.WeavingModel;

/**
 * This listener is responsible for changing the background of
 * selected text which is not editable.
 *
 */
public class LiteralSelectionListener implements CaretListener {

	final private WeavingModel weavingModel;
	final List<Annotation> literalAnnotations = new ArrayList<>();
	final IAnnotationModel annotationModel;
	
	
	public LiteralSelectionListener(WeavingModel weavingModel, IAnnotationModel annotationModel){
		this.weavingModel = weavingModel;
		this.annotationModel = annotationModel;
	}

	@Override
	public void caretMoved(CaretEvent event) {
		//Delete current annotations
		for (Annotation a : literalAnnotations)
			annotationModel.removeAnnotation(a);

		int offset = event.caretOffset;
		List<TextElement> textElements = weavingModel.findTextElementForOffset(offset, SearchStrategy.ENTITY_PREFFERED);
		
		//Add new Annotation for each literal
		for (TextElement element : textElements)
			//WeavingLink to Clabject -> no Attribute -> Literal
			if (((WeavingLink)element.eContainer()).getModelElement() instanceof Clabject){
				Annotation literalAnnotation = new Annotation("de.uni_mannheim.informatik.swt.mlm.visualization.textual.modeleditor.literaltype", false, "Hello World");
				annotationModel.addAnnotation(literalAnnotation, new Position(element.getOffset(), element.getLength()));
				literalAnnotations.add(literalAnnotation);
			}
	}

}
