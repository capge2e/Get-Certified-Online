package com.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.entity.Admin;
import com.demo.main.entity.Exam;
import com.demo.main.entity.User;
import com.demo.main.service.ExamService;
import com.demo.main.service.UserService;




@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	
	@GetMapping("/")
	public String defaultMessage() {
		return "Welcome to User Page";
	}
	//http://localhost:8089/User/registerUser
	@PostMapping("/registerUser")
	public User addUser(@RequestBody User user)  {
		try {
			return userService.addUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	//http://localhost:8089/User/allUser
	@GetMapping("/allUsers")
	public List<User> viewAllUsers(){
		return userService.viewAllUsers();
	}
	
	//http://localhost:8089/User/updateUser
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	//http://localhost:8089/User/deleteUser
	@DeleteMapping("/deleteUser")
	public String deleteUser(@RequestBody User user)  {
		return userService.deleteUser(user);
	}

	@GetMapping("/loginUser/{email}/{password}")
	public User loginUser(@PathVariable String email, @PathVariable String password) 
	{
		return userService.loginUser(email, password);
	}
	
}


