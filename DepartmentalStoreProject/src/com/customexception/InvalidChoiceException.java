package com.customexception;

import java.lang.constant.Constable;

public class InvalidChoiceException extends RuntimeException{

	private String message;
	public InvalidChoiceException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
