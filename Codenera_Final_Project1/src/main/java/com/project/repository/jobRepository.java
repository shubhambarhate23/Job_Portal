package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entity.company;
import com.project.entity.job;

public interface jobRepository extends JpaRepository<job, Integer>{

	List<job> findByCompany(company company);

	List<job> findAllBycompany(company company);
}
