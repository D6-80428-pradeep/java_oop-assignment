
//Write a Person class with ﬁelds (name, age) and appropriate constructors + getter/setters + equals(). Write an Employee class inherited from Person class
//with additional ﬁelds (id and salary). Add abstract method double calcSalary(). Write a Labor class inherited from Employee class with additional ﬁelds
//(rate and hours). Override calcSalary() as hours * rate. Write a Salesman class inherited from Employee class with additional ﬁelds (target and
//Prepared by: Nilesh Ghule 14 / 15Sunbeam Institute of Information Technology, Pune and Karad day08.md
//27/10/2023
//commission). Override calcSalary() as salary + commission. Write a Clerk class with no additional ﬁelds and calcSalary() returns basic salary only. The
//setter methods of all classes should throw a custom exception EmployeeException (with additional ﬁeld - invalidValue), if invalid values are set. Create
//Employees helper class helper methods as follows. In main(), create array of Employees and initialize with appropriate objects. Call these Employees
//helper methods and display results.

package assignment2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		System.out.println("hello");
		Employee []employee = new Employee[5];
		
		Scanner sc = new Scanner(System.in);
		try {
			employee[0] = new Employee();
			employee[0].acceptDetails(sc);
			employee[0].displayDetails();
			
			//employee[0].displayDetails();
			//employee[0].setSalary(-1999);
			
			employee[1] = new Employee();
			employee[1].acceptDetails(sc);
			//employee[1].displayDetails();
			
			employee[1].displayDetails();
			
			employee[2] = new Salesman();
			employee[2].acceptDetails(sc);
			//employee[2].displayDetails();
			
			employee[2].displayDetails();
			
			employee[3] = new Salesman();
			employee[3].acceptDetails(sc);
			employee[3].displayDetails();
			employee[3].calSal();
			employee[3].displayDetails();
		}catch (ExceptionHandling e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("average salary of labours :"+ Employees.averageSalSalesmans(employee) );
		sc.close();
	}

}
