package com.demo.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.main.entity.User;
@Service
public interface UserService {

	public List<User> getAllUser();

	public String deleteUser(User user);

	public User loginUser(String email, String password);

	public User updateUser(User user);
    
	public List<User> getUserByuserId(int userId);

	public User addUser(User user);

	public List<User> viewAllUsers();
}
