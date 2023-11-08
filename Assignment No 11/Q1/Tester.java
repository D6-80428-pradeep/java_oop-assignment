package Q1;

import java.util.Comparator;

public class Tester{
	
	public static void main(String[]args) { 
		
		Double [] arr = {1.0, 1.4, 1.3, 1.2};
		
		Selectionsort.selectionSort(arr, new DoubleComparator());
		
		for(Double ele : arr) {
			System.out.println(ele);
		}
	}
}




