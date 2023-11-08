package Q6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//we don't need to write equals() and hashCode() in Book class as the datatype of isbn is String so it internally includes equals() and hashCode()
public class Tester{

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		// declare map: key=isbn, value=Book object
		Map<String,Book> map = new HashMap<>();
		
		// case 1: insert in map
		
		for(int i = 1; i<4; i++) {
			Book b = new Book();
			b.acceptData();
		// accept book from user
			map.put(b.getIsbn(), b);
		}
		
		System.out.println("display all books :- ");
		Set<Entry<String,Book>> entries = map.entrySet();
		for(Entry<String,Book> en: entries) {
			System.out.println(en.getKey() + "-----" + en.getValue());
			
		}
		
				// case 2: find in map
		System.out.println("Enter the id of book to be fetched :- ");
		String isbn = sc.next();
		Book f = map.get(isbn);
		System.out.println(f);
		
	
		
	
	}
}


