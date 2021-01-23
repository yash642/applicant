package com.pf.applicant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pf.applicant.dao.ApplicantDao;
import com.pf.applicant.entity.Applicant;


@Service
public class ApplicantService {

	@Autowired
	ApplicantDao appdao;
	
	public Applicant addApplicant(Applicant applicant) {
		return this.appdao.save(applicant);
	}
	
	public void deleteApplicant(Integer id) {
		 this.appdao.deleteById(id);;
	}
	
	public List<Applicant> getAllApplicant() {
		return this.appdao.findAll();
	}
	
	public Optional<Applicant> searchApplicant(Integer id) {
		return this.appdao.findById(id);
	}
	
}
