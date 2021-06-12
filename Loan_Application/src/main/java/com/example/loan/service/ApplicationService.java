package com.example.loan.service;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.loan.model.Applicant;
import com.example.loan.repository.ApplicantRepository;


import java.time.temporal.ChronoUnit;

@Component
public class ApplicationService {

	@Autowired
	private ApplicantRepository applicantRepository;
	public void addUser(Applicant usr)  
	{    
	LocalDate today = LocalDate.now();
	LocalDate lastloan = usr.getLast_Loan_Taken();
	Long range = ChronoUnit.DAYS.between(today, lastloan);
	System.out.println("TOTAL DAYS" +range);
	try {
		if (range<30)
			applicantRepository.save(usr);
			
	}
	catch (Exception e) {
		
	}
    
	}    
	
	public List<Applicant> getAll() {
		return List.of( new Applicant ("12345", 123, 123, LocalDate.of(1997, 07, 22)));
		//return applicantRepository.findAll();
	}

}
