package com.bookstore.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Publisher 
{
	@Id
	@GeneratedValue(generator = "pub_seq")
	@SequenceGenerator(name = "pub_seq",initialValue = 111)
	private int publid;
	private String publisher;
	private String phone;
	private String address;
	private String email;
	public int getPublid() {
		return publid;
	}
	public void setPublid(int publid) {
		this.publid = publid;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
