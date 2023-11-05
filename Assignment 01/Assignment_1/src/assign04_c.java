import java.util.Scanner;

public class assign04_c {
	
 public static void main(String[] args) {
	
	 
	 int num ;
	 System.out.print("Enter a no :");
	 Scanner sc = new Scanner(System.in);
	 num = sc.nextInt();
	 
	 
	 for(int i = 0 ; i < num ; i++) {
		 for(int j = 0 ; j < (num-1)-i ; j++) {
			 System.out.print(" ");
		 }
		 for(int k = 0 ; k<= i ; k++) {
			 System.out.print("*");
		 }
		 System.out.println("");
	 }
}
}
