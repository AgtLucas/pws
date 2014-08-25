package uk.com.megabrew.service;

public class UserNotAuthorizedException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public UserNotAuthorizedException() {
		super();
	}
	
	public UserNotAuthorizedException(String message, Throwable cause, boolean enableSuppresion, boolean writableStackTrace) {
		super(message, cause, enableSuppresion, writableStackTrace);
	}
	
	public UserNotAuthorizedException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public UserNotAuthorizedException(String message) {
		super(message);
	}
	
	public UserNotAuthorizedException(Throwable cause) {
		super(cause);
	}

}
