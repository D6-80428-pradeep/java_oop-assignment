package assignment1;

public class Shops extends Shop {
	
	public static double bill(Shop [] arr ) {
		double totalBills = 0;
		for(Shop element : arr) {
			if(element instanceof Books) {
				totalBills += element.getPrice();
			}
			if(element instanceof Albums) {
				double pricedis = element.getPrice()*element.getGST();
				pricedis = element.getPrice() - pricedis;
				
				double price = pricedis * element.getGST();
				
				price = pricedis + price ;
				
				totalBills += price;
			}
			if(element instanceof Toys) {
				double price1 = element.getPrice()*element.getVAT();
				price1 = element.getPrice() - price1;
				double price = price1 * element.getVAT();
				price = price1 + price ;
				
				totalBills += price;
			}
			
		}
		return totalBills;
		
	}
	
	public static double Revenue(Shop []arr) {
		double rev = 0;
		
		for(Shop element : arr) {
			if(element instanceof Books) {
				rev += element.getPrice();
			}
			if(element instanceof Albums) {
				double pricedis = element.getPrice()*element.getGST();
				pricedis = element.getPrice() - pricedis;
				
				
				
				rev += pricedis;
			}
			if(element instanceof Toys) {
				double price1 = element.getPrice()*element.getVAT();
				price1 = element.getPrice() - price1;
				
				
				rev += price1;
			}
			
		}
		return rev;
		
	}
	
	public static void displayItem(Shop [] arr) {
		
		for(Shop element : arr) {
			if(element != null)
			element.displayDetails();
		}
	}
}
