package com.cjc.ef.enquiry.serviceimpl;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.ef.enquiry.model.Enquiry;
import com.cjc.ef.enquiry.repository.EnquiryRepository;
import com.cjc.ef.enquiry.service.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService
{
	@Autowired
	EnquiryRepository enquiryRepository;

	@Override
	public Enquiry insertData(Enquiry enquiry) 
	{
		Random random=new Random();
		int a=random.nextInt(500);
		int num=a+400;
		enquiry.getCibilData().setCibilScore(num);
		if(num<600)
		{
			enquiry.getCibilData().setCibilStatus("Worst");
		}
		else if (num>=600 && num <=649)
		{
			enquiry.getCibilData().setCibilStatus("Doubtfull");
		}
		else if (num>=650 && num <=699)
		{
			enquiry.getCibilData().setCibilStatus("Satisfactory");
		}
		else if (num>=700 && num <=749)
		{
			enquiry.getCibilData().setCibilStatus("Good");
		}
		else if (num>=750 && num <=900)
		{
			enquiry.getCibilData().setCibilStatus("Excellent");
		}
		return enquiryRepository.save(enquiry);
	}

	@Override
	public List<Enquiry> viewAllData() 
	{
		return enquiryRepository.findAll();
	}
	
}
