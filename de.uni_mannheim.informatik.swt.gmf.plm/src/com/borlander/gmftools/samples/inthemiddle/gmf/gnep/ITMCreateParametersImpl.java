package com.borlander.gmftools.samples.inthemiddle.gmf.gnep;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;

public class ITMCreateParametersImpl implements ITMCreateParameters {
	private Point myRelativeLocation;
	private View myParentView;
	private View myAnchorSibling;
	private boolean myIsBeforeAnchor;
	
	public Point getRelativeLocation() {
		return myRelativeLocation;
	}
	
	public void setRelativeLocation(Point relativeLocation) {
		myRelativeLocation = relativeLocation;
	}
	
	public View getAnchorSibling() {
		return myAnchorSibling;
	}
	
	public void setAnchorSibling(View anchorSibling) {
		myAnchorSibling = anchorSibling;
	}
	
	public boolean isBeforeNotAfterAnchor() {
		return myIsBeforeAnchor;
	}
	
	public void setBeforeNotAfterAnchor(boolean isBeforeAnchor) {
		myIsBeforeAnchor = isBeforeAnchor;
	}
	
	public View getParentView() {
		return myParentView;
	}
	
	public void setParentView(View parentView) {
		myParentView = parentView;
	}
	
	public static ITMCreateParametersImpl createFor(IGraphicalEditPart host, CreateRequest request){
		ITMCreateParametersImpl parameters = new ITMCreateParametersImpl(); 
		parameters.setParentView(host.getNotationView());
		
		if (request.getLocation() != null){
			IFigure hostContentPane = host.getContentPane();
			Point origin;
			if (hostContentPane.getLayoutManager() instanceof XYLayout){
				origin = ((XYLayout)hostContentPane.getLayoutManager()).getOrigin(hostContentPane);
			} else {
				origin = hostContentPane.getClientArea().getLocation();	
			}
			Point relativeLocation = new Point(request.getLocation());
			hostContentPane.translateToRelative(relativeLocation);
			relativeLocation.translate(origin.getNegated());
			parameters.setRelativeLocation(relativeLocation);
		}
		
		return parameters;
	}
}