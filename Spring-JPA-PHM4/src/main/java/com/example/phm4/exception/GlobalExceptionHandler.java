package com.example.phm4.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BudgetNotFoundException.class)
	public ResponseEntity<?> handleBudgetNotFound(BudgetNotFoundException ex) {
	    Map<String, Object> errorDetails = new HashMap();
	    errorDetails.put("error", "Budget Not Found");
	    errorDetails.put("message", ex.getMessage());
	    errorDetails.put("status", HttpStatus.NOT_FOUND.value());
	    return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> handleUserNotFound(UserNotFoundException ex) {
	    Map<String, Object> errorDetails = new HashMap();
	    errorDetails.put("error", "User Not Found");
	    errorDetails.put("message", ex.getMessage());
	    errorDetails.put("status", HttpStatus.NOT_FOUND.value());
	    return new ResponseEntity(errorDetails, HttpStatus.NOT_FOUND);
	}
}
