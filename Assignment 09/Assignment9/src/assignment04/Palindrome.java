package assignment04;

public class Palindrome {
	
	public static boolean palindrom (StringBuilder s){
		StringBuilder s1 = s.reverse();
//		for(int i = 0 ; i < s1.length() ; i++ ) {
//			
//		}
		if((s.toString()).compareTo(s1.toString()) == 0) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("aabbaa");
		
		boolean s2 = palindrom(s1);
		
		if(s2 == true) {
			System.out.println("string is palindrome ");
		}else
			System.out.println("not palindrome");
	}

}
