package com.cjc.ef.registration.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customerId;
	String customerName;
	@OneToOne(cascade = CascadeType.ALL)
	Address customerAddress;
	String customerDOB;
	@Lob
	byte[] customerAadharard;
	@Lob
	byte[] customerPancard;
	String customerGender;
	String customerNationality;
	long customerMobile;	
	String customerEmail;
	private int getCustomerId() {
		return customerId;
	}
	private void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	private String getCustomerName() {
		return customerName;
	}
	private void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	private Address getCustomerAddress() {
		return customerAddress;
	}
	private void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	private String getCustomerDOB() {
		return customerDOB;
	}
	private void setCustomerDOB(String customerDOB) {
		this.customerDOB = customerDOB;
	}
	private byte[] getCustomerAadharard() {
		return customerAadharard;
	}
	private void setCustomerAadharard(byte[] customerAadharard) {
		this.customerAadharard = customerAadharard;
	}
	private byte[] getCustomerPancard() {
		return customerPancard;
	}
	private void setCustomerPancard(byte[] customerPancard) {
		this.customerPancard = customerPancard;
	}
	private String getCustomerGender() {
		return customerGender;
	}
	private void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	private String getCustomerNationality() {
		return customerNationality;
	}
	private void setCustomerNationality(String customerNationality) {
		this.customerNationality = customerNationality;
	}
	private long getCustomerMobile() {
		return customerMobile;
	}
	private void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}
	private String getCustomerEmail() {
		return customerEmail;
	}
	private void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	


}
