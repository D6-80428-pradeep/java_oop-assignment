package com.sunbeam;

public class Manager implements Emp {
	double basicSalary;
	double dearanceAllowance;
	
	public Manager() {
	}
	
	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {
		return basicSalary + dearanceAllowance;
	}
	
	@Override
	public double calcIncentives() {
		return (basicSalary * 0.2);
	}
}
