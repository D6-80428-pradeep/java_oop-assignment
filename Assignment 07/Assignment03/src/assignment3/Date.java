package assignment3;

public class Date implements Cloneable {
	int Day;
	int Month;
	int Year;
	
	public Date() {
		// TODO Auto-generated constructor stub
	}

	public Date(int day, int month, int year) {
		super();
		Day = day;
		Month = month;
		Year = year;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Date temp = (Date) super.clone();
		return temp;
	}
	
	public void display() {
		System.out.println("date :"+Day+"/"+Month+"/"+Year);
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		Month = month;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}
	
	
	
}
