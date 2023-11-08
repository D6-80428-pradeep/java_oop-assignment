package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookTester {

	public static void main(String[] args) {
		MenuEnums choice;
		Scanner sc = new Scanner(System.in);
		//choice=menu(sc);
		List<Book> library = new ArrayList<>();
		Iterator<Book> itr ;
		do{
			choice = menu(sc);
			
			switch(choice) {
				case EXIT:
					break;
				case ADDBOOK:
					Book book = new Book();
					book.accept(sc);
					if(library.indexOf(book) != -1) {
						int index = library.indexOf(book);
						Book tempBook = library.get(index);
						tempBook.setQuantity(tempBook.getQuantity()+book.getQuantity());
					}else {
						library.add(book);
					}
					break;
				case DISPLAYBOOKINFORWARDORDER:
					System.out.println("***Books details***");
					if(library.size() != 0) {
						for(int i = 0; i < library.size(); i++) {
							System.out.println(library.get(i));
						}
					}else {
						System.out.println("No book is present in library");
					}
					break;
				case DELETEBOOKFORGIVENID:{
					String isbn;
					System.out.println("Enter the id to delete");
					isbn = sc.next();
					Book requestedBook = new Book();
					requestedBook.setIsbn(isbn);
					
					if(library.indexOf(requestedBook) != -1) {
						int index = library.indexOf(requestedBook);
						library.remove(index);
					}else {
						System.out.println("Book to delete not present");
					}
					break;
				}
				case SEARCHBOOKWITHISBN:
					String isbn;
					System.out.println("Enter the id to search: ");
					isbn = sc.next();
					Book requestedBook = new Book();
					requestedBook.setIsbn(isbn);
					if(library.indexOf(requestedBook) != -1) {
						System.out.println("Book with given ISBN is present");
					}else {
						System.out.println("Book with given ISBN not present");
					}
					break;
				case DELETEBOOKFORGIVENINDEX:
					int index;
					System.out.println("Enter the index to be deleted");
					index = sc.nextInt();
					if(index < library.size()) {
						library.remove(index);
					}else {
						System.out.println("Index not present");
					}
					break;
				case DELETEBOOKFORGIVENNAME:
					String authorName;
					System.out.println("Enter the Author name to be deleted: ");
					authorName = sc.next();
					boolean flag = false;
					Book book2 = new Book();
					book2.setAuthorName(authorName);
					
					for(int i = 0; i < library.size(); i++) {
						if(library.get(i).getAuthorName().equals(authorName)) {
							library.remove(library.get(i));
							flag = true;
						}
					}
					if(!flag){
						System.out.println("Author's Book is not present");
					}
					break;
				case SORTBOOKBYISBNASCORDER:
					if(library.size() != 0) {
					Collections.sort(library);
					System.out.println(library.toString());
					}else {
						System.out.println("List is empty");
					}
					break;
				case SORTBOOKBYPRICEDEXCORDER:
					if(library.size() != 0) {
					Collections.sort(library,new BookPriceDescComparator());
					System.out.println(library.toString());
					}else {
						System.out.println("List is empty");
					}
					break;
				case REVERSELIST:
					if(library.size() != 0) {
					Collections.reverse(library);
					System.out.println(library.toString());
					}else {
						System.out.println("List is empty");
					}
					break;
				default:
					System.out.println("Wrong choice...");
			}
			
		}while(choice != MenuEnums.EXIT);
		
	}
	
	static MenuEnums menu(Scanner sc) {
		MenuEnums[] arrEnum = MenuEnums.values();
		int choice;
		System.out.println("***Menu***");
		System.out.println("0.Exit");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn ");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Delete a book with given name.");
		System.out.println("7. Sort books by isbn in asc order");
		System.out.println("8. Sort books by price in desc order");
		System.out.println("9. Reverse the list.");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		if(choice>=arrEnum.length) {
			choice = arrEnum.length-1;
		}
		return arrEnum[choice];
	}

}
