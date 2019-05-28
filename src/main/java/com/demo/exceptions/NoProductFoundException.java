package com.demo.exceptions;

public class NoProductFoundException extends RuntimeException{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7207589114824687478L;

	public NoProductFoundException(String msg) {

		super(msg);
		
	}

}
