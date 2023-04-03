package com.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.ContactUs;

import com.demo.dao.ContactUsdao;

@Service 
public class ContactUsServicesImpl implements ContactUsServices {

	@Autowired
	ContactUsdao ctdao;
	
	@Autowired
	private EmailService emailService;
	
	@Override
	public boolean addDetails(ContactUs ct) {	
		try {
			System.out.println(ct);
			ct.action=true;
			ContactUs u= ctdao.save(ct);		
			if(u!=null) {
				sendEmail(u);
				u.action=true;
				ctdao.save(u);
				return true;
			}else {
				return false;
			}
		}catch (Exception e) {
			return false;			
		}
	}
	
	
	public void sendEmail(ContactUs u) {
		Map<String, String> data = new HashMap<>();
		data.put("name",u.name );
		data.put("instruction","Thank you for connecting us we will reach you soon");

		emailService.sendEmailWithAttachment(u.email, "Owc connect ", "contactemailTemplate.ftl", data);
		
	}
}
