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


}
