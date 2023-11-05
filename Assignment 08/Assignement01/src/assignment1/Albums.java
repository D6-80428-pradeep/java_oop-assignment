
//1. A shop sells diﬀerent types of products like books, music albums, and toys. Book information includes ISBN, title, price, author, and subject. Album
//information includes title, price, singer, and musician. Toy information includes title, price, age group (string), type. Though books are tax free, music
//albums have GST tax of 10% and toys have VAT tax of 5%. Sometimes shop keeper announce a sell, where he apply same percentage discount to every
//purchased products. Assuming that each customer can purchase maximum 5 products at a time, write a menu driven program so that each user can
//purchase products of his choice. At the end display total bill (including tax) to be paid by customer and total revenue of shop (excluding tax). Design
//appropriate classes and their relations.

package assignment1;

import java.util.Scanner;

public class Albums extends Shop {
	String singer;
	String musician;
	
	public Albums() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Albums(String singer, String musician) {
		super();
		this.singer = singer;
		this.musician = musician;
	}
	
	
	

	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	public String getMusician() {
		return musician;
	}


	public void setMusician(String musician) {
		this.musician = musician;
	}


	@Override
	public void acceptDetails(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptDetails(sc);
		System.out.print("Name of Singer");
		singer = sc.next();
		System.out.print("Name of Singer");
		musician = sc.next();
	}
	
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Singer : "+singer);
		System.out.println("Musician : "+musician);
	}
}
