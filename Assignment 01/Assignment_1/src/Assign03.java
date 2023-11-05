package assigenment1;

import java.util.Scanner;

class menu {
	
	int choice;
	int num;
	
	public void displaymenu() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("0 to EXIT");
		System.out.println("1 Dosa     50rs" );
		System.out.println("2 Samosa   20rs");
		System.out.println("3 Idli     30rs");
		System.out.println("4 Generate Bill");
		this.choice = sc.nextInt();
		//return choi;
	}
	
	public int getchoice() {
		
		return this.choice;
		
	}
	
}

public class Assign03 {

	public static void main(String[] args) {
		menu m1 = new menu();
		int choice = 1;
		int num = 0 ;
		int price = 0;
		int totalBill = 0;
		String dish= "";
		
		
		Scanner sc = new Scanner(System.in);
		
		while(choice != 0) {
			m1.displaymenu();
			choice = m1.getchoice();
			switch(choice) {
			case 0:{
				System.exit(0);
			}
			case 1 :
				{
					System.out.println("Enter Quantity : ");
					int dosa = sc.nextInt();	
					int price1 = 50;
					String dish1 = "Dosa";
					System.out.println("item :"+ dish1  + dosa);
					totalBill = totalBill + price1*dosa;
				}
					break;
			case 2:{
				System.out.println("Enter Quantity : ");
				int samosa = sc.nextInt();
				int price2 = 20;
				String dish2 = "Samosa";
				System.out.println("item :"+ dish2  + samosa);
				totalBill = totalBill +  price2*samosa;
			}
				break;
				
			case 3:{
				System.out.println("Enter Quantity : ");
				int idli = sc.nextInt();
				 int price3 = 30;
				 String dish3 = "Idli";
				 System.out.println("item :"+ dish3  + idli);
				 totalBill = totalBill + price3*idli;
			}
				break;
				
			case 4:
			{
//				System.out.println("You ordered : Dosa   Quantity : "+ dosa);
//				System.out.println();
			
				System.out.println("Amt to be paid : "+ totalBill);
				
				
			}
				break;
				}
		
		
			}
		}
			

}
