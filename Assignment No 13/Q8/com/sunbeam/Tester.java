package com.sunbeam;

public class Tester {
	public static void main(String[] args) {
		Emp[] arr = new Emp[5];
		
		arr[0] = new Manager(10000, 300);
		arr[1] = new Clerk(30000);
		arr[2] = new Labor(100, 500);
		arr[3] = new Manager(20000, 700);
		arr[4] = new Clerk(50000);
		
		System.out.println("Total income - " + Emp.calcTotalIncome(arr));
	}
}
