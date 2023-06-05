package com.demo.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.main.entity.Certification;
import com.demo.main.entity.Exam;
import com.demo.main.service.CertificationService;
import com.demo.main.service.ExamService;



@RestController
@RequestMapping("/certification")
public class CertificationController {
	@Autowired
	CertificationService certificationService;
	
	
	@GetMapping("/")
	public String defaultMessage() {
		return "Welcome to Certification Page";
	}
	//http://localhost:8089/Certification/registerCertification
	@PostMapping("/registerCertification")
	public Certification addCertification(@RequestBody Certification certification)  {
		try {
			return certificationService.addCertification(certification);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return certification;
	}
	//http://localhost:8089/Certification/allCertification
	@GetMapping("/allCertificates")
	public List<Certification> viewAllcertifications(){
		return certificationService.viewAllCertifications();
	}
	
	//http://localhost:8089/Certification/updateCertification
	@PutMapping("/updateCertificate")
	public Certification updateCertification(@RequestBody Certification certification) {
		return certificationService.updateCertification(certification);
	}
	
	//http://localhost:8089/Certification/deleteCertification
	@DeleteMapping("/deleteCertification")
	public String deleteCertification(@RequestBody Certification certification)  {
		return certificationService.deleteCertification(certification);
	}
	
	
}


