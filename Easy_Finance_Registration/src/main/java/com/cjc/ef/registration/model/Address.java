package com.cjc.ef.registration.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int addressId;
	@OneToOne(cascade = CascadeType.ALL)
	PermanentAddress permanentAddr;
	@OneToOne(cascade = CascadeType.ALL)
	LocalAddress localAddr;
	private int getAddressId() {
		return addressId;
	}
	private void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	private PermanentAddress getPermanentAddr() {
		return permanentAddr;
	}
	private void setPermanentAddr(PermanentAddress permanentAddr) {
		this.permanentAddr = permanentAddr;
	}
	private LocalAddress getLocalAddr() {
		return localAddr;
	}
	private void setLocalAddr(LocalAddress localAddr) {
		this.localAddr = localAddr;
	}
}
