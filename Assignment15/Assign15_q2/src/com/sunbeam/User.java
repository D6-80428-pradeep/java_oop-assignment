package com.sunbeam;

import java.util.Date;

public class User {
	int id;
	String fname;
	String lname;
	String email;
	String pass;
	Date dob;
	int status;
	String role;
	public User() {
	}
	
	public User(int id, String fname, String lname, String email, String pass, Date dob, int status, String role) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id = " + id + ", fname = " + fname + ", lname = " + lname + ", email = " + email + ", password = " + pass + ", dob = " + dob + ", status = " + status + ", role = " + role + "]";
	}
}
