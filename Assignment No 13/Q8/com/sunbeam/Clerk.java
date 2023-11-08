package com.sunbeam;

public class Clerk implements Emp {
	double salary;
	
	public Clerk() {
	}

	public Clerk(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSal() {
		return salary;
	}
}
