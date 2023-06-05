package com.demo.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
    
	@Id
	@GeneratedValue
	private String aId;
    private String name;
    private String email;
    private String password;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String aId, String name, String email, String password) {
		super();
		this.aId = aId;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public String getaId() {
		return aId;
	}
	public void setaId(String aId) {
		this.aId = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
}