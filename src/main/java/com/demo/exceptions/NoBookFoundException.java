package com.demo.exceptions;

public class NoBookFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -173165486875501402L;
	
	
	public NoBookFoundException(String msg) {
		super(msg);
	}

}
