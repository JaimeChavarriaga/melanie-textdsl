/*******************************************************************************
 * Copyright (c) 2012 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel - initial API and implementation and initial documentation
 *******************************************************************************/
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.util.tarjan;

public class Edge implements Comparable<Edge> {

	final Node from, to;
	final int weight;

	public Edge(final Node argFrom, final Node argTo, final int argWeight) {
		from = argFrom;
		to = argTo;
		weight = argWeight;
	}

	public int compareTo(final Edge argEdge) {
		return weight - argEdge.weight;
	}
}