package com.example.phour.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.phour.model.Budget;

@Service
public class BudgetService {

    private final List<Budget> budgetList = new ArrayList<>();

    public BudgetService() {
        budgetList.add(new Budget(101, 201, "Home", 5000, "April"));
        budgetList.add(new Budget(102, 202, "Health", 6000, "May"));
        budgetList.add(new Budget(103, 203, "Sport", 4000, "June"));
        budgetList.add(new Budget(104, 204, "Entertainment", 5000, "April"));
        budgetList.add(new Budget(105, 205, "Travel", 5000, "Aug"));
    }

    //Get all budgets
    public ResponseEntity<List<Budget>> getAllBudgets() {
        return ResponseEntity.ok(budgetList);
    }

    //Get budget by ID
    public ResponseEntity<?> getBudgetById(int bid) {
        for (Budget budget : budgetList) {
            if (budget.getId() == bid) {
                return ResponseEntity.ok(budget);
            }
        }
        return ResponseEntity.badRequest().body("Budget Not Found with id " + bid);
    }

    //Add a new budget
    public ResponseEntity<Budget> addBudget(Budget budget) {
        budgetList.add(budget);
        return ResponseEntity.status(HttpStatus.CREATED).body(budget);
    }

    //Update budget
    public ResponseEntity<String> updateBudget(int bid, double amount) {
        for (Budget budget : budgetList) {
            if (budget.getId() == bid) {
                budget.setAmount(amount);
                return ResponseEntity.ok("Budget Updated Successfully");
            }
        }
        return ResponseEntity.badRequest().body("Budget Not Found with id " + bid);
                 
    }
}
