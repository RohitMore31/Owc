package com.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.ContactUs;
import com.demo.beans.Payment;
import com.demo.dao.Paymentdao;

@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	Paymentdao pdao;
	
	@Autowired
	EmailService emailService;
	
	@Override
	public boolean addDetails(Payment pt) {
		try {		
			Payment u= pdao.save(pt);		
			if(u!=null) {
				sendEmail(pt);
				pt.setStatus(true);
				pdao.save(u);
				return true;
			}else {
				return false;
			}
		}catch (Exception e) {
			return false;			
		}
		
	}
	
	public void sendEmail(Payment u) {
		Map<String, String> data = new HashMap<>();
		data.put("name",u.getEmail() );
		data.put("instruction","Thank you for using Owc as a platform connecting us we will reach you soon");
		data.put("proertyname", u.getPropertyname());
		data.put("propertytype",u.getPropertytype());
		data.put("prize",""+u.getPrize());
		data.put("url",u.getUrl());
		data.put("status","success");
		

		emailService.sendEmailWithAttachment(u.getEmail(), "Owc connect ", "paymentemailTemplate.ftl", data);
		
	}
	
}
