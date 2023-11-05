
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

package assignment05;

import assignment01.string;

public class Clerk extends Employee {
	
	
	@Override
	public double calSal() {
		
		return Salary;
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	
}
