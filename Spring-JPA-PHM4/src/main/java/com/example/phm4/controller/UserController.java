package com.example.phm4.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.phm4.entity.User;
import com.example.phm4.exception.UserNotFoundException;
import com.example.phm4.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PostMapping("/batch")
	public List<User> createUsers(@RequestBody List<User> users){
		return userService.createUsers(users);
	}
	
	@GetMapping("/{id}")
	public User readUser(@PathVariable("id") int id) throws UserNotFoundException {
	    return userService.readUser(id);
	}
	
	@GetMapping("/batch")
	public List<User> readUsers(){
		return userService.readUsers();
	}
	
	@PutMapping("/{id}")
	public String updateUser(@RequestBody User newUser) throws UserNotFoundException {
		return userService.updateUser(newUser);
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable("id") int id) throws UserNotFoundException {
		return userService.deleteUser(id);
	}
	
	@GetMapping("/firstname/{firstname}")
	public List<User> readByFirstName(@PathVariable("firstname") String firstname) throws UserNotFoundException{
		return userService.readByFirstName(firstname);
	}
	
	@GetMapping("/lastname/{lastname}")
	public List<User> readByLastName(@PathVariable("lastname") String lastName) throws UserNotFoundException{
		return userService.readByLastName(lastName);
	}
	
	//Update salary using id
	@PutMapping("/{id}/salary")
	public String updateSalary(@PathVariable("id") int id, @RequestParam("salary") double salary) throws UserNotFoundException {
	    return userService.updateSalaryByID(id, salary);
	}
	
	//Find Users with Salary Greater Than X
	@GetMapping("/salary/greaterthan/{amount}")
    public List<User> readUsersWithSalaryGreaterThan(@PathVariable double amount) {
        return userService.readUsersWithSalaryGreaterThan(amount);
    }

	//Get Average Salary of All Users
    @GetMapping("/salary/average")
    public Double readAverageSalary() {
        return userService.readAverageSalary();
    }

	//Get All Users With Budgets Over a Certain Amount
    @GetMapping("/budgets/greaterthan/{amount}")
    public List<User> readUsersWithHighBudgets(@PathVariable double amount) {
        return userService.readUsersWithBudgetGreaterThan(amount);
    }

	//group users by budget category and return distinct users per category
    @GetMapping("/grouped-by-budget-category")
    public List<User> readGroupedUsersByBudgetCategory() {
        return userService.readGroupedUsersByBudgetCategory();
    }

}
