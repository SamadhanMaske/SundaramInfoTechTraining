package com.example.phm3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.phm3.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {


	public List<Budget> findByCategory(String category);
}
