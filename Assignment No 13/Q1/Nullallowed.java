package Q1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Nullallowed {

	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>(); 	//null gets print, duplicated allowed
		Collection<String> c = new HashSet<>();		//only 1 null gets print at the beginning , no duplicated allowed
		//Collection<String> c = new LinkedHashSet<>(); //only 1 null gets print at the end, no duplicated allowed
		//Collection<String> c = new TreeSet<>();  		//nulls are not allowed, throws Exception in thread "main" java.lang.NullPointerException 
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add("Z");
		c.add("F");
		c.add(null);
		c.add(null);
		c.add(null);
		Iterator <String> itr= c.iterator();
		while(itr.hasNext()){
			String ele = itr.next();
			System.out.println(ele);
		}
	}

}
