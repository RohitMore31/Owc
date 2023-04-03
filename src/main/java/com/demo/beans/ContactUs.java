package com.demo.beans;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="ContactUs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContactUs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String name;
	public String email;
	public String subject;
	public String descr;
	public boolean action ;
	
}
