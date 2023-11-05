import java.util.Scanner;

public class assign04_b {

	public static void main(String[] args) {
		 int num ;
		 System.out.print("Enter a no :");
		 Scanner sc = new Scanner(System.in);
		 num = sc.nextInt();
		 
		 
		 for(int i = 0 ; i < num ; i++) {
			 for(int j = 0 ; j < (num-1)-i ; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 0 ; k <= i; k++) {
				 System.out.print("*");
			 }
			 if(i > 0) {
				 for(int l = 0 ; l < i ; l++) {
					 System.out.print("*");
				 }
			 }
			 System.out.println("");
		 }
		 
		 for(int i = num -1 ; i > 0 ; i--) {
			 for(int j = i ;j < num ; j++) {
				 System.out.print(" ");
			 }
			 for(int k = 0 ; k < i ; k++) {
				 System.out.print("*");
			 }
			 if(i>0) {
				 for(int l = 0 ; l < i-1 ; l++) {
					 System.out.print("*");
				 }
			 }
			 System.out.println("");
		 }
	}

}
