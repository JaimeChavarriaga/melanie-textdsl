package de.uni_mannheim.informatik.swt.mlm.reasoning.service.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.uni_mannheim.informatik.swt.models.plm.PLM.Clabject;

//TODO: Add copyright statement
public class ReasoningServiceUtil {
	
	public static <T> Collection<T> filter(Collection<T> target, Predicate<T> predicate) {
	    Collection<T> result;
	    if (target instanceof List)
	    	result = new ArrayList<T>();
	    else if (target instanceof Set)
	    	result = new HashSet<T>();
	    else throw new RuntimeException("Unimplemented Collection filter type " + target.getClass());
	    for (T element: target) {
	        if (predicate.apply(element)) {
	            result.add(element);
	        }
	    }
	    return result;
	}
	
	public static <T> Set<T> intersect(Set<T> one, Set<T> other) {
		Set<T> result = new HashSet<T>(one);
		result.retainAll(other);
		return result;
	}
	
	public static String getDateString() {
		 Calendar cal = Calendar.getInstance();
		 SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss");
		 return sdf.format(cal.getTime());
	}
	
	private static boolean isAlreadyCovered(Clabject subject, Set<Set<Clabject>> universe) {
		for (Set<Clabject> current: universe) {
			if (current.contains(subject)) {
				return true;
			}
		}
		return false;
	}
	
	public static Set<Set<Clabject>> computeSimilaritySets(List<Pair<Clabject,Clabject>> clabjects) {
		Set<Set<Clabject>> result = new HashSet<Set<Clabject>>();
		Map<Clabject,Node> trees = new HashMap<Clabject,Node>();
		// establish all the initial trees from all the subtypes there are
		for (Pair<Clabject,Clabject> pair:clabjects) {
			Clabject supertype = pair.getFirst();
			Clabject subtype = pair.getSecond();
			Node tree;
			if (trees.containsKey(subtype)) {
				tree = trees.get(subtype);
			} else {
				tree = new Node(subtype);
				trees.put(subtype, tree);
			}
			tree.addChild(supertype);
		}
		// now expand the trees until either there are no more new children or a circle is found
		for (Entry<Clabject,Node> entry:trees.entrySet()) {
			for (Node child:entry.getValue().children) {
				for (Node newChild: trees.get(child.clabject).children) {
					child.expandNodeCopy(newChild);
				}
			}
		}
		return result;
	}
	
	
}

class Node {
	
	Clabject clabject;
	Node parent;
	List<Node> children;
	
	public Node(Clabject clabject) {
		this.clabject = clabject;
		children = new ArrayList<Node>();
	}

	public void addChild(Clabject supertype) {
		Node child = new Node(supertype);
		children.add(child);
		child.parent = this;
	}
	
	public boolean containsNode(Node node) {
		if (children.contains(node)) {
			return true;
		}
		for (Node child:children) {
			if (child.containsNode(node)) {
				return true;
			}
		}
		return false;
	}
	
	public void expandNodeCopy(Node node) {
		for (Node child:node.children) {
			addChild(child.clabject);
		}
	}
	
}


