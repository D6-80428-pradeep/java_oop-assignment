
//1. A shop sells diﬀerent types of products like books, music albums, and toys. Book information includes ISBN, title, price, author, and subject. Album
//information includes title, price, singer, and musician. Toy information includes title, price, age group (string), type. Though books are tax free, music
//albums have GST tax of 10% and toys have VAT tax of 5%. Sometimes shop keeper announce a sell, where he apply same percentage discount to every
//purchased products. Assuming that each customer can purchase maximum 5 products at a time, write a menu driven program so that each user can
//purchase products of his choice. At the end display total bill (including tax) to be paid by customer and total revenue of shop (excluding tax). Design
//appropriate classes and their relations.

package assignment1;

import java.util.Scanner;

public class Books extends Shop{
	int ISBN ;
	String author;
	String subject;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}

	public Books(int iSBN, String author, String subject) {
		super();
		ISBN = iSBN;
		this.author = author;
		this.subject = subject;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public void acceptDetails(Scanner sc) {
		super.acceptDetails(sc);
		
		System.out.print("Enter ISBN :");
		ISBN = sc.nextInt();
		System.out.print("Enter name of Author :");
//		sc.next();
//		sc.nextLine();
		author = sc.next();
		System.out.print("Enter name of Subject :");
//		sc.next();
//		sc.nextLine();
		subject = sc.nextLine();
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		
		System.out.println(" ISBN :"+ISBN);
		System.out.println(" Author :"+author);
		System.out.println(" Subject :"+subject);
	}
	
	
	
}
