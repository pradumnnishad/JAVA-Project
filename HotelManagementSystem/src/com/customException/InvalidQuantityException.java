package com.customException;

public class InvalidQuantityException extends RuntimeException {

	private String message;
	public InvalidQuantityException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
