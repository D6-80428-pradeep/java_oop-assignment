package FruitBAsket;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class tester {

	public static void main(String[] args) {
		
		System.out.println("Enter basket size :");
		Scanner sc = new Scanner(System.in);
		double size = sc.nextDouble();
		
		Fruit [] fruit = new Fruit[(int) size];
		
		int choice = 1 ;
		int count = -1;
		double counter = 0;
		
		while(choice != 0) {
			
			System.out.println("0. EXIT ");
			System.out.println("1. Add Mangos");
			System.out.println("2. Add Oranges");
			System.out.println("3. Add Apples");
			System.out.println("4. Display all fruits in basket");
			System.out.println("5. Display details of all fruits in basket");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				count++;
				if(count < size) {
				fruit[count] = new Mango();
				fruit[count].acceptFruit(sc);
				
				counter = counter + fruit[count].getWeight();
				fruit[count].setTaste("Sweet");
					if(counter <= size)
					{
						if(fruit[count].isFresh(sc)) {
							fruit[count].setIsFresh("Fresh");
						}else {
							fruit[count].setIsFresh("Not Fresh");
						}
					}else
						System.out.println("Basket is full");
					break;
				}else
					System.out.println("Basket is full");
				
		
				break;
				
			case 2:
				count++;
				if(count < size) {
					fruit[count] = new Orange();
					fruit[count].acceptFruit(sc);
					
					counter = counter + fruit[count].getWeight();
					fruit[count].setTaste("Sour");
					if(counter <= size)
					{
						if(fruit[count].isFresh(sc)) {
							fruit[count].setIsFresh("Fresh");
						}else {
							fruit[count].setIsFresh("Not Fresh");
						}
					}else
						System.out.println("Basket is full");
					break;
				}else
					System.out.println("Basket is full");
				break;
	
			
			case 3:
				
				count++;
				if(count < size) {
					fruit[count] = new Apple();
					fruit[count].acceptFruit(sc);
					
					counter = counter + fruit[count].getWeight();
					fruit[count].setTaste("Sweet and sour");
					if(counter <= size)
					{
						if(fruit[count].isFresh(sc)) {
							fruit[count].setIsFresh("Fresh");
						}else {
							fruit[count].setIsFresh("Not Fresh");
						}
						
					}else
						System.out.println("Basket is full");
					break;
				}else
					System.out.println("Basket is full");
				break;
			
			case 4:
				for(Fruit element : fruit)
					if(element != null) {
					 System.out.println("Fruit : "+ element.getName());
					}
				break;
				
			case 5:
				for(Fruit element : fruit)
					if(element != null) {
					 System.out.println("Details : "+ element.toString());
					 System.out.println("Is "+element.getName()+"Fresh :"+element.getIsFresh());
					}
				break;
				
			case 6:
				for(Fruit element : fruit)
					if(element != null) {
						if(element.getIsFresh() == "Not Fresh ") {
							System.out.println(element.getName()+"="+element.getTaste());
						}
					}
				break;
				
			case 7:
				int no = sc.nextInt();
				if(no > 0 && no < count) {
				fruit[no-1].setIsFresh("Not Fresh");
				}else 
					System.out.println("Invalid index");
				break;
				
			case 0:
				System.exit(0);
				break;

			default:
				System.out.println("WRONG INPUT..:(");
				break;
			}
			
			
		}
		
		
	}

}
