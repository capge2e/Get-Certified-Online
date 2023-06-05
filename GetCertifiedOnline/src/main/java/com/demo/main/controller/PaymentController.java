package com.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.demo.main.entity.Payment;
import com.demo.main.service.PaymentService;



@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	
	@GetMapping("/")
	public String defaultMessage() {
		return "Welcome to Payment Page";
	}
	//http://localhost:8089/Payment/registerPayment
	@PostMapping("/registerPayment")
	public Payment addPayment(@RequestBody Payment payment)  {
		try {
			return paymentService.addPayment(payment);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return payment;
	}
	//http://localhost:8089/Payment/allPayment
	@GetMapping("/allPayment")
	public List<Payment> viewAllPayments(){
		return paymentService.viewAllPayments();
	}
	
	//http://localhost:8089/Payment/updatePayment
	@PutMapping("/updatePayment")
	public Payment updatePayment(@RequestBody Payment payment) {
		return paymentService.updatePayment(payment);
	}
	
	//http://localhost:8089/Payment/deletePayment
	@DeleteMapping("/deletePayment")
	public String deletePayment(@RequestBody Payment payment)  {
		return paymentService.deletePayment(payment);
	}
	
	
}


