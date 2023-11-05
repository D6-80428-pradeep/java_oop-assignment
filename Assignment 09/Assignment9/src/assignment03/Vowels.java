package assignment03;

import java.util.Scanner;

public class Vowels {
	
	public static void endWithVowel(String []arr1) {
		
		for(String element : arr1) {
			char ch = element.charAt(element.length()- 1);
			
			if(ch == 'a' || ch =='A') {
				System.out.println(element);
			}if(ch == 'e' || ch =='E') {
				System.out.println(element);
			}if(ch == 'i' || ch =='I') {
				System.out.println(element);
			}if(ch == 'O' || ch =='o') {
				System.out.println(element);
			}if(ch == 'u' || ch =='U') {
				System.out.println(element);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		String [] arr = new String[5];
		
		arr[0] = new String("rahul");
		arr[1] = new String("chintu");
		arr[2] = new String("khatri");
		arr[3] = new String("mishra");
		arr[4] = new String("praveen");
		
//		for(int i = 0 ;i < arr.length ; i++) {
//			arr[i] = new String();
//			arr[i] = sc.next();
//			
//		}
		
		endWithVowel(arr);
		
		
		

	}

}
