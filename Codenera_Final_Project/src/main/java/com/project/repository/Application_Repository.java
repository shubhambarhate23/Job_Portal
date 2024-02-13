package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Application;

@Repository
public interface Application_Repository extends JpaRepository<Application, Integer>{

}
