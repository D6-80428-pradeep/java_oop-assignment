package assignment06;

import java.util.Scanner;
import assignment06.Person;

enum Genders{
	MALE,FEMALE
}

enum menu{
	EXIT ,New_person , diplay_persons , find_by_name
}




public class Tester {

	
	public static void main(String[] args) {
		
//		Genders g1 = Genders.MALE;
		Scanner sc = new Scanner(System.in);
		Genders[] arr = Genders.values();
		Person[]arr1 = new Person[5];
		int count = -1;
		menu [] arr2 = menu.values();
		int choice = 1;
		while (choice != 5) {
			for(menu d1:arr2) {
				System.out.println(d1.ordinal()+" :"+ d1.name());
			}
			choice = sc.nextInt();
				menu ch = arr2[choice];
			switch (ch) {
			case New_person:
				if(count < 5) {
					count++;
					arr1[count] = new Person();
					arr1[count].accept(sc);
					
					for(Genders gen : arr) {
						System.out.println(gen.ordinal()+" "+gen.name());
					}
					System.out.println("Enter Choice :");
					int g = sc.nextInt();

					Genders c = arr[choice];

					switch (c) {
					case MALE:
						 arr1[count].setGender("MALE");
						break;
						
					case FEMALE:
						arr1[count].setGender("FEMALE");
						break;

					}
					
					
				}else
					System.out.println("list full");
				
				break;

			case diplay_persons :
				if(count > -1) {
					for(Person ele : arr1) {
					 if(ele != null)
						 ele.display();
					}
				}else
					System.out.println("list empty");
				break;
				
			case find_by_name :
				if(count > -1) {
					String na = sc.next();
					for(Person ele : arr1) {
						if(ele != null) {
							if(na == ele.getName()) {
								ele.display();
								break;
						
						}
					}
						
				   }System.out.println("person not found");
				}else
					System.out.println("list empty");
				break;
				
				
			case EXIT:
				System.exit(0);
				break;
			}
			
		}
		
		
	
		
	}

}
