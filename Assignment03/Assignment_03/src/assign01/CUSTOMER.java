package assign01;

public class CUSTOMER {

	public static void main(String[] args) {
		
		CREDITCALCULATOR c1 = new CREDITCALCULATOR(11,5000,25000,10000,50000);
		
		c1.calNewBal();
		c1.displayAccount();
	}

}
