package tester;

import com.app.geometry.Point2D;

public class TestPoint {
	 
	public static boolean isEqual(Point2D a1 , Point2D a2) {
		if(a1.getX_axis() == a2.getX_axis() && a1.getY_axis() == a2.getY_axis()) {
			System.out.println("p1 & p2 are at same point");
			return true;
		}
		return false;
	}
	
	public static int calculateDistance(Point2D a1 , Point2D a2) {
		//d=√((x2 – x1)² + (y2 – y1)²)
		int xaxis = (a2.getX_axis() - a1.getX_axis())*(a2.getX_axis() - a1.getX_axis());
		int yaxis = (a2.getY_axis() - a1.getY_axis()) * (a2.getY_axis() - a1.getY_axis());
		int distance =  (int) Math.sqrt(xaxis + yaxis);
		
		return distance;
	}
	
	
	

}
