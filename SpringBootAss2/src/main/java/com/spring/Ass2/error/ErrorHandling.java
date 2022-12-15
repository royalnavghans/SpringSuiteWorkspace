package com.spring.Ass2.error;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;


@RestControllerAdvice
public class ErrorHandling {

	  @ExceptionHandler(ResourceNotFound.class)
		public ResponseEntity<?> specificerrorHandling(ResourceNotFound except,WebRequest req){
			ErrorDetails error=new ErrorDetails(new Date(),except.getMessage(),req.getDescription(false));
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		}
		
	  @ExceptionHandler(Exception.class)
	 	public ResponseEntity<?> globalerrorHandling(Exception except,WebRequest req){
	 		ErrorDetails error=new ErrorDetails(new Date(),except.getMessage(),req.getDescription(false));
	 		return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	 	}
	  @ExceptionHandler(MethodArgumentNotValidException.class)
		public ResponseEntity<?> globalerrorHandling(MethodArgumentNotValidException except){
			ErrorDetails error=new ErrorDetails(
					new Date(),
					except.getBindingResult().getFieldError().getDefaultMessage(),
					"Validation Error");
			return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
		}
	  
}
