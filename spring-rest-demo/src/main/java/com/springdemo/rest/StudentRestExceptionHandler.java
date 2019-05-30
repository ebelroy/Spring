package com.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
	@ExceptionHandler//uSE rest api client to get better result
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
		
		StudentErrorResponse err=new StudentErrorResponse();
		err.setStatus(HttpStatus.NOT_FOUND.toString());
		err.setMessage(exc.getMessage());
		err.setTimestamp("dsgd1111sd");
				System.out.println("the out");
		
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler//this is for generic case
	public ResponseEntity<StudentErrorResponse> handleGenericException(Exception exc){
		
		StudentErrorResponse err=new StudentErrorResponse();
		err.setStatus(HttpStatus.BAD_REQUEST.toString());
		err.setMessage(exc.getMessage());
		err.setTimestamp("dsg11111dsd");
		
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
		
	}

}
