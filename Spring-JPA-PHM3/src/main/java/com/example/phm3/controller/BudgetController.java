package com.example.phm3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phm3.entity.Budget;
import com.example.phm3.service.BudgetService;

@RestController
@RequestMapping("/budget")
public class BudgetController {
	
	@Autowired
	BudgetService service;
	
	@GetMapping("/getall")
	public List<Budget> getAllBudget(){
		return service.getAllBudgets();
	}
	
	@GetMapping("/{bid}")
	public Optional<Budget> getBudgetById(@PathVariable("bid") int bid) {
		return service.getBudgetById(bid);
	}

	@PostMapping("/add")
	public Budget addBudget(@RequestBody Budget budget) {
		return service.addBudget(budget);
	}

	@DeleteMapping("/delete/{bid}")
	public String deleteBudget(@PathVariable("bid") int bid) {
		return service.deleteById(bid);
	}
	
	@GetMapping("/category/{category}")
	public List<Budget> findByCategory(@PathVariable("category") String category) {
		return service.findByCategory(category);
	}
	

}
