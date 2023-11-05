package assignment01;

public class GenericBox <T extends Employee> {
	
	private T obj;
	
	public void Set( T obj) {
		this.obj = obj;	
	}
	
	public T get() {
		return this.obj;
	}
	
	public void Salary() {
		System.out.println("Salary : " + obj.calSal());
	}
}
