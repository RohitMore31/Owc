package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.ContactUs;
import com.demo.service.ContactUsServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("Contactus")
public class ContactUsController {
	@Autowired
	ContactUsServices cts;
	
	@PostMapping("/contactus")
	public ResponseEntity<String> addcontactdetails(@RequestBody ContactUs ct){
		System.out.println("inside addcontactdetails "+ct);
		boolean status = cts.addDetails(ct);
		if(status) {
			return ResponseEntity.ok("sucess");			
		}else {
//			"email not found enter correct mail"
			return ResponseEntity.ok("Email not found");
		}
		
	}
}
