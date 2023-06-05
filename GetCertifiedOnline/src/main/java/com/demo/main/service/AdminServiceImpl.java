package com.demo.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.entity.Admin;
import com.demo.main.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepository adminRepository; 
	
	@Override
	public Admin registerAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin loginAdmin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> viewAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}