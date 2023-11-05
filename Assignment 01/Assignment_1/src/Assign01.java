package assigenment1;

import java.util.Scanner;

public class Assign01 {
		
	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no.");
		num1 = sc.nextInt();
		
		System.out.println("you entered a number = "+ num1);
		
		String binnum1 = Integer.toBinaryString(num1);
		System.out.println("In Binary format = "+ binnum1);
		
		String num1hex = Integer.toHexString(num1);
		System.out.println("In hexadecimal format" +num1hex);
		
		String num1oct = Integer.toOctalString(num1);
		System.out.println("In octal format" +num1oct);
		
}

	
}