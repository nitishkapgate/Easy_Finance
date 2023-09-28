package com.cjc.ef.registration.service;

import com.cjc.ef.registration.model.Registration;

public interface RegistrationService
{

	Registration insertdata(Registration registration);

	Iterable<Registration> showalldata();

}
