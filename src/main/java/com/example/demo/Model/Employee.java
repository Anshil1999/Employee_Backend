package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mytable")
public class Employee {
	
	@Id
	private int id;
	private int empid;
	private String firstname;
	private String lastname;
	private int contact;
	private Date dob;
	
	public Employee() {}
	
	public Employee(int id,int empid, String firstname, String lastname, int contact,Date dob) {
		super();
		this.id = id;
		this.empid = empid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.dob = dob;
	}
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	
	public int getempid() {
		return empid;
	}

	public void setempid(int empid) {
		this.empid = empid;
	}

	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
}