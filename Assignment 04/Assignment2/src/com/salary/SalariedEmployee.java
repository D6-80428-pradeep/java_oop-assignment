package com.salary;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	
	double weeklySalary;
	
	public SalariedEmployee() {
		
	}
	
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.print("Enter weekly salary : ");
		weeklySalary = sc.nextDouble();
	}

		@Override
		public void displayEmployee() {
			super.displayEmployee();
			System.out.println("Weekly salary : "+weeklySalary);
		}
	@Override
	public void calculateSalary() {
	

	}

}
