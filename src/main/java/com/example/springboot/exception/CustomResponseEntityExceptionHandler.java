package com.example.springboot.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler({DataNotFoundException.class, RuntimeException.class})
	public ResponseEntity<Error> handleAllExceptions(final HttpServletRequest request, final Exception e)
	{
		Error error = null;
		if(e instanceof DataNotFoundException)
		{
			error = new Error("404", e.getMessage(), "404");
		}
		else
		{
			error = new Error("500", "Internal server error, please try again after sometime", "500");
		}
		
		return new ResponseEntity<Error>(error, HttpStatus.NOT_FOUND);
	}
}
