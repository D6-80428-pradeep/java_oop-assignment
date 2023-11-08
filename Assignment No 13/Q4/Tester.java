package Q4;
//TreeSet
//it gives error as duplicate values are not supported in TreeSet.
//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
//and books will be sorted in ascending order using TreeSet according to isbn.

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester{

	public static void main(String[]args) {
//TreeSet
//it gives error as duplicate values are not supported in TreeSet.
//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
//and books will be sorted in ascending order using TreeSet according to isbn.
		Set <Book> library = new TreeSet<Book>();
		Collections.addAll(library, 
				new Book("1",200.20,"Bhushan",2),
				new Book("3",205.50,"Sumit",10),
				new Book("2",230.60,"Ramesh",8),
				new Book("7",300.80,"Suresh",6),
				new Book("2",600.70,"Ganesh",1),
				new Book("9",800.20,"Vaibhav",5));
		
		Iterator <Book> itr = library.iterator();
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
			
//TreeSet
//it gives error as duplicate values are not supported in TreeSet.
//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
//and books will be sorted in ascending order using TreeSet according to isbn.
	}
}


