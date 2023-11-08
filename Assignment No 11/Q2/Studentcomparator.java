package Q2;

import java.util.Comparator;

public class Studentcomparator implements Comparator <Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		int diff = - student1.getCity().compareTo(student2.getCity());
		if(diff ==0) {
			diff = - Double.compare(student1.getMarks(), student2.getMarks());
		}if(diff ==0) {
			diff = student1.getName().compareTo(student2.getName());
		}
		
		return diff;
	}
	
}
