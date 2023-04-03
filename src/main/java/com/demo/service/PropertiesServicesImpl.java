package com.demo.service;

import java.util.List;

import org.hibernate.jdbc.Expectations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Properties;
import com.demo.dao.Propertiesdao;

@Service
public class PropertiesServicesImpl implements PropertiesServices{
	@Autowired
	Propertiesdao pdao;
	
	@Override
	public boolean addnewproperty(Properties p) {
		try{
			pdao.save(p) ;
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public List<Properties> showallproperties(String catogory) {
		System.out.println(catogory);
		List<Properties>plist=  pdao.findByPropertytypeEquals(catogory); 
		return plist;
	}

	@Override
	public boolean deletebyid(int id) {
		try {
			pdao .deleteById(id);	
			return true;
		}catch(Exception e) {
			return false;			
		}
	}
	
}
