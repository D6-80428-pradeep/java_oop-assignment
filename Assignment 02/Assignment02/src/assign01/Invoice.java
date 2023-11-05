
//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.


package assign01;

//import java.security.PublicKey;
import java.util.Scanner;

public class Invoice {
		String partNo ;
		String partDescription ;
		int partQuantity ;
		double partPrice ;
		
		public Invoice() {
				this("0000","--",0,0.0);
		}

		public Invoice(String partNo, String partDescription, int partQuantity, double partPrice) {
			this.partNo = partNo;
			this.partDescription = partDescription;
			this.partQuantity = partQuantity;
			this.partPrice = partPrice;
		}
		
		public void acceptInvoice() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter part no. ");
			this.partNo = sc.next();
			
			System.out.print("Enter part Descriotion ");
			this.partDescription = sc.next();
			
			System.out.print("Enter part Quantity ");
			this.partQuantity = sc.nextInt();
			if(this.partQuantity < 0) {
				this.partQuantity = 0;
			}
			
			System.out.print("Enter part Price ");
			this.partPrice = sc.nextDouble();
			if(this.partPrice < 0) {
				this.partPrice = 0.0;
			}
		}
		
		public void displayInvoice(){
			System.out.println("Part number : " + this.partNo);
			System.out.println("Part discription : "+ this.partDescription);
			System.out.println("Quantity of parts  : " + this.partQuantity);
			System.out.println("Price of part  : " + this.partPrice);
			
			System.out.println("Total Amount = "+(this.partPrice*this.partQuantity));
		}

		public String getPartNo() {
			return partNo;
		}

		public void setPartNo(String partNo) {
			this.partNo = partNo;
		}

		public String getPartDescription() {
			return partDescription;
		}

		public void setPartDescription(String partDescription) {
			this.partDescription = partDescription;
		}

		public int getPartQuantity() {
			return partQuantity;
		}

		public void setPartQuantity(int partQuantity) {
			this.partQuantity = partQuantity;
		}

		public double getPartPrice() {
			return partPrice;
		}

		public void setPartPrice(double partPrice) {
			this.partPrice = partPrice;
		}
		
		
}
