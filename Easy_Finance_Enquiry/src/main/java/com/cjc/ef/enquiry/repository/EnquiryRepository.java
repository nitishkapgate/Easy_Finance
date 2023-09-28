package com.cjc.ef.enquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.ef.enquiry.model.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry, Integer> 
{
	

}
