package com.example.demo.Model;

import com.example.demo.Entity.Employe;

public class EmployeModel {
	//modelo para usar el controlador 
	Long id;
	private String first_name;
	private String last_name;
	private String email_address;
	private String job_title;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public EmployeModel(Long id, String first_name, String last_name, String email_address, String job_title) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_address = email_address;
		this.job_title = job_title;
	}
	//entidad a objeto
	public EmployeModel(Employe e) {
		//this.id = e.getId(); no deberia pasar 
		this.first_name = e.getFirst_name();
		this.last_name = e.getLast_name();
		this.email_address = e.getEmail_address();
		this.job_title = e.getJob_title();
	}
	
	
	
}
