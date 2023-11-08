package Q2;

import java.util.Arrays;

public class Tester {
	public static void main(String [] args) {
		Student [] student = {
			new Student(1,"Bhushan","Ratnagiri",50.6),
			new Student(4,"Vaibhav","Khamgaon",100.0),
			new Student(10,"Susheel","Kudal",100.0),
			new Student(8,"Guarav","Kudal",82.0),
			new Student(5,"Prasad","Devgad",10.0),
			new Student(12,"Saurav","Kudal",100.0),
		};
		
		Arrays.sort(student, new Studentcomparator());

		for (Student ele : student) {
			System.out.println(ele);
		}
		
		
	}
}
