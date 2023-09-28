package com.cjc.ef.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.ef.registration.model.Registration;
import com.cjc.ef.registration.service.RegistrationService;

@RestController
@CrossOrigin("*")
@RequestMapping("/registration")
public class RegistrationController 
{
	@Autowired
	RegistrationService registrationService;
	
	@PostMapping("/save")
	public Registration insertData(@RequestBody Registration registration)
	{
		return registrationService.insertdata(registration);
	}
	@GetMapping("/getdata")
	public List<Registration> viewdata()
	{
		Iterable<Registration> alldata = registrationService.showalldata();
		return (List<Registration>) alldata;	
	}
}
