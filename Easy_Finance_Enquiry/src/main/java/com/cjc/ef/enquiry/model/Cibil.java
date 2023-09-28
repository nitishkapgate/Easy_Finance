package com.cjc.ef.enquiry.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cibil 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cibilId;
	int cibilScore;
	String cibilStatus;
	String cibilGeneratedDate;
	public int getCibilId() {
		return cibilId;
	}
	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getCibilStatus() {
		return cibilStatus;
	}
	public void setCibilStatus(String cibilStatus) {
		this.cibilStatus = cibilStatus;
	}
	public String getCibilGeneratedDate() {
		return cibilGeneratedDate;
	}
	public void setCibilGeneratedDate(String cibilGeneratedDate) {
		this.cibilGeneratedDate = cibilGeneratedDate;
	}
}
