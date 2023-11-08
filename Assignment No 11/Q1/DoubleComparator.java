package Q1;

import java.util.Comparator;

 public class DoubleComparator implements  Comparator <Double>{
	@Override
	public int compare(Double x, Double y) {
		
		return Double.compare(x, y);
	}
	
}
