package com.demo.main.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.main.entity.Exam;
import com.demo.main.repository.ExamRepository;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@Service
public class ExamServiceImpl implements ExamService{
 
	@Autowired
	ExamRepository examRepository;

	@Override
	public List<Exam> viewAllExams() {
		// TODO Auto-generated method stub
		List<Exam> allExam = examRepository.findAll(); // Note : same as save
		return allExam;
		
	}

	@Override
	public Exam updateExam(Exam exam) {
		// TODO Auto-generated method stub
		return examRepository.save(exam);
	}

	@Override
	public String deleteExam(Exam exam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByeId(int eId) throws Exception {
		// TODO Auto-generated method stub
		examRepository.deleteById(eId);
	}

	@Override
	public Exam addExam(Exam exams) throws Exception {
		// TODO Auto-generated method stub
		return examRepository.save(exams);
	}

	

	@Override
	public Exam getExamByeId(int eId) throws Exception {
		// TODO Auto-generated method stub
		 List<Exam> Exams = new ArrayList<>();
		for (Exam exam : Exams) {
            if (exam.geteId() == eId) {
                return exam;
            }
        }

        throw new Exception("Exam not found with eId: " + eId);
    }
	

	@Override
	public List<Exam> getExamByDuration(int duration) throws Exception {
		// TODO Auto-generated method stub
		if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be a positive integer.");
        }
        
        List<Exam> matchingExams = new ArrayList<>();

        for (Exam exam : matchingExams) {
            if (exam.getDuration() == duration) {
                matchingExams.add(exam);
            }
        }

        return matchingExams;
   
	}

	
	public Exam getExamByEndTime(String eName, String endTime) {
		
		List<Exam> Exams = new ArrayList<>();
        for (Exam exam : Exams) {
            if (exam.geteName().equals(eName) && exam.getEndTime().equals(endTime)) {
                return exam;
            }
        }
        return null; 
	}
	
	@Override
	public List<Exam> findExamWithSorting(String eName) {
		// TODO Auto-generated method stub
		List<Exam> matchingExams = new ArrayList<>();

        // Find exams with matching name
        for (Exam exam :matchingExams) {
            if (exam.geteName().equals(eName)) {
                matchingExams.add(exam);
            }
        }

        // Sort exams based on start time
        Collections.sort(matchingExams, new Comparator<Exam>() {
            @Override
            public int compare(Exam exam1, Exam exam2) {
                return exam1.getStartTime().compareTo(exam2.getStartTime());
            }
        });

        return matchingExams;
	}

	@Override
	public List<Exam> sortingBasedOnstartTime() {
		 List<Exam> sortedExams = new ArrayList<>();

	        Collections.sort(sortedExams, new Comparator<Exam>() {
	            @Override
	            public int compare(Exam exam1, Exam exam2) {
	                return exam1.getStartTime().compareTo(exam2.getStartTime());
	            }
	        });

	        return sortedExams;
	}
	

	@Override
	public List<Exam> sortingBasedOnstartDate() {
	        List<Exam> sortedExams = new ArrayList<>();

	        Collections.sort(sortedExams, new Comparator<Exam>() {
	            @Override
	            public int compare(Exam exam1, Exam exam2) {
	                return exam1.getStartTime().compareTo(exam2.getStartTime());
	            }
	        });

	        return sortedExams;
	    }
	
}
		

