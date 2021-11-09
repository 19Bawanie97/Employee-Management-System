package net.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.springboot.model.CompanyExpences;
import net.springboot.repo.CompanyExpencesRepo;

@Service
public class CompanyExpencesService {
	
	@Autowired
	CompanyExpencesRepo repo;
	
	public void addexpences(CompanyExpences addexpences) {
		repo.save(addexpences);
	}
	
}
