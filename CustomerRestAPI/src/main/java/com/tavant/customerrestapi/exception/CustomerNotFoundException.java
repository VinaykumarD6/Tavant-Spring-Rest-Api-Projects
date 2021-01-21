package com.tavant.customerrestapi.exception;

public class CustomerNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException(String message) {
		super(message);
		
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}

}
