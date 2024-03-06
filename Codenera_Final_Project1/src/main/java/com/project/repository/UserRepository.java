package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.company;
import com.project.entity.user;
import java.util.List;


public interface UserRepository extends JpaRepository<user, Integer>{
	
	public user findByemailAndPassword(String email,String password);
	public user findByEmail(String email);

}
