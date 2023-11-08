package Q3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Tester {

	public static int menue() {
		int choice;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("0. Exit");
			System.out.println("1. Add new book in list");
			System.out.println("2. Display all books in forward order");
			System.out.println("3. Delete book of given id");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("Enter your choice :- ");
			choice = sc.nextInt();			
			return choice;
	}
	
	
	
	public static void main(String[]args) {
		Collection <Book> library = new ArrayList<Book>();
		int choice1 ;
		do {
			choice1=menue();
			switch(choice1) {
			case 0:
				System.out.println("Successfully exited the program !!");
				break;
				
			case 1:
				Book b = new Book();
				b.acceptData();
				library.add(b);
				break;
				
			case 2:
				if(library.isEmpty()) {
					System.out.println("The library is empty !!");
				}else {
				Iterator <Book> itr = library.iterator();
				while(itr.hasNext()) {
					Book book = itr.next();
					System.out.println(book);	
				}
				}
				break;
				
			case 3:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Book id of the book to be deleted :- ");
				String id = sc.next();
				Book key = new Book();
				key.setIsbn(id);
				if(library.contains(key))
					library.remove(key);
				else
					System.out.println("Book not found.");
				
				break;
				
				
			case 4:
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter Book id of the book to be search :- ");
				String id1 = sc1.next();
				Book key1 = new Book();
				key1.setIsbn(id1);
				if(library.contains(key1))
					System.out.println("Book found.");
				else
					System.out.println("Book not found.");
				
				break;
				
			case 5:
				library.clear();
				System.out.println("All the books in the library are successfully removed !!");
				break;
					
			case 6:
				if(library.isEmpty()) {
					System.out.println("The library is empty !!");
				}else {
					Book b1 = new Book();
					int size = library.size();
					System.out.println("The number of books in the library are :- " + size);
				}
				
				break;
				
			default :
				System.out.println("Invalid choice!!");
				break;
			}

			
		}while(choice1 != 0);
		
	}
}
