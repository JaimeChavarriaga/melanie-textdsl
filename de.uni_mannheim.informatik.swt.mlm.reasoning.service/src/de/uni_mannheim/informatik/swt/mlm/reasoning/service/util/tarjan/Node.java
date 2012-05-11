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

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

public class Node implements Comparable<Node> {
	   
	   Clabject clabject;
	   boolean visited = false;   // used for Kosaraju's algorithm and Edmonds's algorithm
	   int lowlink = -1;          // used for Tarjan's algorithm
	   int index = -1;            // used for Tarjan's algorithm
	   
	   public Node(Clabject clabject) {
	       this.clabject = clabject;
	   }
	   
	   public int compareTo(final Node argNode) {
		   int myCode = clabject.hashCode();
		   int otherCode = argNode.hashCode();
		   return myCode == otherCode ? 0 : (myCode>otherCode ? 1 : -1);
	   }
	   
	   public Clabject getClabject() {
		   return clabject;
	   }
}