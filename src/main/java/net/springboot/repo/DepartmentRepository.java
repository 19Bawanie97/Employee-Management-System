package net.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.springboot.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}