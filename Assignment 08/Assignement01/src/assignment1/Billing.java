

//1. A shop sells diﬀerent types of products like books, music albums, and toys. Book information includes ISBN, title, price, author, and subject. Album
//information includes title, price, singer, and musician. Toy information includes title, price, age group (string), type. Though books are tax free, music
//albums have GST tax of 10% and toys have VAT tax of 5%. Sometimes shop keeper announce a sell, where he apply same percentage discount to every
//purchased products. Assuming that each customer can purchase maximum 5 products at a time, write a menu driven program so that each user can
//purchase products of his choice. At the end display total bill (including tax) to be paid by customer and total revenue of shop (excluding tax). Design
//appropriate classes and their relations.


package assignment1;

import java.util.Scanner;

public class Billing {
	
	public static void main(String[] args) {
		
		Shop [] arr = new Shop[5];
		int index = 0;
		
		
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		 while(choice != 0) {
			 System.out.println("0. EXIT");
			 System.out.println("1. Add a book");
			 System.out.println("2. Add Album");
			 System.out.println("3. Add Toys");
			 System.out.println("4. Display Items");
			 System.out.println("5. Get Bills");
			 System.out.print("Enter choice :");
			 choice =  sc.nextInt();
			 if(index > 5) {
				 System.out.println("BAG Full");
			 }else {
			 switch (choice) {
			case 1:
				arr[index] = new Books();
				arr[index].acceptDetails(sc);
				arr[index].displayDetails();
				index++;
				break;
			
			case 2:
				
				arr[index] = new Albums();
				arr[index].acceptDetails(sc);
				arr[index].displayDetails();
				index++;
				break;
			
			case 3:
				arr[index] = new Toys();
				arr[index].acceptDetails(sc);
				arr[index].displayDetails();
				index++;
				break;
			case 4:
				Shops.displayItem(arr);
				break;
				
			case 5:
				double total = Shops.bill(arr);
				System.out.println("Total biil :"+total);
				break;
			default:
				break;
			}
		 }
	  }
		 
		 System.out.println("Revenue of the shop : "+Shops.Revenue(arr));

	}

}
