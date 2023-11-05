package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	
	String name;
	String color;
	double weight;
	String isFresh;
	String taste;

	public Fruit() {
		
	}
	public String taste() {
		String taste = "No specific taste";
		return taste;
	}
	
	public abstract void acceptFruit(Scanner sc);
	public abstract void displayFruit();
	//public abstract boolean isFresh(Scanner sc);
	
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", weight=" + weight + ", taste=" + taste + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public String getIsFresh() {
		return isFresh;
	}
	public void setIsFresh(String isFresh) {
		this.isFresh = isFresh;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	public boolean isFresh(Scanner sc) {
		System.out.println("Is fruit fresh :1. Yes or 2 No");
		int no = sc.nextInt();
		if(no==1) {
			return true;
		}else
			return false;
	}
	
	
	
	
}
