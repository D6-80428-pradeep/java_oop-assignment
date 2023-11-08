package Q3;

import java.util.Objects;
//LinkedHashSet
//if we add hashcode along with equals method then only LinkedHashSet will not print duplicate values, no need to use comparable or comparator here
//and books will be printed in the order entered by user using LinkedHashSet

public class Book {
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
//LinkedHashSet	
//if we add hashcode along with equals method then only LinkedHashSet will not print duplicate values, no need to use comparable or comparator here
//and books will be printed in the order entered by user using LinkedHashSet
	
	 @Override 
	 public int hashCode() { 
		 int hash = Objects.hash(isbn); 
		 return hash;
	  }
	 
//LinkedHashSet
//if we add hashcode along with equals method then only LinkedHashSet will not print duplicate values, no need to use comparable or comparator here
//and books will be printed in the order entered by user using LinkedHashSet
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Book) {
			Book other = (Book) obj;
			if(this.isbn.equals(other.isbn))
				return true;
	}
		return false; 
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
//LinkedHashSet
//if we add hashcode along with equals method then only LinkedHashSet will not print duplicate values, no need to use comparable or comparator here
//and books will be printed in the order entered by user using LinkedHashSet
}
