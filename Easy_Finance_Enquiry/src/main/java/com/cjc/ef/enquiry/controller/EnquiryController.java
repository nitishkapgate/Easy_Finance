package com.cjc.ef.enquiry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.ef.enquiry.model.Enquiry;
import com.cjc.ef.enquiry.service.EnquiryService;

@RestController
@CrossOrigin("*")
@RequestMapping("/enquiry")
public class EnquiryController 
{
	@Autowired
	EnquiryService enquiryService;
	
	@PostMapping("/saveenq")
	public Enquiry insertdata(@RequestBody Enquiry enquiry )
	{
		return enquiryService.insertData(enquiry);
	}
	
	@GetMapping("/getenq")
	public List<Enquiry> viewdata()
	{
		List<Enquiry> viewAllData = enquiryService.viewAllData();
		return viewAllData;
	}
	
	

}
