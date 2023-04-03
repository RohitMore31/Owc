package com.demo.service;

import java.util.List;

import com.demo.beans.Properties;
import com.demo.beans.Users;


public interface UsersServices {

	boolean insertuser(Users r);
	
	List<Users> allUsers();

	Users findbyemailandpass(String email, String password);

	boolean findmail(String email);

	boolean addnewpassword(String email, String password);

	
}
