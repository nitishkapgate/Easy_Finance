package com.cjc.ef.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LocalAddress 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int localAddrId;
	String houseNo;
	String area;
	String city;
	int pincode;
	String district;
	String state;
	private int getLocalAddrId() {
		return localAddrId;
	}
	private void setLocalAddrId(int localAddrId) {
		this.localAddrId = localAddrId;
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
