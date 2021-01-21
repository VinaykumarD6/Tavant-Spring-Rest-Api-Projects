package com.tavant.customerrestapi.controlleradvice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.tavant.customerrestapi.errorresponse.ErrorResponse;
import com.tavant.customerrestapi.exception.CustomerNotFoundException;
import com.tavant.customerrestapi.exception.NoDataFoundException;

@ControllerAdvice
public class CustomerRestControllerAdvice {
	@ExceptionHandler(CustomerNotFoundException.class)
	
	public final ResponseEntity<ErrorResponse>
	handleEmployeeNotFoundException(CustomerNotFoundException e,
			WebRequest request){
		List<String> details = new ArrayList<String>();
		details.add(e.getLocalizedMessage());
		ErrorResponse errorResponse = new ErrorResponse("INCORRECT_REQUEST",details);
		return new ResponseEntity(errorResponse,HttpStatus.NOT_FOUND);
	}
	
/*	public final ResponseEntity<ErrorResponse>
	handleNoDataFoundException(NoDataFoundException e,WebRequest request){
		List<String> details = new ArrayList<String>();
		details.add(e.getLocalizedMessage());
		ErrorResponse errorResponse = new ErrorResponse("INCORRECT_REQUEST",details);
		return new ResponseEntity(errorResponse,HttpStatus.NOT_FOUND);		
	}*/

}
