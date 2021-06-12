package com.example.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.model.Applicant;
import com.example.loan.service.ApplicationService;

@RestController
@RequestMapping("/api")
public class ApplicantControlller {
	
	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping(value ="/applicant",
			method=RequestMethod.POST)
	public void addUser(@RequestBody Applicant usr)  
	{    
		applicationService.addUser(usr);    
	}  

	@RequestMapping(value = "/getallapplicants",
			method = RequestMethod.GET)
	public List<Applicant> getStudents(){
		return applicationService.getAll();
		
	}
}
