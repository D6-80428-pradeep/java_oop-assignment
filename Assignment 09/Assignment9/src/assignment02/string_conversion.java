package assignment02;

import java.security.PublicKey;

public class string_conversion {
	
	
	
	public static void returnShort(String s) {
		
		String [] arr = s.split(" ");
		
//		String res = new String();
		
		for(String element : arr) {
			String r = element.substring(0, 1);
			System.out.print(r.toUpperCase());
		}
		System.out.println();
	}
	
	public static void init(String s) {
		String [] arr = s.split(" ");
		for(String element : arr) {
			String r = element.substring(0, 1);
			System.out.print((r.toUpperCase()).concat(element.substring(1))+" ");
		}
		System.out.println();
	}
	
	public static void alternate(String s) {
		String [] arr = s.split("");
		
		for(int i = 0; i < arr.length;i++) {
			if(i%2 == 0) {
				System.out.print(arr[i].toLowerCase());
			}
			if(i%2 != 0) {
					System.out.print(arr[i].toUpperCase());
			}
		}
		System.out.println();
	}
	
	
	
	public static void replacement(String s) {
		String sn = s.replace("com","in");
		System.out.println(s +" :"+ sn);
	}

	public static void main(String[] args) {
	
		String s1 = "Bank of Maharastra";
		String s2 = "this is string";
		String s3 = "Example";
		String s4 = "www.sunbeaminfo.com";
		System.out.print("Bank of Maharastra : ");
	   returnShort(s1);
	   
	   System.out.print("this is string : ");
	   init(s2);
	   
	   System.out.print(s3 +" : ");
	   alternate(s3);
	   
		replacement(s4);
		
		

	}

}
