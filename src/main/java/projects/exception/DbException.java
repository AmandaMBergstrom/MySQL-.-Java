package projects.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException {

	public DbException(String message) {
		super(message);
		//matching constructors
	}

	public DbException(Throwable cause) {
		super(cause);
		//constructor stub
	}

	public DbException(String message, Throwable cause) {
		super(message, cause);
		//constructor stub
	}
}
