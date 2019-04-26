package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.WrongIdException;
import com.model.TDSDetails;
import com.service.TDSService;
 
@RestController
public class TDSController {

	
	@Autowired
	TDSService tdsService;       //creating object for service and autowiring
	                             
	@GetMapping("/getById/{id}")   //getting the id from postman
	
	public TDSDetails get(@PathVariable int id) {
		TDSDetails tdsDetails = new TDSDetails();
		
		tdsDetails =tdsService.getById(id);
		
	  if(tdsDetails==null) {
			throw new WrongIdException("ID not found Wrong ID:  "+id);
		}
		else
			return  tdsDetails;          
		
	}
	
  
}
