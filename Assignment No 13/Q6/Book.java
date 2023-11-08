package Q6;

import java.util.Objects;
import java.util.Scanner;
//we don't need to write equals() and hashCode() in Book class as the datatype of isbn is String so it internally includes equals() and hashCode()

public class Book{
	private String isbn; 
	private double price; 
	private String authorName; 
	private int quantity;
	
	public Book() {

	}

	public Book(String isbn, double price, String authorName, int quantity) {
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
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
	
	public void acceptData() {
		Book b = new Book();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book no :- ");
		isbn = sc.next();
		
		System.out.println("Enter Price :- ");
		price = sc.nextDouble();
		
		System.out.println("Enter Author name :- ");
		authorName = sc.next();
		
		System.out.println("Quantity :- ");
		quantity = sc.nextInt();
		

	}

	@Override
	public String toString() {
	return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
		+ "]";
	}

}
		
