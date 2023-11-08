package Q2;

import java.util.Comparator;

class Citylengthcompare implements Comparator<String>{

	@Override
	public int compare(String String1, String String2) {
		int diff = String1.length() - String2.length();
		return diff;
	}
}
 