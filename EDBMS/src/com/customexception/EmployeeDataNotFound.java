package com.customexception;

public class EmployeeDataNotFound extends RuntimeException{
	private String message;
	public EmployeeDataNotFound(String message) {
		this.message=message;

	}
	@Override
	public String getMessage() {
		return message;
	}
}
