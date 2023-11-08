package Q2;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Stringlengh {
	
	public static void main(String[]args) {
		List <String> list  = new LinkedList<String>();
		Collections.addAll(list, "Mumbai","Pune", "Ratnagiri", "Satara", "Sangli", "Devgad");
		System.out.print("The given list is :- ");
		System.out.println(list.toString());
		
		String maxstring = Collections.max(list, new Citylengthcompare());
		System.out.println("The string with max lengh is :- " + maxstring);
		
		}
	}

