package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable<Book>{

	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Book() {
		
	}
	
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return String.format("Book [isbn=%s, price=%s, authorName=%s, quantity=%s]", isbn, price, authorName, quantity);
	}
	@Override
	public int hashCode() {
		return Objects.hash(authorName, isbn, price, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return this.isbn.equals(other.isbn);
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter ISBN");
		isbn = sc.next();
		System.out.println("Enter price");
		price = sc.nextDouble();
		System.out.println("Enter author name");
		authorName = sc.next();
		System.out.println("Enter quantity");
		quantity = sc.nextInt();
		
	}
	@Override
	public int compareTo(Book o) {
		int diff = isbn.compareTo(o.isbn);
		return diff;
	}
	
	
}
