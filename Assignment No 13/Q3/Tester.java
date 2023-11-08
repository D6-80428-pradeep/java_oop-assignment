package Q3;
//LinkedHashSet
//if we add hashcode along with equals method then only LinkedHashSet will not print duplicate values, no need to use comparable or comparator here
//and books will be printed in the order entered by user using LinkedHashSet

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tester {

	public static void main(String[]args) {
//LinkedHashSet
//if we add hashcode along with equals method then only LinkedHashSet will not print duplicate values, no need to use comparable or comparator here
//and books will be printed in the order entered by user using LinkedHashSet
		Set <Book> library = new LinkedHashSet<Book>();
		Collections.addAll(library, 
				new Book("1",200.20,"Bhushan",2),
				new Book("3",205.50,"Sumit",10),
				new Book("2",230.60,"Ramesh",8),
				new Book("7",300.80,"Suresh",6),
				new Book("2",600.70,"Ganesh",1),
				new Book("11",800.20,"Vaibhav",5));
		
		Iterator <Book> itr = library.iterator();
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}

//LinkedHashSet
//if we add hashcode along with equals method then only LinkedHashSet will not print duplicate values, no need to use comparable or comparator here
//and books will be printed in the order entered by user using LinkedHashSet
	}
}


