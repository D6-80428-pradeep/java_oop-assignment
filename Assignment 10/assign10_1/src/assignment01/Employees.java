package assignment01;

public class Employees extends Employee {
	
	public static double averageSalLabour(Employee[] arr) {
		double total = 0;
		int count =0;
		for(Employee element : arr) {
			if(element instanceof Labour) {
				count++;
				Labour l1 = (Labour)element;
				total = (total + l1.getRate());
			}
			
			
		}
		double ave = total/count;
		return ave;
		
	}
	 public static double averageSalSalesmans(Employee[] arr) {
		 double total = 0;
			int count =0;
			for(Employee element : arr) {
				if(element instanceof Salesman) {
					count++;
					Salesman s1 = (Salesman)element;
					total = (total + s1.getSalary());
				}
				
				
			}
			double ave = total/count;
			return ave;
	 }
 public static double averageSalClerks(Employee[] arr) {
	 double total = 0;
		int count =0;
		for(Employee element : arr) {
			if(element instanceof Clerk) {
				count++;
				Clerk l1 = (Clerk)element;
				total = (total + l1.getSalary());
			}
			
			
		}
		double ave = total/count;
		return ave;
 }
}
