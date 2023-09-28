package com.cjc.ef.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CurrentLoanDetail 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int currentLoanId;
	double currentLoanAmount;
	//currentLoanEmiDetail;
	int currentLoanRateOfInterest;
	double currentLoanTotalAmtToBePaid;
	int currentLoanTotalInterest;
	String currentLoanStatus;
	int currentLoanTenure;
	private int getCurrentLoanId() {
		return currentLoanId;
	}
	private void setCurrentLoanId(int currentLoanId) {
		this.currentLoanId = currentLoanId;
	}
	private double getCurrentLoanAmount() {
		return currentLoanAmount;
	}
	private void setCurrentLoanAmount(double currentLoanAmount) {
		this.currentLoanAmount = currentLoanAmount;
	}
	private int getCurrentLoanRateOfInterest() {
		return currentLoanRateOfInterest;
	}
	private void setCurrentLoanRateOfInterest(int currentLoanRateOfInterest) {
		this.currentLoanRateOfInterest = currentLoanRateOfInterest;
	}
	private double getCurrentLoanTotalAmtToBePaid() {
		return currentLoanTotalAmtToBePaid;
	}
	private void setCurrentLoanTotalAmtToBePaid(double currentLoanTotalAmtToBePaid) {
		this.currentLoanTotalAmtToBePaid = currentLoanTotalAmtToBePaid;
	}
	private int getCurrentLoanTotalInterest() {
		return currentLoanTotalInterest;
	}
	private void setCurrentLoanTotalInterest(int currentLoanTotalInterest) {
		this.currentLoanTotalInterest = currentLoanTotalInterest;
	}
	private String getCurrentLoanStatus() {
		return currentLoanStatus;
	}
	private void setCurrentLoanStatus(String currentLoanStatus) {
		this.currentLoanStatus = currentLoanStatus;
	}
	private int getCurrentLoanTenure() {
		return currentLoanTenure;
	}
	private void setCurrentLoanTenure(int currentLoanTenure) {
		this.currentLoanTenure = currentLoanTenure;
	}
}
