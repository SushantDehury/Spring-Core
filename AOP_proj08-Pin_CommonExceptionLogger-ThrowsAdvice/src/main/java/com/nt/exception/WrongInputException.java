package com.nt.exception;

public class WrongInputException extends IllegalArgumentException {
	public WrongInputException() {
		super();
	}
	public WrongInputException(String msg){
		super(msg);
	}

}
