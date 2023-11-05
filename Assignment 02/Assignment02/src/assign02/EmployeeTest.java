//
//Q2. Create a class called Employee that includes three fields—a first name (type String), a last
//name (type String) and a monthly salary (double). Provide a constructor that initializes the three
//instance variables. Provide a set and a get method for each instance variable. If the monthly salary
//is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
//class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.

package assign02;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.displayEmployee();
		
		e1.acceptEmployee();
		e1.displayEmployee();
		
		e1.EmployeeRaise();
		
		e2.displayEmployee();
		
		e2.acceptEmployee();
		e2.displayEmployee();
		
		e2.EmployeeRaise();
	}

}
