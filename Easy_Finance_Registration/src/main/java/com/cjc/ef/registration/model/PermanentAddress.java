package com.cjc.ef.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PermanentAddress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int permanentAddrId;
	String houseNo;
	String area;
	String city;
	int pincode;
	String district;
	String state;
	private int getPermanentAddrId() {
		return permanentAddrId;
	}
	private void setPermanentAddrId(int permanentAddrId) {
		this.permanentAddrId = permanentAddrId;
	}
	private String getHouseNo() {
		return houseNo;
	}
	private void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	private String getArea() {
		return area;
	}
	private void setArea(String area) {
		this.area = area;
	}
	private String getCity() {
		return city;
	}
	private void setCity(String city) {
		this.city = city;
	}
	private int getPincode() {
		return pincode;
	}
	private void setPincode(int pincode) {
		this.pincode = pincode;
	}
	private String getDistrict() {
		return district;
	}
	private void setDistrict(String district) {
		this.district = district;
	}
	private String getState() {
		return state;
	}
	private void setState(String state) {
		this.state = state;
	}
	
	

}
