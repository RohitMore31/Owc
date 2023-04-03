package com.demo.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.demo.beans.Users;
import com.demo.dao.Userdao;

@Service
public class UserServicesImpl implements UsersServices{
	
	@Autowired
	Userdao udao;
	
	
	@Override
	public boolean insertuser(Users r) {
		try{
			udao.save(r);
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public List<Users> allUsers() {
		return udao.findAll();
	}

	@Override
	public Users findbyemailandpass(String email, String password) {
		Users u =udao.findByEmailAndPassword(email,password);
		return u;
	}

	
	
	
	@Override
	public boolean findmail(String email) {
		try {
			Users u= udao.findByEmail(email);			
//			System.out.println(u);
			if(u!=null) {
				String sub = "Regarding password change";
				sendEmail(u);
				return true;
			}else {
				return false;
			}
		}catch (Exception e) {
			return false;			
		}
	}
	
	@Autowired
	JavaMailSender mailsender;
	
	@Autowired
	private EmailService emailService;
	
	public void sendEmail(Users u) {
//      This is for simple text Mail  		
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom("rsmore2232@gmail.com");
//		message.setTo(toEmail);
//	
//		message.setText("<h1>Regarding Forgot Password </h1>");
//		message.setSubject("OwcTeam");	
//		mailsender.send(message);
//		
		
		Map<String, String> data = new HashMap<>();
		data.put("name",u.getName() );
		data.put("instruction","Click on link to reset Your Password please do not share this link to any othes ");
		data.put("link","http://localhost:8080/Reset/changepasspage/?id="+u.getEmail());
		//		List<Map<String, Object>> items = new ArrayList<>();
//		items.add(Map.of("name", "Item 1", "price", 10.00));
//		items.add(Map.of("name", "Item 2", "price", 20.00));
//		data.put("items", items);
		
//		For Any attachmet
//		File attachment = new File("/path/to/file.pdf");
		
		emailService.sendEmailWithAttachment(u.getEmail(), "change your password", "emailTemplate.ftl", data);
		
	}

	
	
	@Override
	public boolean addnewpassword(String email, String password) {
		try {
			Users u= udao.findByEmail(email);			
//			System.out.println(u);
			if(u!=null) {
				u.setPassword(password);
				udao.save(u);
				return true;
			}else {
				return false;
			}
		}catch (Exception e) {
			return false;			
		}
		
	}
	

	


	 


}
