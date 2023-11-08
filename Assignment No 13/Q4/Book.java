package Q4;

//TreeSet
//it gives error as duplicate values are not supported in TreeSet.
//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
//and books will be sorted in ascending order using TreeSet according to isbn.

public class Book implements Comparable<Book>{
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
//TreeSet
//it gives error as duplicate values are not supported in TreeSet.
//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
//and books will be sorted in ascending order using TreeSet according to isbn.
	 
	@Override
	public int compareTo(Book other) {
		int diff = this.getIsbn().compareTo(other.getIsbn());
		return diff;
	}
	
	@Override
		public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
			+ "]";
		}
	//TreeSet
	//it gives error as duplicate values are not supported in TreeSet.
	//To resolve this error, we add comparable i.e. done natural ordering then no need to add equals and hashcode method to print Books.
	//and books will be sorted in ascending order using TreeSet according to isbn.
}
