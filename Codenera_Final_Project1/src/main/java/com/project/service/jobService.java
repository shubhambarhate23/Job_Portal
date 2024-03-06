package com.project.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.project.entity.company;
import com.project.entity.job;
import com.project.repository.CompanyRepository;
import com.project.repository.jobRepository;

/*  public List<EntityA> getEntitiesAByEntityBId(Long entityBId) {
        EntityB entityB = entityBRepository.findById(entityBId).orElse(null);

        if (entityB != null) {
            return entityARepository.findByEntityB(entityB);
        } else {
            return Collections.emptyList();
        }
    }*/
@Service
public class jobService {

	@Autowired
	private jobRepository jobrepository;
	
	@Autowired
	private CompanyRepository companyrepository;
	
	/*
	 * //Query() public List<job> findAllBycompanyId(Integer Companyid) { company
	 * company =companyrepository.findById(Companyid).orElse(null); Integer
	 * id=company.getId(); if(company!=null) { return
	 * jobrepository.findAllBycompanyId(id); } else { return
	 * Collections.emptyList(); } }
	 */
	
	
	/*public List<job> findAllByCompany(Integer Companyid)
	{
		Optional<company> company=companyrepository.findById(Companyid);
		List<job> Cjobs=jobrepository.findAllBycompany(Companyid);
		return Cjobs;
	}*/
}
