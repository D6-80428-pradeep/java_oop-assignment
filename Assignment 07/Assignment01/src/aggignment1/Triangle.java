package aggignment1;

import java.util.Scanner;

public class Triangle extends Polygon {
	
	int side1;
	int side2;
	int side3;
	
	
	public void acceptShape(Scanner sc) {
		
		System.out.print("Enter side1 :");
		side1 = sc.nextInt();
		System.out.print("Enter side2 :");
		side2 = sc.nextInt();
		System.out.print("Enter side3 :");
		side3 = sc.nextInt();
	}
	
	public Triangle() {
	
	}
	
	

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}



	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}



	@Override
	public void calArea() {
		double s = (side1 + side2 + side3)/2;
		
		double area = Math.sqrt(s*((s-side1) * (s- side2)* (s-side3)));
		
		System.out.println("Area of triangle = "+area);
		
	}
	
	

}
