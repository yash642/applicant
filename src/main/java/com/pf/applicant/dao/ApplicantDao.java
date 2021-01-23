package com.pf.applicant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pf.applicant.entity.Applicant;

@Repository
public interface ApplicantDao extends JpaRepository<Applicant, Integer> {

}
