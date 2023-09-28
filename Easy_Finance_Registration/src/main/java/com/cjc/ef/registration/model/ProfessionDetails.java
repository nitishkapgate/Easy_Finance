package com.cjc.ef.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ProfessionDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int professionId;
	String professionName;
	double professionSalary;
	String professionDesignation;
	@Lob
	byte[] professionSalarySlip;
	private int getProfessionId() {
		return professionId;
	}
	private void setProfessionId(int professionId) {
		this.professionId = professionId;
	}
	private String getProfessionName() {
		return professionName;
	}
	private void setProfessionName(String professionName) {
		this.professionName = professionName;
	}
	private double getProfessionSalary() {
		return professionSalary;
	}
	private void setProfessionSalary(double professionSalary) {
		this.professionSalary = professionSalary;
	}
	private String getProfessionDesignation() {
		return professionDesignation;
	}
	private void setProfessionDesignation(String professionDesignation) {
		this.professionDesignation = professionDesignation;
	}
	private byte[] getProfessionSalarySlip() {
		return professionSalarySlip;
	}
	private void setProfessionSalarySlip(byte[] professionSalarySlip) {
		this.professionSalarySlip = professionSalarySlip;
	}	
}
