package arrayofno;

public class genericmethod {

	public static <T extends Number> void minimumno(T [] arr) {
		
	   double mini = arr[0].doubleValue();
		for(T ele : arr) {
			if(ele != null) {
				if(ele.doubleValue() < mini) {
					mini = ele.doubleValue();
				}
			}
		}
		System.out.println("MINIMUM NO :"+mini);
	}
}
