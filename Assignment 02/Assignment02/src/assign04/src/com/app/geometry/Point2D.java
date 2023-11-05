



package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	int X_axis;
	int Y_axis;
	
		public Point2D() {
			this(0,0);
		}
		
	
		public Point2D(int x_axis, int y_axis) {
			X_axis = x_axis;
			Y_axis = y_axis;
		}
			
		
		public String getDetails() {
			String details = "X_axis"+"," + "Y_axis";
			System.out.println("(x,y) = "+ details);
			return (String)details;
		}
//		
//		public boolean addEqual(){
//			if(this.X_axis == this.Y_axis) {
//				return true;
//	        }else 
//		      return false;
//		}


		public int getX_axis() {
			return X_axis;
		}


		public void setX_axis(int x_axis) {
			X_axis = x_axis;
		}


		public int getY_axis() {
			return Y_axis;
		}


		public void setY_axis(int y_axis) {
			Y_axis = y_axis;
		}
		
		public void acceptPoint() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter X co-ordinate :");
			X_axis = sc.nextInt();
			System.out.print("Enter Y co-ordinate :");
			Y_axis = sc.nextInt();
		}
		
		public void displayPoint(){
			
			System.out.println("Co-ordinate of X-axis : "+ X_axis);
			System.out.println("Co-ordinate of Y-axis : "+ Y_axis);
			
		}
		
		
}

	