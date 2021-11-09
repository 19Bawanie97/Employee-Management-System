package net.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.springboot.model.CompanyExpences;

public interface CompanyExpencesRepo extends JpaRepository<CompanyExpences, Integer>{
	
}
