package com.pf.applicant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pf.applicant.entity.Applicant;
import com.pf.applicant.service.ApplicantService;

import io.swagger.annotations.Api;


@RestController
@RequestMapping("/ApplicantCtrl")
@Api(value = "Applicant Service for Platform using logger and swagger")
public class ApplicantController {
	
	@Autowired
	ApplicantService applicantservice;
	
	
	@PostMapping("/addapplicant")	
//	@ApiOperation(value = "To Add Applicant", nickname = "addApplicant", response = Applicant.class)
//	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Applicant.class),
//			@ApiResponse(code = 401, message = "not authorized!", response = Applicant.class), @ApiResponse(code = 403, message = "forbidden!!!", response = Applicant.class),
//			@ApiResponse(code = 404, message = "not found!!!", response = Applicant.class) }	)					
	public Applicant addApplicant(@RequestBody Applicant user) {		 
		return this.applicantservice.addApplicant(user);
	}
	
	
	@DeleteMapping("/deleteapplicant/{applicantId}")
	public void deleteApplicant(@PathVariable("applicantId") Integer applicantId) {
		this.applicantservice.deleteApplicant(applicantId);
	}
	
	
	@GetMapping("/allapplicant")
	public List<Applicant> getAllApplicant(){
		return this.applicantservice.getAllApplicant();
		
	}
	
	
	@GetMapping("/getapplicant/{applicantId}")
	public Optional<Applicant> getCustomerById(@PathVariable("applicantId") Integer applicantId) {
		return this.applicantservice.searchApplicant(applicantId);
	}

}
