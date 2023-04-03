package com.demo.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Users;
import com.demo.service.UsersServices;

@CrossOrigin(origins = "*")
//@RestController
@Controller
@RequestMapping("/Reset")
public class ResetController {
	@Autowired
	UsersServices user;
	
	@RequestMapping("/Changepass")
	public ResponseEntity<String> changepassword(@RequestBody Users u) {
		System.out.println("Email ="+u.getEmail());
		boolean status = user.findmail(u.getEmail());
		if(status) {
			return ResponseEntity.ok("sucess");			
		}else {
//			"email not found enter correct mail"
			return ResponseEntity.ok("Email not found");
		}	
	}
	
	@RequestMapping("/changepasspage")
	public ModelAndView forgotpage(@RequestParam String id) {
		System.out.println("inside changepasspage id ="+id);
		ModelAndView model = new ModelAndView("forgotpass");
		model.addObject("id", id);
	    return model;
	}
	
	@PostMapping("/updatepassword")
	public ResponseEntity<String> addnewpassword(Users u) {
		System.out.println("inside a add new password ");
		System.out.println("Email ="+u.getEmail());
		System.out.println(("new Password = "+u.getPassword()));
		boolean status = user.addnewpassword(u.getEmail(),u.getPassword());
		if(status) {
			return ResponseEntity.ok("updated Sucessfully");
			
		}else {
//			"email not found enter correct mail"
			return ResponseEntity.ok("Email not found");
		}	
		
	}
	
	

}
