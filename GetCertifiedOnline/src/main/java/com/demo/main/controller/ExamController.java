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

import com.demo.main.entity.Exam;
import com.demo.main.service.ExamService;

@RestController
@RequestMapping("/Exam")
public class ExamController {
	
		@Autowired
		ExamService examService;
		
		
		@GetMapping("/")
		public String defaultMessage() {
			return "Welcome to Exam Page";
		}
		//http://localhost:8089/Exam/registerExam
		@PostMapping("/registerExam")
		public Exam addExam(@RequestBody Exam exam)  {
			try {
				return examService.addExam(exam);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return exam;
		}
		//http://localhost:8089/Exam/allExam
		@GetMapping("/allExam")
		public List<Exam> viewAllExam(){
			return examService.viewAllExams();
		}
		
		//http://localhost:8089/Exam/updateExam
		@PutMapping("/updateExam")
		public Exam updateExam(@RequestBody Exam exam) {
			return examService.updateExam(exam);
		}
		
		//http://localhost:8089/Exam/deleteExam
		@DeleteMapping("/deleteExam")
		public String deleteExam(@RequestBody Exam exam)  {
			return examService.deleteExam(exam);
		}
		
		
	}

