package com.sunbeam;

import java.util.Comparator;

public class EmployeeDescSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int diff = Double.compare(o1.getSalary(), o2.getSalary()); 
		return -diff;
	}

}
