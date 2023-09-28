package com.cjc.ef.registration.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.ef.registration.model.Registration;
import com.cjc.ef.registration.repository.RegistrationRepository;
import com.cjc.ef.registration.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService
{
	@Autowired
	RegistrationRepository registrationRepository;

	@Override
	public Registration insertdata(Registration registration) 
	{	
		return registrationRepository.save(registration);
	}

	@Override
	public Iterable<Registration> showalldata() {
		return registrationRepository.findAll();
	}

}
