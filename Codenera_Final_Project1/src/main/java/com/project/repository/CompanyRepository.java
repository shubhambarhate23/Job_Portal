package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entity.company;
import com.project.entity.job;

public interface CompanyRepository extends JpaRepository<company, Integer>{
	
	public company findByEmail(String email);
	
	//@Query(select * from company c,job j where c.jb_id=j.company_companyid);
	//public List<company> findAllById(Integer id);
	
}
