package com.sunbeam.linkedhashmap;

import java.util.Scanner;
//Store Students in LinkedHashMap<> so that, for given roll, Student can be searched in fastest 
//possible time. Do we need to write equals() and
//hashCode() in Student class?

public class Student {
	private int rollNo;
	private double marks;
	private String name;
	private String city;
	private MenuEnum Emenu;
	
	
	public MenuEnum getEmenu() {
		return Emenu;
	}
	public void setEmenu(MenuEnum emenu) {
		Emenu = emenu;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Student(int rollNo, double marks, String name, String city) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
		this.city = city;
	}
	
	public Student() {
		this(0, 0.0, "", "");
	}
	
	public void acceptData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roll No: ");
		rollNo =scanner.nextInt();
		
		System.out.println("Enter Name: ");
		name = scanner.next();	
		
		System.out.println("Enter Marks: ");
		marks =scanner.nextDouble();
		
		System.out.println("Enter City: ");
		city =scanner.next();
		
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	

}
