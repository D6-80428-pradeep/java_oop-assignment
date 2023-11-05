//1. A shop sells diﬀerent types of products like books, music albums, and toys. Book information includes ISBN, title, price, author, and subject. Album
//information includes title, price, singer, and musician. Toy information includes title, price, age group (string), type. Though books are tax free, music
//albums have GST tax of 10% and toys have VAT tax of 5%. Sometimes shop keeper announce a sell, where he apply same percentage discount to every
//purchased products. Assuming that each customer can purchase maximum 5 products at a time, write a menu driven program so that each user can
//purchase products of his choice. At the end display total bill (including tax) to be paid by customer and total revenue of shop (excluding tax). Design
//appropriate classes and their relations.

package assignment1;

import java.util.Scanner;

public abstract class Shop {
	
	String title;
	double price;
	
	static double GST = 0.10;
	static double VAT = 0.05;
	public Shop() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Shop(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public static double getGST() {
		return GST;
	}


	public static void setGST(double gST) {
		GST = gST;
	}


	public static double getVAT() {
		return VAT;
	}


	public static void setVAT(double vAT) {
		VAT = vAT;
	}


	public void acceptDetails(Scanner sc) {
		System.out.print("Enter Title :");
		title = sc.next();
		System.out.print("Enter Price :");
		price = sc.nextDouble();
	}
	
	public void displayDetails() {
		System.out.println("Title : "+title);
		System.out.println("Price :"+price);
	}
	
}
