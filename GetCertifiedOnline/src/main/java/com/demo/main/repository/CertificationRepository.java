package com.demo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.main.entity.Admin;
import com.demo.main.entity.Certification;
@Repository
public interface CertificationRepository extends JpaRepository<Certification, Integer> {
	
		
		
	}
