package com.demo.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.beans.Users;

public interface Userdao extends JpaRepository<Users, Integer>{

	Users findByEmailAndPassword(String email, String password);

	Users findByEmail(String email);
	

}
