
//Write a Person class with ﬁelds (name, age) and appropriate constructors + getter/setters + equals(). Write an Employee class inherited from Person class
//with additional ﬁelds (id and salary). Add abstract method double calcSalary(). Write a Labor class inherited from Employee class with additional ﬁelds
//(rate and hours). Override calcSalary() as hours * rate. Write a Salesman class inherited from Employee class with additional ﬁelds (target and
//Prepared by: Nilesh Ghule 14 / 15Sunbeam Institute of Information Technology, Pune and Karad day08.md
//27/10/2023
//commission). Override calcSalary() as salary + commission. Write a Clerk class with no additional ﬁelds and calcSalary() returns basic salary only. The
//setter methods of all classes should throw a custom exception EmployeeException (with additional ﬁeld - invalidValue), if invalid values are set. Create
//Employees helper class helper methods as follows. In main(), create array of Employees and initialize with appropriate objects. Call these Employees
//helper methods and display results.
//double averageSalManagers(Employee[] arr);
//double averageSalSalesmans(Employee[] arr);
//double averageSalClerks(Employee[] arr);

package assignment01;

import java.util.Scanner;

public class Labour extends Employee {
	double rate ;
	double hour;
	
	public Labour() {
		
	}

	public Labour(double rate, double hour) {
		super();
		this.rate = rate;
		this.hour = hour;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		if(rate< 0) {
			throw new ExceptionHandling();
		}
		this.rate = rate;
	}

	public double getHour() {
		
		return hour;
	}

	public void setHour(double hour) {
		if(hour < 0) {
			throw new ExceptionHandling();
		}
		this.hour = hour;
	}
	
	@Override
	public double calSal() {
		double sal = hour * rate;
		return sal;
	}
	
	@Override
	public void acceptDetails(Scanner sc) {
		super.acceptDetails(sc);
		System.out.print("Enter no of hours worked : ");
		hour= sc.nextDouble();
		System.out.print("Enter rate per hour : ");
		rate = sc.nextDouble();
	}
	
	@Override
	public void displayDetails() {
		
		super.displayDetails();
		System.out.println("Hours worked :"+hour);
		System.out.println("Rates per Hour :"+rate);
		System.out.println("Total salary :"+calSal());
	}

	@Override
	public String toString() {
		super.toString();
		return  String.format("Hours : %d , Rate : %d \n", this.hour,this.rate);
	}
	
	
}
