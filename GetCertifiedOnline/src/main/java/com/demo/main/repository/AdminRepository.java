package com.demo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.main.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	
		
		@Query("from Admin a where a.id=:id")
		public Admin getAdminByaId(@Param(value="id")Integer aid );

		
		@Query("from Admin a where a.email=:email and a.password=:password")
		public Admin findAdminByEmailPassword(@Param(value="email") String email, @Param(value="password")String password);
		
	}

