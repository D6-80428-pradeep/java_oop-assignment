package com.sunbeam;

import java.util.Comparator;

public class BookPriceDescComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		int diff = Double.compare(o1.getPrice(), o2.getPrice());
		return -diff;
	}

}
