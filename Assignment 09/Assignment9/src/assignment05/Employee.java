package assignment05;

import java.util.Scanner;

public class Employee extends Person {
	
	int Id;
	double Salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, double salary) {
		super();
		Id = id;
		Salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		if(salary < 0) {
			throw new ExceptionHandling();
		}
		Salary = salary;
	}
	
	@Override
	public void acceptDetails(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptDetails(sc);
		System.out.print("Enter Id :");
		Id = sc.nextInt();
		
		System.out.print("Enter Salary :");
		Salary = sc.nextDouble();
	}
	
		@Override
	public void displayDetails() {
			// TODO Auto-generated method stub
			super.displayDetails();
			System.out.println("ID :"+Id);
			System.out.println("Salary :"+Salary);
		}

	@Override
	public double calSal() {
		
		return Salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [Id=");
		builder.append(Id);
		builder.append(", Salary=");
		builder.append(Salary);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
