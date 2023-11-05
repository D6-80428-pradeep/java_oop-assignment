package aggignment1;

import java.util.Scanner;

public class Circle extends BoundedShape {

	int Radius;
	static double PI = 3.14;
	
	public Circle() {
		
	}
	
	
	public Circle(int radius) {

		Radius = radius;
	}


	public int getRadius() {
		return Radius;
	}


	public void setRadius(int radius) {
		Radius = radius;
	}


	public static double getPI() {
		return PI;
	}


	public static void setPI(double pI) {
		PI = pI;
	}


	@Override
	public void calArea() {
		double area = PI * (Radius * Radius);
		System.out.println("Area of Circle :"+ area);
	}
	
	public void acceptShape(Scanner sc) {
		System.out.print("Enter radius of circle");
		Radius = sc.nextInt();
	}

}
