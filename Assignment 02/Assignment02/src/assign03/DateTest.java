
//Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
//year (type int). Provide a constructor that initializes the three instance variables and assumes that
//the values provided are correct. Provide a set and a get method for each instance
//variable. Provide a method displayDate that displays the month, day and year separated by forward
//slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.

package assign03;

public class DateTest{
	
	public static void main(String[] args) {
		Date d1 = new Date();
		d1.displayDate();
		d1.acceptDate();
		System.out.println(d1.getMonth());
	}
}
