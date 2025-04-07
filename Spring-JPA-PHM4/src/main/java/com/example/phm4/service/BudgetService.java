package com.example.phm4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phm4.entity.Budget;
import com.example.phm4.exception.BudgetNotFoundException;
import com.example.phm4.repository.BudgetRepository;

@Service
public class BudgetService {

	@Autowired
	BudgetRepository budgetRepository;

	public Budget createBudget(Budget budget) {
		return budgetRepository.save(budget);
	}

	public List<Budget> createBudgets(List<Budget> budgets) {
		return budgetRepository.saveAll(budgets);
	}

	public List<Budget> readBudgets() {
		return budgetRepository.findAll();
	}

	public Optional<Budget> readBudgetById(int bid) {
		return budgetRepository.findById(bid);
	}

	public Budget updateBudget(int bid, Budget newBudget) throws BudgetNotFoundException {
	    Optional<Budget> optionalBudget = budgetRepository.findById(bid);

	    if (optionalBudget.isPresent()) {
	        Budget existingBudget = optionalBudget.get();
	        existingBudget.setCategory(newBudget.getCategory());
	        existingBudget.setAmount(newBudget.getAmount());
	        existingBudget.setMonth(newBudget.getMonth());
	        return budgetRepository.save(existingBudget);
	    } else {
	        throw new BudgetNotFoundException("Budget not found with id: " + bid);
	    }
	}
	
	public String deleteById(int bid) {
		budgetRepository.deleteById(bid);
		return "Budget deleted";
	}
	
	public List<Budget> findByCategory(String category) {
		return budgetRepository.findByCategory(category);
	}

}