package assign10_03;

public class Person implements Displayable {
		
	private String name;
	private int age;

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// ...
	@Override
	public void display() {
		System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, age=%s]", name, age);
	}
	
	
	
}
