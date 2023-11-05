
//1. Create an abstract class BoundedShape with ﬁelds x, y. Provide abstract method calcArea(). Inherit it into a Circle class with additional ﬁelds radius and
//override calcArea() method. Inherit BoundedShape into another abstract class Polygon with additional ﬁeld number of sides. Inherit BoundedShape into
//classes Triangle (ﬁelds: side1, side2, side3), Square (ﬁelds: side), and Rectangle (ﬁelds: length, breadth). Override calcArea() method in them.

package aggignment1;

import java.util.Scanner;

public abstract class Polygon extends BoundedShape{
	int noOfSides;
	
	public Polygon() {
		
	}
	public int getNoOfSides() {
		return noOfSides;
	}

	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}

    public abstract void  calArea();
	public abstract void acceptShape(Scanner sc);
	
		
}