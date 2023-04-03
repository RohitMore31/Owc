package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.Users;
import com.demo.service.UsersServices;

@CrossOrigin(origins = "*")
@RestController
//@Controller
@RequestMapping("/User")
public class UsersController {
	
	@Autowired
	UsersServices userv; 
	
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody Users r) {
		if(userv.insertuser(r)) {
			return ResponseEntity.ok().body("User Added Sucesfully");
		}else {
			return ResponseEntity.status(403).body("User Not Added");
		}
	}
	
	@GetMapping("/showall")
	public ResponseEntity<List<Users>> showAllUsers(){
		List<Users> list= userv.allUsers();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/Login")
	public ResponseEntity<Users> finduser(@RequestBody Users u){
		
		System.out.println("email = "+u.getPassword());
		System.out.println("password ="+u.getEmail());
		Users x = userv.findbyemailandpass(u.getEmail(),u.getPassword());
		System.out.println(x);
		return ResponseEntity.ok(x);
	}
	
	
	
}
