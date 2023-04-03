package com.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="properties")
public class Properties {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String country;
	private String state;
	private String city;
	
	@Column(unique = true)
	private String propertyname;
	private String status;
	private String propertydesc;
	
	private String propertytype;
	private String subtype;
	private double prize;
	private String url;
	public int getId() {
		return id;
	}
	
	
	public Properties() {
		super();
	}

	public Properties(int id, String country, String state, String city, String propertyname, String status,
			String propertydesc, String propertytype, String subtype, double prize, String url) {
		super();
		this.id = id;
		this.country = country;
		this.state = state;
		this.city = city;
		this.propertyname = propertyname;
		this.status = status;
		this.propertydesc = propertydesc;
		this.propertytype = propertytype;
		this.subtype = subtype;
		this.prize = prize;
		this.url = url;
	}



	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPropertyname() {
		return propertyname;
	}
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPropertydesc() {
		return propertydesc;
	}
	public void setPropertydesc(String propertydesc) {
		this.propertydesc = propertydesc;
	}
	public String getPropertytype() {
		return propertytype;
	}
	public void setPropertytype(String propertytype) {
		this.propertytype = propertytype;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "Properties [id=" + id + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", propertyname=" + propertyname + ", status=" + status + ", propertydesc=" + propertydesc
				+ ", propertytype=" + propertytype + ", subtype=" + subtype + ", prize=" + prize + ", url=" + url + "]";
	}
	

}
