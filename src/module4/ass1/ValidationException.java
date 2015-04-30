package module4.ass1;

public class ValidationException extends RuntimeException {
	
	private static final long serialVersionUID = 7337239517839267778L;

	public ValidationException() {
		super();
		
	}

	public ValidationException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public ValidationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public ValidationException(String arg0) {
		super(arg0);
		
	}

	public ValidationException(Throwable arg0) {
		super(arg0);
		
	}

}
