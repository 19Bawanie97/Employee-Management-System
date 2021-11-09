package net.springboot.service;

import java.util.List;

import net.springboot.model.Department;

public interface DepartmentService {
	List<Department> getAllDepartments();
	void saveDepartment(Department department);
	Department getDepartmentById(int id);
	void deleteDepartmentById(int id);	
}

