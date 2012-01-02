/*******************************************************************************
 * Copyright (c) 2011 University of Mannheim: Chair for Software Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bastian Kennel - initial API and implementation and initial documentation
 *******************************************************************************/ 
package de.uni_mannheim.informatik.swt.mlm.reasoning.service.proximity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

/**
 * @author bastian
 *
 */
public class ProximityIndicator {
	
	private LinkedList<Integer> generQueue = new LinkedList<Integer>();
	private LinkedList<Integer> contQueue = new LinkedList<Integer>();
	private LinkedList<Integer> classQueue = new LinkedList<Integer>();

	public String run(Clabject c, String expression) {
		parseInput(expression);
		String result = "";
		if (generQueue.isEmpty()) {
			return result;
		}
		int maxLevel = generQueue.peekLast();
		int currentRequest = generQueue.poll();
		int currentLevel = 0;
		List<List<Clabject>> allLevels = new ArrayList<List<Clabject>>();
		allLevels.add(new ArrayList<Clabject>(c.getModelDirectSupertypes()));
		while (currentLevel <= maxLevel) {
			List<Clabject> nextLevel = new ArrayList<Clabject>();
			for (Clabject t: allLevels.get(currentLevel)) {
				nextLevel.addAll(t.getModelDirectSupertypes());
			}
			allLevels.add(nextLevel);
			currentLevel++;
		}
		for (List<Clabject> currentLevelSupertypes: allLevels) {
			if (currentRequest == allLevels.indexOf(currentLevelSupertypes)) { 
				String temp = "";
				if (currentLevelSupertypes.size()>1) temp += "(";
				for (Clabject t: currentLevelSupertypes) {
					if (t.getName() != null && t.getName().length()>0) {
						temp += t.getName();
					} else {
						temp += "_";
					}
					temp += ",";
				}
				temp = temp.substring(0,temp.length()-1);
				if (currentLevelSupertypes.size()>1) temp += ")";
				temp += "<";
				result += temp;
				if (!generQueue.isEmpty()) {
					currentRequest = generQueue.poll();
				}
			}
		}
		return result;
	}

	private void parseInput(String expression) {
		Pattern pattern = Pattern.compile("\\[(.*?)\\]\\((.*?)\\)\\{(.*?)\\}");
		Matcher matcher = pattern.matcher(expression);
		matcher.matches();
		String generalization = matcher.group(1);
		String containment = matcher.group(2);
		String classification = matcher.group(3);
		String[] generalizationArray = generalization.split(",");
		String[] containmentArray = containment.split(",");
		String[] classificationArray = classification.split(",");
		for(String i:generalizationArray) {
			try {
				generQueue.add(Integer.parseInt(i));
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
		for(String i:containmentArray) {
			try {
				contQueue.add(Integer.parseInt(i));
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
		for(String i:classificationArray) {
			try {
				classQueue.add(Integer.parseInt(i));
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
			}
		}
	}

}
