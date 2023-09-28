package com.cjc.ef.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bankId;
	String bankName;
	String bankBranch;
	String bankIFSC;
	long bankAccNo;
	String bankAccType;
	private int getBankId() {
		return bankId;
	}
	private void setBankId(int bankId) {
		this.bankId = bankId;
	}
	private String getBankName() {
		return bankName;
	}
	private void setBankName(String bankName) {
		this.bankName = bankName;
	}
	private String getBankBranch() {
		return bankBranch;
	}
	private void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	private String getBankIFSC() {
		return bankIFSC;
	}
	private void setBankIFSC(String bankIFSC) {
		this.bankIFSC = bankIFSC;
	}
	private long getBankAccNo() {
		return bankAccNo;
	}
	private void setBankAccNo(long bankAccNo) {
		this.bankAccNo = bankAccNo;
	}
	private String getBankAccType() {
		return bankAccType;
	}
	private void setBankAccType(String bankAccType) {
		this.bankAccType = bankAccType;
	}
	
}
