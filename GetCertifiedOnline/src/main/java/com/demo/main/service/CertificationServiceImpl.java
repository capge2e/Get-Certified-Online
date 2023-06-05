package com.demo.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.entity.Certification;
import com.demo.main.repository.CertificationRepository;

@Service
public class CertificationServiceImpl implements CertificationService{
	@Autowired
	CertificationRepository certificationRepository;

	@Override
	public List<Certification> getAllCertifications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Certification updateCertification(Certification certification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCertification(Certification certification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certification> sortingBasedOnCost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Certification addCertification(Certification certification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Certification> viewAllCertifications() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}