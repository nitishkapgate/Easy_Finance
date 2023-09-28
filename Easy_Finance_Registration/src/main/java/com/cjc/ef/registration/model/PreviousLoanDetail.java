package com.cjc.ef.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PreviousLoanDetail 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int previousLoanId;
	double previousLoanAmount;
	String previousLoanStatus;
	int previousLoanTenure;
	double previousLoanPaidAmount;
	double previousLoanRemainingAmount;
	String previousLoanBank;
	int previousLoanDefaulterCount;
	private int getPreviousLoanId() {
		return previousLoanId;
	}
	private void setPreviousLoanId(int previousLoanId) {
		this.previousLoanId = previousLoanId;
	}
	private double getPreviousLoanAmount() {
		return previousLoanAmount;
	}
	private void setPreviousLoanAmount(double previousLoanAmount) {
		this.previousLoanAmount = previousLoanAmount;
	}
	private String getPreviousLoanStatus() {
		return previousLoanStatus;
	}
	private void setPreviousLoanStatus(String previousLoanStatus) {
		this.previousLoanStatus = previousLoanStatus;
	}
	private int getPreviousLoanTenure() {
		return previousLoanTenure;
	}
	private void setPreviousLoanTenure(int previousLoanTenure) {
		this.previousLoanTenure = previousLoanTenure;
	}
	private double getPreviousLoanPaidAmount() {
		return previousLoanPaidAmount;
	}
	private void setPreviousLoanPaidAmount(double previousLoanPaidAmount) {
		this.previousLoanPaidAmount = previousLoanPaidAmount;
	}
	private double getPreviousLoanRemainingAmount() {
		return previousLoanRemainingAmount;
	}
	private void setPreviousLoanRemainingAmount(double previousLoanRemainingAmount) {
		this.previousLoanRemainingAmount = previousLoanRemainingAmount;
	}
	private String getPreviousLoanBank() {
		return previousLoanBank;
	}
	private void setPreviousLoanBank(String previousLoanBank) {
		this.previousLoanBank = previousLoanBank;
	}
	private int getPreviousLoanDefaulterCount() {
		return previousLoanDefaulterCount;
	}
	private void setPreviousLoanDefaulterCount(int previousLoanDefaulterCount) {
		this.previousLoanDefaulterCount = previousLoanDefaulterCount;
	}
}
