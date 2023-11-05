package assign10_03;

public class box < T extends Displayable > {
	private T object;
	
	public void setObject(T obj) {
		this.object = obj;
	}
	
	public T get() {
		
		return this.object;
	}
}
