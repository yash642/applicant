package com.pf.applicant.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Applicant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appId; 
	
	private String domain;
	
	private String college;
	
	private String type;
	
	private String name;
	
	private String emailId;
	
	private String address;
	
	private String mobile;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dob; 
	
	public Applicant() {
		// TODO Auto-generated constructor stub
	}

	public Applicant(String domain, String college, String type, String name, String emailId, String address,
			String mobile, LocalDate dob) {
		super();
		this.domain = domain;
		this.college = college;
		this.type = type;
		this.name = name;
		this.emailId = emailId;
		this.address = address;
		this.mobile = mobile;
		this.dob = dob;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Applicant [appId=" + appId + ", domain=" + domain + ", college=" + college + ", type=" + type
				+ ", name=" + name + ", emailId=" + emailId + ", address=" + address + ", mobile=" + mobile + ", dob="
				+ dob + "]";
	}
	
	
	
}
