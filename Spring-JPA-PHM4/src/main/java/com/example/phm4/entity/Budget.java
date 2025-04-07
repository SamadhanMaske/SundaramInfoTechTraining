package com.example.phm4.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "budget_phm4")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int budgetId;

    private String category;
    private double amount;
    private String month;

    public Budget() {}

    public Budget(String category, double amount, String month) {
        this.category = category;
        this.amount = amount;
        this.month = month;
    }

    public int getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(int budgetId) {
        this.budgetId = budgetId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Budget [budgetId=" + budgetId + ", category=" + category + ", amount=" + amount + ", month=" + month + "]";
    }
}
