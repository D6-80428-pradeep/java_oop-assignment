package com.sunbeam;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Employee> employees = new PriorityQueue<>(new EmployeeDescSalaryComparator());
		
		employees.offer(new Employee(12,"Praneet",25,2000));
		employees.offer(new Employee(11,"Sushil",26,2400));
		employees.offer(new Employee(13,"Akhilesh",29,3000));
		employees.offer(new Employee(14,"Atharva",23,2100));
		employees.offer(new Employee(15,"Amar",22,2300));
		employees.offer(new Employee(16,"Yash",25,2900));
		
		for(int i = 0; i < employees.size(); i++) {
			System.out.println(employees.peek());
		}
		
		System.out.println("Insertion order");
		while(!employees.isEmpty()) {
			System.out.println(employees.poll()); 
		}
		
	}

}
