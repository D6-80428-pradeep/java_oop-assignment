package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class Main {

	public static void main(String[] args) {
		
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		
		System.out.println("enter co ordinates of 1st point :");
		p1.acceptPoint();
		System.out.println("enter co ordinates of 2nd point :");
		p2.acceptPoint();
		
		if(!(TestPoint.isEqual(p1, p2))) {
			int result = TestPoint.calculateDistance(p1, p2);
			System.out.println("Distance between 2 points : " + result + " units");
		}else {
			System.exit(0);
		}
	}
	
}
