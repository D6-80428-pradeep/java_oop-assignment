package Q5;

import java.util.Comparator;
//TreeSet
//it gives error as duplicate values are not supported in TreeSet.
//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
//To display books in Descending order by price we have to use comparator, after using comparator the comparable is disabled
//Books will be displayed in descending order after using iterator to display them and they will be sorted in reverse order i.e. in ascending order
//after using descendingiterator();

public class Bookcomparator implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		int diff = - (int) (book1.getPrice() - book2.getPrice());
		return diff;
	}


}
