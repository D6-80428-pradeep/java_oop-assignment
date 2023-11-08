package com.sunbeam.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Menu {
	
	public static int menu() {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("0.EXIT");
		System.out.println("1. Accept Student Data");
		System.out.println("2. Display all students");
        System.out.println("3. Search a Student with roll no.");
        //System.out.println("4. Sort Student According to marks");
	    
        System.out.println("Enter your choice: ");
	    choice =sc.nextInt();
	    return choice;
	}
	
	public static void main(String[] args) {
		
		Map<Integer, Student> studentMap = new LinkedHashMap<>();
		  int choice;
		while((choice=menu())!=0) {
			
		switch (choice) {
	    	case 0:
	    		break;
	    		
	    	case 1:
				Student student = new Student();
				student.acceptData();
				studentMap.put(student.getRollNo(), student);
				
				break;
				
			case 2:
				if(studentMap!=null) {
				System.out.println("Details of all Students:-");
				Set<Entry<Integer, Student>> studEntry = studentMap.entrySet();
				   for(Entry<Integer, Student> en : studEntry) {
					   System.out.println(en.getKey()+" : "+ en.getValue());
				   }
				}
				 
					System.out.println("Please add atleast 1 student");
				
				   
				   break;
				   
			case 3:
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Roll no. to be searched: ");
				int roll = sc.nextInt();
				Student stud = studentMap.get(roll);
				System.out.println(stud);
				
				break;
				
			//case 4:
				
				
				

			default:
				System.out.println("Wrong choice!!!");
				break;
			}
	    	
	    }
	   
		
	}

}
