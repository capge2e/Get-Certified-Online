package com.demo.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	
	
  @Id
  @GeneratedValue
  private int userId;
  private String firstName;
  private String lastName;
  private String email;
  private String password;
  private int mobileNo;
  
  
  public User() {
	super();
	// TODO Auto-generated constructor stub
}




public User(int userId, String firstName, String lastName, String email, String password, int mobileNo) {
	super();
	this.userId = userId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.mobileNo = mobileNo;
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

public int getMobileNo() {
	return mobileNo;
}

public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", password=" + password + ", mobileNo=" + mobileNo + "]";
}

}