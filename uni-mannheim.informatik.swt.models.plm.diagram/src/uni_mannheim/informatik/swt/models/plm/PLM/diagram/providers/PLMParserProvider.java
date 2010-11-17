package uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers;

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
	private IParser pNodeNamePotency_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPNodeNamePotency_5001Parser() {
		if (pNodeNamePotency_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPElement_Name(),
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPInstantiableElement_Potency() };
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}^{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}^{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}^{1}"); //$NON-NLS-1$
			pNodeNamePotency_5001Parser = parser;
		}
		return pNodeNamePotency_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser pRelationshipNamePotency_5002Parser;

	/**
	 * @generated
	 */
	private IParser getPRelationshipNamePotency_5002Parser() {
		if (pRelationshipNamePotency_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPElement_Name(),
					uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getPInstantiableElement_Potency() };
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}^{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}^{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}^{1}"); //$NON-NLS-1$
			pRelationshipNamePotency_5002Parser = parser;
		}
		return pRelationshipNamePotency_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PNodeNamePotencyEditPart.VISUAL_ID:
			return getPNodeNamePotency_5001Parser();
		case uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.PRelationshipNamePotencyEditPart.VISUAL_ID:
			return getPRelationshipNamePotency_5002Parser();
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
			return getParser(uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
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
			if (uni_mannheim.informatik.swt.models.plm.PLM.diagram.providers.PLMElementTypes
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
