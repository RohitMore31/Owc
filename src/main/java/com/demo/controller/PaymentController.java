package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.beans.Payment;
import com.demo.service.PaymentService;

@CrossOrigin(origins ="*")
@Controller
@RequestMapping("/Payment")
public class PaymentController {
	@Autowired
	PaymentService pser;
	
	@PostMapping("/payment")
	public ResponseEntity<String> addPaymentDetails(Payment pt){
		System.out.println("inside addPaymentDetails "+pt);
		boolean status = pser.addDetails(pt);
		if(status) {
			return ResponseEntity.ok("sucess");			
		}else {
//			"email not found enter correct mail"
			return ResponseEntity.ok("Email not found");
		}
		
	}
}
