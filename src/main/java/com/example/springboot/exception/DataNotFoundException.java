package com.example.springboot.exception;

public class DataNotFoundException extends RuntimeException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DataNotFoundException() {}
	
	public DataNotFoundException(String msg) {
		
		super(msg);
	}
	
}
