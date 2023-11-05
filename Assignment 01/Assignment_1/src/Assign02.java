package assigenment1;

import java.util.Scanner;

public class Assign02 {

	public static void main(String[] args) {
		double num1 = 0 ;
		double num2 = 0 ;
		
		System.out.println("Enter 2 decimal values = ");
		Scanner sc = new Scanner(System.in);
		
		if(sc.hasNextDouble()) {
			num1= sc.nextDouble();
			if(sc.hasNextDouble()) {
				num2 = sc.nextDouble();
			}else {
				System.out.println("enter a decimal value ");
				System.exit(0);
			}
		}
		else{
			System.out.println("enter a decimal value ");
			System.exit(0);
		}
		
		double result = (num1 + num2)/2 ;
		System.out.println("average of entered value is : "+ result);
	
		
		
		
	
		
	}
	
	

}
