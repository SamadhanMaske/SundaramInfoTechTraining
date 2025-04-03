package com.example.phour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.phour.model.Budget;
import com.example.phour.service.BudgetService;

import java.util.List;

@RestController
@RequestMapping("/budget")
public class BudgetController {

    @Autowired
    private BudgetService service;

    @GetMapping("/getall")
    public ResponseEntity<List<Budget>> getAllBudgets() {
        return service.getAllBudgets();
    }

    @GetMapping("/{bid}")
    public ResponseEntity<Budget> getBudgetById(@PathVariable int bid) {
        return (ResponseEntity<Budget>) service.getBudgetById(bid);
    }

    @PostMapping("/add")
    public ResponseEntity<Budget> addBudget(@RequestBody Budget budget) {
        return service.addBudget(budget);
    }

    @PutMapping("/update/{bid}/{amount}")
    public ResponseEntity<String> updateBudget(@PathVariable("bid") int bid, @PathVariable("amount") double amount) {
        return service.updateBudget(bid, amount);
    }
}
