package assign10_03;

public class Car {
	private String name;
	private double price;
	
	
	public Car() {

	}
	public Car(String name, double price) {
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
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
	}
}
