package com.example.phm4.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_phm4")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String firstName;
    private String lastName;
    private double salary;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id") // This creates the foreign key in budget_phm4 table
    //Unidirectional: This avoids circular dependencies and simplifies serialization (good for REST APIs).
    private List<Budget> budgetList;

    public User() {}

    public User(String firstName, String lastName, double salary, List<Budget> budgetList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.budgetList = budgetList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Budget> getBudgetList() {
        return budgetList;
    }

    public void setBudgetList(List<Budget> budgetList) {
        this.budgetList = budgetList;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
                + ", budgetList=" + budgetList + "]";
    }
}
