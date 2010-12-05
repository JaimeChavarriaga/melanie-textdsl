package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PLMParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser ontologyName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getOntologyName_5008Parser() {
		if (ontologyName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getElement_Name() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			ontologyName_5008Parser = parser;
		}
		return ontologyName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getModelName_5007Parser() {
		if (modelName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getElement_Name() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			modelName_5007Parser = parser;
		}
		return modelName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainEntityName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getDomainEntityName_5005Parser() {
		if (domainEntityName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getElement_Name() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			domainEntityName_5005Parser = parser;
		}
		return domainEntityName_5005Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.DomainEntityLabelExpressionLabelParser domainEntityLabel_5009Parser;

	/**
	 * @generated
	 */
	private IParser getDomainEntityLabel_5009Parser() {
		if (domainEntityLabel_5009Parser == null) {
			domainEntityLabel_5009Parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.DomainEntityLabelExpressionLabelParser();
		}
		return domainEntityLabel_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainEntityNameExpressedPotencyLevel_5011Parser;

	/**
	 * @generated
	 */
	private IParser getDomainEntityNameExpressedPotencyLevel_5011Parser() {
		if (domainEntityNameExpressedPotencyLevel_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getElement_Name(),
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getElement_Expressed(),
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPotentElement_Potency(),
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getClabject_Level() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("name = {0}, expressed = {1}, potency = {2} , level = {3}"); //$NON-NLS-1$
			parser.setEditorPattern("name = {0}, expressed = {1}, potency = {2} , level = {3}"); //$NON-NLS-1$
			parser.setEditPattern("name = {0}, expressed = {1}, potency = {2} , level = {3}"); //$NON-NLS-1$
			domainEntityNameExpressedPotencyLevel_5011Parser = parser;
		}
		return domainEntityNameExpressedPotencyLevel_5011Parser;
	}

	/**
	 * @generated
	 */
	private de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.FieldLabelExpressionLabelParser fieldLabel_5010Parser;

	/**
	 * @generated
	 */
	private IParser getFieldLabel_5010Parser() {
		if (fieldLabel_5010Parser == null) {
			fieldLabel_5010Parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.FieldLabelExpressionLabelParser();
		}
		return fieldLabel_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainConnectionName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getDomainConnectionName_5006Parser() {
		if (domainConnectionName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getElement_Name() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}"); //$NON-NLS-1$
			parser.setEditPattern("{0}"); //$NON-NLS-1$
			domainConnectionName_5006Parser = parser;
		}
		return domainConnectionName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainConnectionPotency_5012Parser;

	/**
	 * @generated
	 */
	private IParser getDomainConnectionPotency_5012Parser() {
		if (domainConnectionPotency_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getPotentElement_Potency() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			domainConnectionPotency_5012Parser = parser;
		}
		return domainConnectionPotency_5012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyNameEditPart.VISUAL_ID:
			return getOntologyName_5008Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.ModelNameEditPart.VISUAL_ID:
			return getModelName_5007Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNamePotencyEditPart.VISUAL_ID:
			return getDomainEntityName_5005Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLevEditPart.VISUAL_ID:
			return getDomainEntityLabel_5009Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameExpressedPotencyLev2EditPart.VISUAL_ID:
			return getDomainEntityNameExpressedPotencyLevel_5011Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.FieldNamePotencyEditPart.VISUAL_ID:
			return getFieldLabel_5010Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNamePotencyEditPart.VISUAL_ID:
			return getDomainConnectionName_5006Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionPotencyEditPart.VISUAL_ID:
			return getDomainConnectionPotency_5012Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
