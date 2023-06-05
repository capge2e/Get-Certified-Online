package com.demo.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.main.entity.Admin;

@Service
public interface AdminService {

	 public Admin registerAdmin(Admin admin);

	public Admin updateAdmin(Admin admin);

	public String deleteAdmin(Admin admin);

	public Admin loginAdmin(String email, String password);

	public List<Admin> viewAllAdmins();

	public Admin addAdmin(Admin admin);

}
