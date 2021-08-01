package com.abc.studentadmissioncontroller;

import java.util.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Student {
	
	@Pattern(regexp = "^[0-9]*")
	private String studentName;
	
	@Size(min = 2, max = 30, message = "Please enter value between {min} and {max} characters")
	private String studentHobby;
	
	@Max(999999999)
	private Long studentMobile;
	
	@Past
	private Date studentDOB;
	private String [] studentSkills;
	private Address studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public String [] getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(String [] studentSkills) {
		this.studentSkills = studentSkills;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
}
