package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.repository.Application_Repository;

@Service
public class ApplicationService {

	@Autowired
	private Application_Repository ar;
}
