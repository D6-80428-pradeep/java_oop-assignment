package assign10_03;

public class Tester {

	
	public static void printDisplayableBox( box< ? extends Displayable > b) {
		 b.get().display();
		}
	
	public static void printAnyBox(box< ? extends Displayable > b) {
		System.out.println(b.get().toString());
		}
	public static void main(String[] args) {
		
			box<Person> p1 = new box<Person>();
			p1.setObject(new Person("hoola",29) );
			printDisplayableBox(p1);
			printAnyBox(p1);
			
	}

}
