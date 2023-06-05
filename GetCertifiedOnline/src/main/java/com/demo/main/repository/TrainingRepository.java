package com.demo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.entity.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Integer>{

}
