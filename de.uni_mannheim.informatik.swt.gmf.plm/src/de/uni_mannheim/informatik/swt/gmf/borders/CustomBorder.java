package de.uni_mannheim.informatik.swt.gmf.borders;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Insets;

public class CustomBorder extends LineBorder {

	private boolean top = false;
	
	public void setTop(boolean value)
	{
		top = value;
	}
	
	private boolean bottom = false;
	
	public void setBottom(boolean value)
	{
		bottom = value;
	}
	
	private boolean left = false;
	
	public void setLeft(boolean value)
	{
		left = value;
	}
	
	private boolean right = false;
	
	public void setRight(boolean value)
	{
		right = value;
	}
	
	/**
	 * @see org.eclipse.draw2d.Border#paint(IFigure, Graphics, Insets)
	 */
	public void paint(IFigure figure, Graphics graphics, Insets insets) {
		tempRect.setBounds(getPaintRectangle(figure, insets));
		if (getWidth() % 2 == 1) {
			tempRect.width--;
			tempRect.height--;
		}
		tempRect.shrink(getWidth() / 2, getWidth() / 2);
		graphics.setLineWidth(getWidth());
		graphics.setLineStyle(getStyle());
		if (getColor() != null)
			graphics.setForegroundColor(getColor());
		
		if (bottom)
			graphics.drawLine(tempRect.getBottomLeft(), tempRect.getBottomRight());
		if (top)
			graphics.drawLine(tempRect.getTopLeft(), tempRect.getTopRight());
		if (left)
			graphics.drawLine(tempRect.getTopLeft(), tempRect.getBottomLeft());
		if (right)
			graphics.drawLine(tempRect.getTopRight(), tempRect.getBottomRight());
	}
}
