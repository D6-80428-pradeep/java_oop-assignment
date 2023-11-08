package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int age;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Employee() {
		this(0,"",0,0.0);
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int age, double salary) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, age=%s, salary=%s]", id, name, age, salary);
	}
	@Override
	public int compareTo(Employee o) {
		int diff = id - o.id;
		return diff;
	}
	
	public void acceptDetails(Scanner sc) {
		System.out.println("Enter id");
		id = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter salary");
		salary = sc.nextDouble();
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
	
	
	
	
	
	
}
