package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruit{
	
	public Apple() {
		
		name = "Apple";
		color = "RED";
		
	}
	
	@Override
	public void acceptFruit(Scanner sc) {
		
		System.out.print("Enter Quantity :");
		weight = sc.nextDouble();
		
		
	}

	@Override
	public void displayFruit() {
		System.out.println("Name :"+name);
		System.out.println("color :"+ color);
		System.out.println("Weight :"+weight);
		
	}

	@Override
	public boolean isFresh(Scanner sc) {
		
		return false;
	}
	
	@Override
	public String taste() {
		String taste = "Sweet and sour";
		return taste;
	}
}
