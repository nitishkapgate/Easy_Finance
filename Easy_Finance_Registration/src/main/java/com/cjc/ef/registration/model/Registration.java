package com.cjc.ef.registration.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Registration 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int registrationID;
	@OneToOne(cascade = CascadeType.ALL)
	Customer customerDetail;
	@OneToOne(cascade = CascadeType.ALL)
	Bank bankDeatail;
	
}
