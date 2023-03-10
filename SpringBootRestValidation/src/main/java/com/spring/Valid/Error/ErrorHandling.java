package com.spring.Valid.Error;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ErrorHandling {

  @ExceptionHandler(Exception.class)
 	public ResponseEntity<?> globalerrorHandling(Exception except,WebRequest req){
 		errorDetails error=new errorDetails(new Date(),except.getMessage(),req.getDescription(false));
 		return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
 	}
  @ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> globalerrorHandling(MethodArgumentNotValidException except,WebRequest req){
		errorDetails error=new errorDetails(new Date(),except.getMessage(),req.getDescription(false));
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
  
}
