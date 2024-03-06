package com.project.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String jname;
	
	private String discription;
	
	private String salary;
	
	private String department;
	
	@ManyToOne
	@JoinColumn(name = "company_id")
	private company company;

	/*@ManyToMany(mappedBy = "appliedJobs")
    private Set<user> applicants = new HashSet<>();*/
	
	@ManyToMany//(mappedBy = "appliedJobs")
	private Set<user> applicants;
	
	

	public Set<user> getApplicants() {
		return applicants;
	}

	public void setApplicants(Set<user> applicants) {
		this.applicants = applicants;
	}

	public company getCompany() {
		return company;
	}

	public void setCompany(company company) {
		this.company = company;
	}

	

	public job(int id, String jname, String discription, String salary, String department,
			com.project.entity.company company, Set<user> applicants) {
		super();
		this.id = id;
		this.jname = jname;
		this.discription = discription;
		this.salary = salary;
		this.department = department;
		this.company = company;
		this.applicants = applicants;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	public job() {
		super();
	}

	@Override
	public String toString() {
		return "job [id=" + id + ", Jname=" + jname + ", Discription=" + discription + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
}
