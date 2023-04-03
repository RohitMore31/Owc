package com.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int id;
	
	@Column(unique= true)
	private String email;
	
	private String name;
	private String password;
	private String phoneno;
	private String role;
	
	
	public Users() {
		super();
	}

	public Users(int id, String email, String name, String password, String phoneno, String role) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneno = phoneno;
		this.role = role;
	}
	
//	public Users(String email, String password) {
//		super();
//		this.email = email;
//		this.password = password;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + ", phoneno="
				+ phoneno + ", role=" + role + "]";
	}
	
	

	
}
