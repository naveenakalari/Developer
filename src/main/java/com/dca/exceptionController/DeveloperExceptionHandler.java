package com.dca.exceptionController;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dca.exception.DeveloperNotFoundException;
import com.dca.exception.FeedNotFoundException;

@RestControllerAdvice
public class DeveloperExceptionHandler extends ResponseEntityExceptionHandler {


	@SuppressWarnings({"rawtypes","unchecked"})
	@ExceptionHandler(value=DeveloperNotFoundException.class)
	public ResponseEntity<Object> DeveloperCodeExceptionHandler(Exception ex){
	
		return new ResponseEntity("Developer Not Found",HttpStatus.NOT_FOUND);
	}
	
	@SuppressWarnings({"rawtypes","unchecked"})
	@ExceptionHandler(value=FeedNotFoundException.class)
	public ResponseEntity<Object> FeedCodeExceptionHandler(Exception ex){
	
	return new ResponseEntity("Feed Not Found",HttpStatus.NOT_FOUND);
	}

	@SuppressWarnings({"rawtypes","unchecked"})
	@ExceptionHandler(value = ConfigDataResourceNotFoundException.class)
	public ResponseEntity<Object> ResponseCodeExceptionHandler(Exception ex) {
		return new ResponseEntity("Response Not Found", HttpStatus.NOT_FOUND);
	}
	
	
}
