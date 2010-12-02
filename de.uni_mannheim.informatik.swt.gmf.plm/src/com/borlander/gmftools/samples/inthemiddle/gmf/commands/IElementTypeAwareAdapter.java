package com.borlander.gmftools.samples.inthemiddle.gmf.commands;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

public interface IElementTypeAwareAdapter extends IAdaptable {

	public IElementType getElementType();

	public int getVisualId();

	public String getSemanticHint();

}
