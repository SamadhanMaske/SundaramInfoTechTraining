package com.example.phm4.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.phm4.entity.User;

import jakarta.transaction.Transactional;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByFirstName(String firstName);
	
	public List<User> findByLastName(String lastName);
	
	//Update salary using id
	@Modifying
    @Transactional
    @Query("UPDATE User u SET u.salary = :salary WHERE u.userId = :userId")
    public int updateSalaryByID(@Param("userId") int userId, @Param("salary") double newSalary);
	
	//Find Users with Salary Greater Than X
	@Query("select u from User u where u.salary>:amount")
	public List<User> findUserWithSalaryGreaterThan(@Param("amount") double amount);
	
	//Get Average Salary of All Users
	@Query("SELECT AVG(u.salary) FROM User u")
	Double getAverageSalary();
	
	//Get All Users With Budgets Over a Certain Amount
	@Query("SELECT u FROM User u JOIN u.budgetList b WHERE b.amount > :amount")
	List<User> readUsersWithBudgetGreaterThan(@Param("amount") double amount);
	
	//group users by budget category and return distinct users per category
	@Query("SELECT DISTINCT u FROM User u JOIN u.budgetList b GROUP BY b.category, u")
	List<User> groupUsersByBudgetCategory();
	
	//Join Query: Get All Budgets with User Details
	@Query(value = "SELECT u.* FROM user u JOIN budget b ON u.user_id = b.user_id WHERE b.category = :category", nativeQuery = true)
	List<User> findUsersByBudgetCategory(@Param("category") String category);
	
	//Get Total Budgeted Amount for a User
	@Query(value = "SELECT SUM(planned_amount) FROM budget WHERE user_id = :userId", nativeQuery = true)
	Double getTotalBudgetAmountForUser(@Param("userId") int userId);
	

}
