package com.project.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.project.entity.company;
import com.project.entity.job;
import com.project.repository.CompanyRepository;
import com.project.repository.jobRepository;

@Service
public class companyService {

	@Autowired
	private CompanyRepository Companyrepository;
	
	@Autowired
	private jobRepository jobRepository;
	
	public company findByEmail(String email)
	{
		
		return Companyrepository.findByEmail(email);
	}
	
	
	/*public List<company> findAllById(Integer id)
	{
		
		return Companyrepository.findAllById(id);
	}*/
	public company getCompanyById(Integer companyId)
	{
		 return Companyrepository.findById(companyId).orElse(null);
	}
	
	public List<job> getJobsByCompany(Integer companyId)
	{
		company company1 = getCompanyById(companyId);
        if (company1 != null) {
            return jobRepository.findByCompany(company1);
            
        }
        else
        {
        return Collections.emptyList();
        }
	}
	
	
	
}
