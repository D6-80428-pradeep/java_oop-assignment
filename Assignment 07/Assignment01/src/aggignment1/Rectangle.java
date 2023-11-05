package aggignment1;

import java.util.Scanner;

public class Rectangle extends Polygon {
		int length ;
		int breath;
		
		public Rectangle() {
			// TODO Auto-generated constructor stub
		}
		
		
		public Rectangle(int length, int breath) {
			super();
			this.length = length;
			this.breath = breath;
		}
		
		public void acceptShape(Scanner sc) {
			System.out.print("Enter length :");
			length = sc.nextInt();
			System.out.print("Enter Breath :");
			breath = sc.nextInt();
		}


		@Override
		public void calArea() {
			double area = (length * breath);
			System.out.println("Area of Rectangle : "+ area);	
		}


}
