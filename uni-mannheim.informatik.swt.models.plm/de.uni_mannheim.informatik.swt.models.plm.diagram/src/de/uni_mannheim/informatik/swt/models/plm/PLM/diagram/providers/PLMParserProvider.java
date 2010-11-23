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
	private IParser ontologyName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getOntologyName_5001Parser() {
		if (ontologyName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getElement_Name() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			ontologyName_5001Parser = parser;
		}
		return ontologyName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser ontologyLevelName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getOntologyLevelName_5002Parser() {
		if (ontologyLevelName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
					.getElement_Name() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			ontologyLevelName_5002Parser = parser;
		}
		return ontologyLevelName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainEntityNameLevel_5003Parser;

	/**
	 * @generated
	 */
	private IParser getDomainEntityNameLevel_5003Parser() {
		if (domainEntityNameLevel_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getElement_Name(),
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getClabject_Level() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}^{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}^{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}^{1}"); //$NON-NLS-1$
			domainEntityNameLevel_5003Parser = parser;
		}
		return domainEntityNameLevel_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainConnectionNameLevel_5004Parser;

	/**
	 * @generated
	 */
	private IParser getDomainConnectionNameLevel_5004Parser() {
		if (domainConnectionNameLevel_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getElement_Name(),
					de.uni_mannheim.informatik.swt.models.plm.PLM.PLMPackage.eINSTANCE
							.getClabject_Level() };
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser parser = new de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}^{1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}^{1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}^{1}"); //$NON-NLS-1$
			domainConnectionNameLevel_5004Parser = parser;
		}
		return domainConnectionNameLevel_5004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyNameEditPart.VISUAL_ID:
			return getOntologyName_5001Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.OntologyLevelNameEditPart.VISUAL_ID:
			return getOntologyLevelName_5002Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainEntityNameLevelEditPart.VISUAL_ID:
			return getDomainEntityNameLevel_5003Parser();
		case de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.edit.parts.DomainConnectionNameLevelEditPart.VISUAL_ID:
			return getDomainConnectionNameLevel_5004Parser();
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
