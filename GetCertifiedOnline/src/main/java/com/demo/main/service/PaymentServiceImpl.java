package com.demo.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.entity.Payment;
import com.demo.main.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
	PaymentRepository paymentRepository;
    
	@Override
	public List<Payment> getAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment registerPayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment updatePayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getPaymentBypaymentId(int paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> findPaymentWithSorting(int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> viewAllPayments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment addPayment(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

}
