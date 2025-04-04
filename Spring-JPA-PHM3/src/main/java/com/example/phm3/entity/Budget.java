package com.example.phm3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="budget_phm3")
public class Budget {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int userId;
	private String category;
	private double amount;
	private String month;
	
	public Budget() {}

	public Budget(int id, int userId, String category, double amount, String month) {
		super();
		this.id = id;
		this.userId = userId;
		this.category = category;
		this.amount = amount;
		this.month = month;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
		return "Budget [id=" + id + ", userId=" + userId + ", category=" + category + ", amount=" + amount + ", month="
				+ month + "]";
	}
	
	
}