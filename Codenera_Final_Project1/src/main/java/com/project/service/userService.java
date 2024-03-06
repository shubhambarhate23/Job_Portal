package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.company;
import com.project.entity.user;
import com.project.repository.UserRepository;

@Service
public class userService {

	@Autowired
	private UserRepository userRepository;
	
	public user findByemailAndPassword(String email,String password)
	{
		user user=userRepository.findByemailAndPassword(email, password);
		
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}
		
	}
	
	public user findByEmail(String email)
	{
		
		return userRepository.findByEmail(email);
	}
}
