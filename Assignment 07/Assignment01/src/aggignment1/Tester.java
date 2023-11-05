package aggignment1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Polygon s1 = new Square(3);
		
		s1.calArea();
		s1.acceptShape(sc);
		s1.calArea();
		
		
	Polygon s2 = new Triangle();
		
		//s2.calArea();
		s2.acceptShape(sc);
		s2.calArea();
		
	Polygon s3 = new Rectangle();
		
//		s3.calArea();
		s3.acceptShape(sc);
		s3.calArea();
		
		BoundedShape c1 = new Circle();
		c1.acceptShape(sc);
		c1.calArea();
	}

}
