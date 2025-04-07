package com.example.phm4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.phm4.entity.Budget;
import com.example.phm4.exception.BudgetNotFoundException;
import com.example.phm4.service.BudgetService;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

    @Autowired
    BudgetService budgetService;

    // Create single budget
    @PostMapping
    public Budget createBudget(@RequestBody Budget budget) {
        return budgetService.createBudget(budget);
    }

    // Create multiple budgets
    @PostMapping("/batch")
    public List<Budget> createBudgets(@RequestBody List<Budget> budgets) {
        return budgetService.createBudgets(budgets);
    }

    // Get all budgets
    @GetMapping
    public List<Budget> readBudgets() {
        return budgetService.readBudgets();
    }

    // Get budget by ID
    @GetMapping("/{bid}")
    public Optional<Budget> readBudgetById(@PathVariable("bid") int bid) {
        return budgetService.readBudgetById(bid);
    }

    // Update budget
    @PutMapping("/{bid}")
    public Budget updateBudget(@PathVariable("bid") int bid, @RequestBody Budget newBudget) throws BudgetNotFoundException {
        return budgetService.updateBudget(bid, newBudget);
    }

    // Delete budget
    @DeleteMapping("/{bid}")
    public String deleteBudget(@PathVariable("bid") int bid) {
        return budgetService.deleteById(bid);
    }

    // Find budgets by category
    @GetMapping("/category/{category}")
    public List<Budget> findByCategory(@PathVariable("category") String category) {
        return budgetService.findByCategory(category);
    }
}
