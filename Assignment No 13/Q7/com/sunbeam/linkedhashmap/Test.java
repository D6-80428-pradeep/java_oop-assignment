package com.sunbeam.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Map<Integer, Student> studentMap = new LinkedHashMap<>();
		
		System.out.println("Enter number of Students: ");
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		
		for(int i=1; i<=a; i++) {
		Student s = new Student();
		s.acceptData();
		
		
		studentMap.put(s.getRollNo(), s);
		
	   Set<Entry<Integer, Student>> studEntry =	studentMap.entrySet();
	   for(Entry<Integer, Student> en : studEntry) {
		   System.out.println(en.getKey()+" : "+ en.getValue());
	   }
		
		}
		
		System.out.println("Enter the Roll no. to be searched: ");
		int roll = scanner.nextInt();
		Student stud = studentMap.get(roll);
		System.out.println(stud);
		
	}

}
