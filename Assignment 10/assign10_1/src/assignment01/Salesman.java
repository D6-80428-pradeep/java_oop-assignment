
//Write a Person class with ﬁelds (name, age) and appropriate constructors + getter/setters + equals(). Write an Employee class inherited from Person class
//with additional ﬁelds (id and salary). Add abstract method double calcSalary(). Write a Labor class inherited from Employee class with additional ﬁelds
//(rate and hours). Override calcSalary() as hours * rate. Write a Salesman class inherited from Employee class with additional ﬁelds (target and
//commission). Override calcSalary() as salary + commission. Write a Clerk class with no additional ﬁelds and calcSalary() returns basic salary only. The
//setter methods of all classes should throw a custom exception EmployeeException (with additional ﬁeld - invalidValue), if invalid values are set. Create
//Employees helper class helper methods as follows. In main(), create array of Employees and initialize with appropriate objects. Call these Employees
//helper methods and display results.
//double averageSalManagers(Employee[] arr);
//double averageSalSalesmans(Employee[] arr);
//double averageSalClerks(Employee[] arr);

package assignment01;

import java.util.Scanner;

public class Salesman extends Employee {
	int target;
	double commision;
	
	public Salesman() {
		// TODO Auto-generated constructor stub
	}

	public Salesman(int target, double commision) {
		super();
		this.target = target;
		this.commision = commision;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		if(target < 0) {
			throw new ExceptionHandling();
		}
		this.target = target;
	}

	public double getCommision() {
		
		return commision;
	}

	public void setCommision(double commision) {
		if(commision < 0) {
			throw new ExceptionHandling();
		}
		this.commision = commision;
	}
	
	@Override
	public double calSal() {
		double sal = Salary + commision;
		return sal;
	}
	
	@Override
	public void acceptDetails(Scanner sc) {
		super.acceptDetails(sc);
		System.out.print("Target :");
		target = sc.nextInt();
		System.out.print("Commission :");
		commision = sc.nextDouble();
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		
		System.out.println("Target :"+target);
		System.out.println("Commission :"+commision);
		System.out.println("Total salary :"+calSal());
	}

	@Override
	public String toString() {
		super.toString();
		
		return String.format("Target : %d, Commission : %d",this.target,this.commision);
		
	}
	
	
}
