package com.example.phm3.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phm3.entity.Budget;
import com.example.phm3.repository.BudgetRepository;

@Service
public class BudgetService {
	
	@Autowired
	BudgetRepository repo;

	public List<Budget> getAllBudgets() {
		return repo.findAll();
	}

	public Optional<Budget> getBudgetById(int bid) {
		return repo.findById(bid);
	}

	public Budget addBudget(Budget budget) {
		return repo.save(budget);
	}

	public String deleteById(int bid) {
		repo.deleteById(bid);
		return "Budget deleted";
	}
	
	
	public List<Budget> findByCategory(String category) {
		return repo.findByCategory(category);
	}
	

	
}