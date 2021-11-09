package net.springboot.service;

import java.util.List;

import net.springboot.model.Branch;

public interface BranchService {
	List<Branch> getAllBranches();
	void saveBranch(Branch branch);
	Branch getBranchById(int id);
	void deleteBranchById(int id);
}

