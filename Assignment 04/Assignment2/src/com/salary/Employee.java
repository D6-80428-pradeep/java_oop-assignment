package com.salary;

import java.util.Scanner;

public abstract class Employee {
	String fName;
	String lName;
	int ssNo;
	
	public void acceptEmployee(Scanner sc) {
		System.out.print("Enter first name :");
		fName = sc.next();
		System.out.print("Enter last name :");
		lName = sc.next();
		System.out.print("Enter Social security mo. :");
		ssNo= sc.nextInt();
	}
	public void displayEmployee() {
		System.out.println("Name :"+fName+" "+lName);
		System.out.println("SSN : "+ssNo);
	}
	
	public abstract void calculateSalary();

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

	public int getSsNo() {
		return ssNo;
	}

	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}
	
	
}
