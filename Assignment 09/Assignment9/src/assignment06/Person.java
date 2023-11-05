package assignment06;

import java.util.Scanner;

import assignment01.string;

public class Person {
	
	String name ;
	int age ;
	String Gender;
	
	public Person() {
		
	}
	
	
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		Gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	public void accept(Scanner sc) {
		
		System.out.print("Enter name :");
		name = sc.next();
		
		System.out.print("Enter age :");
		age = sc.nextInt();
		
//		System.out.print("Enter Gender :");
//		Gender = sc.next();
	}
	
	public void display() {
		System.out.printf("NAME : %s  AGE %d  GENDER %s \n",this.name , this.age, this.Gender );
	}
	
	
	
}
