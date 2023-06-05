package com.demo.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	@GeneratedValue
    private String paymentId;
    private double amount;
    private int paymentMode;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(String paymentId, double amount, int paymentMode) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentMode = paymentMode;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", paymentMode=" + paymentMode + "]";
	}
	
}