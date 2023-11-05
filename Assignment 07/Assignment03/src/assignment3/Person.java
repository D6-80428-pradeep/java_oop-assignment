package assignment3;

public class Person implements Cloneable{
	String name;
	int age;
	Date dob;
	
	public Person() {
		super();
	}

	public Person(String name, int age,int day,int month,int year) {
		super(day,month,year);
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person temp = (Person) super.clone();
		temp.dob = (Date)this.dob.clone();
		return temp;
	}
	
	@Override
	public void display() {
	System.out.println(name);
	System.out.println(age);
	super.display();
		
	}
	
}
