package de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class PLMNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) {
			de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem item = (de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.navigator.PLMNavigatorItem) element;
			return de.uni_mannheim.informatik.swt.models.plm.PLM.diagram.part.PLMVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
