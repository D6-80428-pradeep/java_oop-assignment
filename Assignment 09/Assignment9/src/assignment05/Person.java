package assignment05;

import java.util.Scanner;

public abstract class Person {
	String fName;
	String lName;
	int age;
	
	public Person() {
		
	}

	
	public Person(String fName, String lName, int age) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public abstract double calSal();
	
	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void acceptDetails(Scanner sc) {
		
		System.out.print("Enter first name of Employee :");
		fName = sc.next();
		System.out.print("Enter last name Employee :");
		lName = sc.next();
		System.out.print("Enter age :");
		age = sc.nextInt();
		
	}
	
	public void displayDetails() {
		
		System.out.println("Name :"+fName+" "+lName);
		System.out.println("Age :"+age);
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [fName=");
		builder.append(fName);
		builder.append(", lName=");
		builder.append(lName);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	

	
	
	
	
}
