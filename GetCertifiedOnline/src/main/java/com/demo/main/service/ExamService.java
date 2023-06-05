package com.demo.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.main.entity.Exam;

@Service
public interface ExamService {


	public Exam updateExam(Exam exam);

	public String deleteExam(Exam exam);

	public Exam addExam(Exam exam) throws Exception;

	public Exam getExamByeId(int eId) throws Exception;

	public List<Exam> getExamByDuration(int duration) throws Exception;


	public List<Exam> findExamWithSorting(String eName);

	public List<Exam> sortingBasedOnstartTime();


	List<Exam> sortingBasedOnstartDate();

	Exam getExamByEndTime(String eName, String endTime);

	void deleteByeId(int eId) throws Exception;

	List<Exam> viewAllExams();
	
	
}
