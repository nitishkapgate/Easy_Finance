package com.cjc.ef.enquiry.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Enquiry 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int enquiryId;
	String customerName;
	long customerMobile;
	String customerPancardNo;
	String customerEmail;
	@OneToOne(cascade = CascadeType.ALL)
	Cibil cibilData;
	public int getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}
	public String getCustomerPancardNo() {
		return customerPancardNo;
	}
	public void setCustomerPancardNo(String customerPancardNo) {
		this.customerPancardNo = customerPancardNo;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Cibil getCibilData() {
		return cibilData;
	}
	public void setCibilData(Cibil cibilData) {
		this.cibilData = cibilData;
	}
	
	
}
