package uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class PLMNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) {
			uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem item = (uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) element;
			return uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
