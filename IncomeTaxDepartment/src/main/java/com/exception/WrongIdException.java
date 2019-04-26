package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WrongIdException extends RuntimeException{

	public WrongIdException(String msg) {
		 super(msg);
	}
	
}
