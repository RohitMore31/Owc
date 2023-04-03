package com.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	@Id
	private int paymentid;
	private String email;
	private int userid;
	private String propertyname;
	private boolean status;
	private String propertydesc;
	private String propertytype;
	private double prize;
	private String url;
	
	
	
	public Payment() {
		super();
	}
	
	public Payment(int paymentid, String email, int userid, String propertyname, boolean status, String propertydesc,
			String propertytype, double prize, String url) {
		super();
		this.paymentid = paymentid;
		this.email = email;
		this.userid = userid;
		this.propertyname = propertyname;
		this.status = status;
		this.propertydesc = propertydesc;
		this.propertytype = propertytype;
		this.prize = prize;
		this.url = url;
	}
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPropertyname() {
		return propertyname;
	}
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
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
		return "Payment [paymentid=" + paymentid + ", email=" + email + ", userid=" + userid + ", propertyname="
				+ propertyname + ", status=" + status + ", propertydesc=" + propertydesc + ", propertytype="
				+ propertytype + ", prize=" + prize + ", url=" + url + "]";
	}

	
	
	
	

}
