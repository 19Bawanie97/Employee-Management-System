package net.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.springboot.model.Employee;

@Repository 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{ 

}
