package assign10_03;

public class Book implements Displayable {
	
	private String name;
	private double price;
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	// ...
	@Override
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
	}

	@Override
	public String toString() {
		return String.format("Book [name=%s, price=%s]", name, price);
	}
	
	
	
}
