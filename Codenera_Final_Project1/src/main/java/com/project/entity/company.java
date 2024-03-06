package com.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Companyid;
	private String name;
	private String email;
	private long mobile;
	private String password;
	
	 @OneToMany(mappedBy = "company")
	private List<job> jobs; 
	
	public List<job> getJb() {
		return jobs;
	}
	public void setJb(List<job> jb) {
		this.jobs = jb;
	}
	public int getId() {
		return Companyid;
	}
	public void setId(int Companyid) {
		this.Companyid = Companyid;
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
	

	public company(int companyid, String name, String email, long mobile, String password, List<job> jb) {
		super();
		Companyid = companyid;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.jobs = jb;
	}
	public company() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "company [Companyid=" + Companyid + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", password=" + password + ", jb=" + jobs + "]";
	}
	
	
	
	
}
