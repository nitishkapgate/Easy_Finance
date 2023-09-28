package com.cjc.ef.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GaranterDetail 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int garanterId;
	String garanterName;
	String garanterDOB;
	String garanterRelationWithCustomer;
	long garanterMobile; 
	long garanterAadharCard;
	String garanterAddrArea;
	String garanterAddrCity;
	int garanterAddrPincode;
	String garanterPancard;
	private int getGaranterId() {
		return garanterId;
	}
	private void setGaranterId(int garanterId) {
		this.garanterId = garanterId;
	}
	private String getGaranterName() {
		return garanterName;
	}
	private void setGaranterName(String garanterName) {
		this.garanterName = garanterName;
	}
	private String getGaranterDOB() {
		return garanterDOB;
	}
	private void setGaranterDOB(String garanterDOB) {
		this.garanterDOB = garanterDOB;
	}
	private String getGaranterRelationWithCustomer() {
		return garanterRelationWithCustomer;
	}
	private void setGaranterRelationWithCustomer(String garanterRelationWithCustomer) {
		this.garanterRelationWithCustomer = garanterRelationWithCustomer;
	}
	private long getGaranterMobile() {
		return garanterMobile;
	}
	private void setGaranterMobile(long garanterMobile) {
		this.garanterMobile = garanterMobile;
	}
	private long getGaranterAadharCard() {
		return garanterAadharCard;
	}
	private void setGaranterAadharCard(long garanterAadharCard) {
		this.garanterAadharCard = garanterAadharCard;
	}
	private String getGaranterAddrArea() {
		return garanterAddrArea;
	}
	private void setGaranterAddrArea(String garanterAddrArea) {
		this.garanterAddrArea = garanterAddrArea;
	}
	private String getGaranterAddrCity() {
		return garanterAddrCity;
	}
	private void setGaranterAddrCity(String garanterAddrCity) {
		this.garanterAddrCity = garanterAddrCity;
	}
	private int getGaranterAddrPincode() {
		return garanterAddrPincode;
	}
	private void setGaranterAddrPincode(int garanterAddrPincode) {
		this.garanterAddrPincode = garanterAddrPincode;
	}
	private String getGaranterPancard() {
		return garanterPancard;
	}
	private void setGaranterPancard(String garanterPancard) {
		this.garanterPancard = garanterPancard;
	}
	
	


}
