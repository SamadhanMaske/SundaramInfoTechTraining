package com.example.phm4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.example.phm4.entity.User;
import com.example.phm4.exception.UserNotFoundException;
import com.example.phm4.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User createUser(User user) {
		userRepository.save(user);
		return user;
	}

	public List<User> createUsers(List<User> users) {
		userRepository.saveAll(users);
		return users;
	}

	public User readUser(int id) throws UserNotFoundException {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			throw new UserNotFoundException("User not found with ID: " + id);
		}
	}

	public List<User> readUsers() {
		return userRepository.findAll();
	}

	public String updateUser(User newUser) throws UserNotFoundException {
		Optional<User> optionalUser = userRepository.findById(newUser.getUserId());

		if (optionalUser.isPresent()) {
			User existingUser = optionalUser.get();
			existingUser.setFirstName(newUser.getFirstName());
			existingUser.setLastName(newUser.getLastName());
			existingUser.setSalary(newUser.getSalary());
			existingUser.setBudgetList(newUser.getBudgetList()); // optional

			userRepository.save(existingUser);
			return "User updated successfully with ID: " + existingUser.getUserId() + " by " + newUser;
		} else {
			throw new UserNotFoundException("User not found with Id: " + newUser.getUserId());
		}
	}

	public String deleteUser(int id) throws UserNotFoundException {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isPresent()) {
			userRepository.deleteById(id);
			return "User deleted successfully. Deleted " + optionalUser.get();
		} else {
			throw new UserNotFoundException("User not found with Id: " + id);
		}
	}

	public List<User> readByFirstName(String firstName) throws UserNotFoundException {
		List<User> users = userRepository.findByFirstName(firstName);
		if (users.isEmpty()) {
			throw new UserNotFoundException("No users found with first name: " + firstName);
		}
		return users;
	}

	public List<User> readByLastName(String lastName) throws UserNotFoundException {
		List<User> users = userRepository.findByLastName(lastName);
		if (users.isEmpty()) {
			throw new UserNotFoundException("No user found with last name: " + lastName);
		}
		return users;
	}

	public String updateSalaryByID(int userId, double newSalary) throws UserNotFoundException {
		if (!userRepository.existsById(userId)) {
			throw new UserNotFoundException("User not found with ID: " + userId);
		}
		int rowsUpdated = userRepository.updateSalaryByID(userId, newSalary);
		return "Salary updated for user ID: " + userId + ", rows affected: " + rowsUpdated;
	}

	public List<User> readUsersWithSalaryGreaterThan(double amount) {
		return userRepository.findUserWithSalaryGreaterThan(amount);
	}

	public Double readAverageSalary() {
		return userRepository.getAverageSalary();
	}

	public List<User> readUsersWithBudgetGreaterThan(double amount) {
		return userRepository.readUsersWithBudgetGreaterThan(amount);
	}

	public List<User> readGroupedUsersByBudgetCategory() {
		return userRepository.groupUsersByBudgetCategory();
	}

}
