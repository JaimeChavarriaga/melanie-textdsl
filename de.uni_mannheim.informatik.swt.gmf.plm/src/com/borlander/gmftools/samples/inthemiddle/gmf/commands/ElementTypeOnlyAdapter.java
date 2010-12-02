package com.borlander.gmftools.samples.inthemiddle.gmf.commands;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;

public class ElementTypeOnlyAdapter implements IElementTypeAwareAdapter {

	private final IElementType myElementType;

	private final int myVisualId;

	public ElementTypeOnlyAdapter(IElementType elementType, int visualId) {
		myElementType = elementType;
		myVisualId = visualId;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter.isInstance(myElementType)) {
			return myElementType;
		}
		return null;
	}

	@Override
	public int getVisualId() {
		return myVisualId;
	}

	@Override
	public IElementType getElementType() {
		return myElementType;
	}

	@Override
	public String getSemanticHint() {
		return Integer.toString(myVisualId);
	}

}
