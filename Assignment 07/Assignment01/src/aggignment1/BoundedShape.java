package aggignment1;

import java.util.Scanner;

public abstract class BoundedShape {
	int x;
	int y;
	
	public BoundedShape() {
		
	}
	public abstract void calArea();
	public abstract void acceptShape(Scanner sc);
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
