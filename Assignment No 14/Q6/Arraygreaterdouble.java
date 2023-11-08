package Q6;

public class Arraygreaterdouble {
	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for(T ele : arr) {
			if(c.compare(ele,key))
				count++;
		}
		return count;
	}
	
	public static void main(String[]args) {
		Double [] arr = {4.45, 7.72, 9.93, 2.24, 5.50, 7.72, 3.82, 8.43, 7.72};
		Double key = 7.72;
		int cnt = countIf(arr, key, (x,y)-> x.equals(y));
		System.out.println("Count = " + cnt);
	}
}
