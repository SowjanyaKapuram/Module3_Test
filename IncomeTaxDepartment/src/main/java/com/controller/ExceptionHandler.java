package com.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.exception.WrongIdException;
import com.model.ErrorDetails;

 
public class ExceptionHandler {

	@ControllerAdvice
	@RestController
	public class ExceptionHandlerClass extends ResponseEntityExceptionHandler {
		@org.springframework.web.bind.annotation.ExceptionHandler(value = WrongIdException.class)
		 public final ResponseEntity<ErrorDetails> handleNotFoundException(WrongIdException ex, WebRequest request) {
			com.model.ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
			        request.getDescription(false));
			    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
		   }
		
	}

	
	
}
