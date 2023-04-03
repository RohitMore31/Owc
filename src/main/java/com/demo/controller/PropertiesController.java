package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.beans.Properties;
import com.demo.service.PropertiesServices;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Property")
public class PropertiesController {
	@Autowired
	PropertiesServices pserv;
	
	@PostMapping("/add")
	public ResponseEntity<String> addProperties(@RequestBody Properties p){
		System.out.println(p);
		boolean st=pserv.addnewproperty(p); 
		if(st) {
			return ResponseEntity.ok("Added Sucessfully");
		}else {
			return ResponseEntity.status(403).body("Error Not added ");
		}
	}
	
//	// common for all
//	@GetMapping("/showall")
//	public ResponseEntity<List<Properties>> showAllbyCatagories(@PathVariable String catogory) {
//		List<Properties> plist = pserv.showallproperties(catogory);
//		return ResponseEntity.ok(plist);
//	}
	
	@GetMapping("/desk")
	public ResponseEntity<List<Properties>> showAllbyCatagories() {
		List<Properties> plist = pserv.showallproperties("Dedicated Desk");
		return ResponseEntity.ok(plist);
	}
	
	@GetMapping("/education")
	public ResponseEntity<List<Properties>> showAllEducationCatagories() {
		List<Properties> plist = pserv.showallproperties("educational");
		return ResponseEntity.ok(plist);
	}
	@GetMapping("/Officespaces")
	public ResponseEntity<List<Properties>> showAllOfficespacesCatagories() {
		List<Properties> plist = pserv.showallproperties("Officespace");
		for(Properties p: plist) {
			System.out.println(p);
		}
		return ResponseEntity.ok(plist);
	}
	
	@GetMapping("/restaurant")
	public ResponseEntity<List<Properties>> showAllRestaurantCatagories() {
		List<Properties> plist = pserv.showallproperties("restaurant");
		return ResponseEntity.ok(plist);
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteproperties(@RequestParam int id){
		boolean st = pserv.deletebyid(id);
		if(st) {
			return ResponseEntity.ok("Deleted Sucessfully");
		}else {
			return ResponseEntity.status(403).body("Error");
		}
	}
	
	
	
}
