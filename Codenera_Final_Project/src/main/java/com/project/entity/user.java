package com.project.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity

public class user {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private long mobile;
	private String password;
	private String password1;
	@ManyToMany
	  @JoinTable(
		        name = "user_applications",
		        joinColumns = @JoinColumn(name = "user_id"),
		        inverseJoinColumns = @JoinColumn(name = "job_id")
		    )
	private Set<job> appliedJobs;
	
	public Set<job> getAppliedJobs() {
		return appliedJobs;
	}
	public void setAppliedJobs(Set<job> appliedJobs) {
		this.appliedJobs = appliedJobs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	
	public user(int id, String name, String email, long mobile, String password, String password1,
			Set<job> appliedJobs) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.password1 = password1;
		this.appliedJobs = appliedJobs;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", password1=" + password1 + "]";
	}
	
	
	
}
