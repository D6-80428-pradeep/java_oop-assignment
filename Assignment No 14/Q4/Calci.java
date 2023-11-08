package Q4;

import java.util.Scanner;

public class Calci {
	static Scanner sc = new Scanner(System.in);
	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}
	
	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Addition ");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Divison"); 
		System.out.println("Enter your choice :- ");
		int choice = sc.nextInt();
		
		return choice;
		
	}
				
	
	public static void main (String[]args) {
		int choice1;
		do {
		choice1 = menu();
		switch (choice1) {
		case 1:
			System.out.println("Enter 1st number :- ");
			int num1 = sc.nextInt();
			System.out.println("Enter 2nd number :- ");
			int num2 = sc.nextInt();
			calculate(num1,num2,(x,y) -> x+y);
			break;
			
		case 2:
			System.out.println("Enter 1st number :- ");
			int num3 = sc.nextInt();
			System.out.println("Enter 2nd number :- ");
			int num4 = sc.nextInt();
			calculate(num3,num4,(x,y) -> x-y);
			break;
			
		case 3:
			System.out.println("Enter 1st number :- ");
			int num5 = sc.nextInt();
			System.out.println("Enter 2nd number :- ");
			int num6 = sc.nextInt();
			calculate(num5,num6,(x,y) -> x*y);
			break;
			
		case 4:
			System.out.println("Enter 1st number :- ");
			int num7 = sc.nextInt();
			System.out.println("Enter 2nd number :- ");
			int num8 = sc.nextInt();
			calculate(num7,num8,(x,y) -> x/y);
			break;
			
			
			
		}
	}while(choice1!=0);
}
	
}
