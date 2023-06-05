package com.demo.main.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.main.entity.Certification;
@Service
public interface CertificationService {

	static Certification registerCertification(Certification certification) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Certification> getAllCertifications();

	public Certification updateCertification(Certification certification);

	public String deleteCertification(Certification certification);
    
	public List<Certification> sortingBasedOnCost();

	public Certification addCertification(Certification certification);

	public List<Certification> viewAllCertifications();
	
	
    
}
