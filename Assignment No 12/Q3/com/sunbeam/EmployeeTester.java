package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuEnum choice;
		List<Employee> employees = new LinkedList<>();
		
		do {
			choice = menu(sc);
			
			switch(choice) {
				case EXIT:
					
					break;
				case ADD:
					Employee emp = new Employee();
					emp.acceptDetails(sc);
					employees.add(emp);
					break;
				case DELETE:
					int id;
					System.out.println("Enter id of employee to be deleted");
					id = sc.nextInt();
					Employee emp1 = new Employee();
					emp1.setId(id);
					if(employees.indexOf(emp1) != -1) {
						int index = employees.indexOf(emp1);
						employees.remove(index);
						
					}else {
						System.out.println("No such employee present");
					}
					break;
				case FIND:
					System.out.println("Enter id of employee to be searched");
					id = sc.nextInt();
					emp1 = new Employee();
					emp1.setId(id);
					if(employees.indexOf(emp1) != -1) {
						int index = employees.indexOf(emp1);
						emp1 = employees.get(index);
						System.out.println("Employee details");
						System.out.println(emp1.toString());
						
					}else {
						System.out.println("No such employee present");
					}
					
					break;
				case SORT:
					Collections.sort(employees);
					System.out.println(employees.toString());
					break;
				case EDIT:
					System.out.println("Enter emp id to be modified: ");
					 id = sc.nextInt();
					Employee key = new Employee();
					key.setId(id);
					int index = employees.indexOf(key);
					if(index == -1)
					    System.out.println("Employee not found.");
					else {
					    Employee oldEmp = employees.get(index);
					    System.out.println("Employee Found: " + oldEmp);
					    System.out.println("Enter new information for the Employee");
					    Employee newEmp = new Employee();
					    newEmp.acceptDetails(sc);
					    employees.set(index, newEmp);
					}
					break;
				default:
					System.out.println("Wrong choice...");
					
			}
			
		}while(choice != MenuEnum.EXIT);
	}
	
	static MenuEnum menu(Scanner sc) {
		MenuEnum[] menu = MenuEnum.values();
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Find Employee");
		System.out.println("4. Sort Employee ");
		System.out.println("Enter you choice");
		choice = sc.nextInt();
		if(choice < 0 || choice > 5) {
			choice = 6;
		}
		return menu[choice];
	}

}
