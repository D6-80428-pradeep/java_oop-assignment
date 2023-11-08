package Q5;
//TreeSet
//it gives error as duplicate values are not supported in TreeSet.
//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
//To display books in Descending order by price we have to use comparator, after using comparator the comparable is disabled
//Books will be displayed in descending order after using iterator to display them and they will be sorted in reverse order i.e. in ascending order
//after using descendingiterator();

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tester{

	public static void main(String[]args) {
//TreeSet
//it gives error as duplicate values are not supported in TreeSet.
//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
//To display books in Descending order by price we have to use comparator, after using comparator the comparable is disabled
//Books will be displayed in descending order after using iterator to display them and they will be sorted in reverse order i.e. in ascending order
//after using descendingiterator();
		TreeSet <Book> library = new TreeSet<Book>(new Bookcomparator());
		Collections.addAll(library, 
				new Book("1",200.20,"Bhushan",2),
				new Book("3",905.50,"Sumit",10),
				new Book("2",30.60,"Ramesh",8),
				new Book("7",430.80,"Suresh",6),
				new Book("2",800.70,"Ganesh",1),
				new Book("9",600.20,"Vaibhav",5));
		
		Iterator <Book> itr = library.iterator();
		while(itr.hasNext()) {
			Book ele = itr.next();
			System.out.println(ele);
		}
		System.out.println("***********************************************************");
		Iterator<Book> itr1 = library.descendingIterator();
		while(itr1.hasNext()) {
			Book ele1 = itr1.next();
			System.out.println(ele1);
		}
				
//TreeSet
//it gives error as duplicate values are not supported in TreeSet.
//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
//To display books in Descending order by price we have to use comparator, after using comparator the comparable is disabled
//Books will be displayed in descending order after using iterator to display them and they will be sorted in reverse order i.e. in ascending order
//after using descendingiterator();
	}
}


