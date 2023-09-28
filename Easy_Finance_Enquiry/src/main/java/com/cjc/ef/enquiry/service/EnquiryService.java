package com.cjc.ef.enquiry.service;

import java.util.List;

import com.cjc.ef.enquiry.model.Enquiry;

public interface EnquiryService 
{

	Enquiry insertData(Enquiry enquiry);

	List<Enquiry> viewAllData();
	

}
