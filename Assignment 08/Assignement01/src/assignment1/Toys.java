
//1. A shop sells diﬀerent types of products like books, music albums, and toys. Book information includes ISBN, title, price, author, and subject. Album
//information includes title, price, singer, and musician. Toy information includes title, price, age group (string), type. Though books are tax free, music
//albums have GST tax of 10% and toys have VAT tax of 5%. Sometimes shop keeper announce a sell, where he apply same percentage discount to every
//purchased products. Assuming that each customer can purchase maximum 5 products at a time, write a menu driven program so that each user can
//purchase products of his choice. At the end display total bill (including tax) to be paid by customer and total revenue of shop (excluding tax). Design
//appropriate classes and their relations.
package assignment1;

import java.util.Scanner;

public class Toys extends Shop {
		String ageGroup;
		String type;
		
		public Toys() {
			// TODO Auto-generated constructor stub
		}
		
		
		
		public Toys(String ageGroup, String type) {
			super();
			this.ageGroup = ageGroup;
			this.type = type;
		}

			


		public String getAgeGroup() {
			return ageGroup;
		}



		public void setAgeGroup(String ageGroup) {
			this.ageGroup = ageGroup;
		}



		public String getType() {
			return type;
		}



		public void setType(String type) {
			this.type = type;
		}



		@Override
		public void acceptDetails(Scanner sc) {
		// TODO Auto-generated method stub
		super.acceptDetails(sc);
		System.out.print("Enter Age Group :");
		ageGroup = sc.next();
		System.out.print("Enter type toy :");
		type = sc.next();
		}
		
		@Override
		public void displayDetails() {
		super.displayDetails();
		System.out.println("Age Group :"+ ageGroup);
		System.out.println("Toy Type :"+ type);
		}
		
}
