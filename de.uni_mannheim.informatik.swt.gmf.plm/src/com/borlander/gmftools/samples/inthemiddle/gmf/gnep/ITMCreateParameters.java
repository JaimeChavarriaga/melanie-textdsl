package com.borlander.gmftools.samples.inthemiddle.gmf.gnep;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.notation.View;

public interface ITMCreateParameters {

	public View getParentView();

	public Point getRelativeLocation();

	public View getAnchorSibling();

	public boolean isBeforeNotAfterAnchor();
}