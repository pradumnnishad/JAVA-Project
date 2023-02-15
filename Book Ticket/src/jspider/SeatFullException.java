package jspider;

public class SeatFullException extends RuntimeException{
	private String message;

	public SeatFullException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "SeatFullException [message=" + message + "]";
	}
	
}
