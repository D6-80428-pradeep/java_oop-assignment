package assignment3;

public class Tester {
	public static void main(String[] args) throws CloneNotSupportedException {
//		Date d1 = new Date(1,3,1990);
//		d1.display();
//		Date d2 = (Date)d1.clone();
//		d2.display();
//		d2.setMonth(7);
//		d2.display();
		
		Person p1 = new Person("maxx",29,22,4,1999);
		p1.display();
		Person p2 = (Person)p1.clone();
		p2.setMonth(9);
		
		p2.display();
		p1.display();
	}
}
