package net.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.springboot.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

}