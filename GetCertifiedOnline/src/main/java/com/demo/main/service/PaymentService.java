package com.demo.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.main.entity.Payment;

@Service
public interface PaymentService {

	public List<Payment> getAllPayments();

	public Payment registerPayment(Payment payment);

	public Payment updatePayment(Payment payment);

	public String deletePayment(Payment payment);
	
	public Payment getPaymentBypaymentId(int paymentId);
	
	public List<Payment> findPaymentWithSorting(int amount);

	public List<Payment> viewAllPayments();

	public Payment addPayment(Payment payment);
	

}
