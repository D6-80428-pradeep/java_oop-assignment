package assignment01;

public class ExceptionHandling extends RuntimeException {
	
	private String field;
	private int value;
	
	public ExceptionHandling() {
		super("Invalid Input");
	}

	public ExceptionHandling(String field, int value) {
		super("Invalid "+field+":"+value);
		this.field = field;
		this.value = value;
	}

	public String getField() {
		return field;
	}

	public int getValue() {
		return value;
	}
	
	
	
	
	
	
}
