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
import com.demo.main.service.AdminService;
import com.demo.main.service.ExamService;




@RestController
@RequestMapping("/Admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	
	@GetMapping("/")
	public String defaultMessage() {
		return "Welcome to Admin Page";
	}
	//http://localhost:8089/Admin/registerAdmin
	@PostMapping("/registerAdmin")
	public Admin addAdmin(@RequestBody Admin admin)  {
		try {
			return adminService.addAdmin(admin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
	}
	//http://localhost:8089/Admin/allAdmins
	@GetMapping("/allAdmins")
	public List<Admin> viewAllAdmins(){
		return adminService.viewAllAdmins();
	}
	
	//http://localhost:8089/Admin/updateAdmin
	@PutMapping("/updateAdmin")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return adminService.updateAdmin(admin);
	}
	
	//http://localhost:8089/Admin/deleteAdmin
	@DeleteMapping("/deleteAdmin")
	public String deleteAdmin(@RequestBody Admin admin)  {
		return adminService.deleteAdmin(admin);
	}
	//http://localhost:8089/Admin/loginAdmin/{email}/{password}
	@GetMapping("/loginAdmin/{email}/{password}")
	public Admin loginAdmin(@PathVariable String email, @PathVariable String password) 
	{
		return adminService.loginAdmin(email, password);
	}
		
	}

