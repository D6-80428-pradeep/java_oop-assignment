package aggignment1;

import java.util.Scanner;

public class Square extends Polygon {
		int sides;
		
		
		
	public Square() {
			
		}
	public Square(int sides) {
			super();
			this.sides = sides;
		}
	public int getSides() {
			return sides;
		}
		public void setSides(int sides) {
			this.sides = sides;
		}
		
	public void acceptShape(Scanner sc) {
		System.out.print("Enter Sides of Square");
		sides = sc.nextInt();
	}
	@Override
	public void calArea() {
		double area = sides*sides;
		System.out.println("Area of Square :" +area);
		
	}


}
