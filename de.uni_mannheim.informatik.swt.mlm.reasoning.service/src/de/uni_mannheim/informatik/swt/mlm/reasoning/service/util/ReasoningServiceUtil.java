package de.uni_mannheim.informatik.swt.mlm.reasoning.service.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

}


