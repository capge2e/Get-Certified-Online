package com.demo.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Training {
	
	    @Id
	    @GeneratedValue
	    private String trainingId;
	    private String trainingName;
	    private int duration;
	    
	   
	    public Training() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    public Training(String trainingId, String trainingName,  int duration) {
			super();
			this.trainingId = trainingId;
			this.trainingName = trainingName;
			this.duration = duration;
		}
	    


	public String getTrainingId() {
			return trainingId;
		}

		public void setTrainingId(String trainingId) {
			this.trainingId = trainingId;
		}

		public String getTrainingName() {
			return trainingName;
		}

		public void setTrainingName(String trainingName) {
			this.trainingName = trainingName;
		}


		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}


	@Override
		public String toString() {
			return "Training [trainingId=" + trainingId + ", trainingName=" + trainingName + ", duration=" + duration
					+ "]";
		}

	// Enum for Cost Options
    public enum CostOption {
        PAID, FREE
    }

    // Enum for Training Status
    public enum TrainingStatus {
        UPCOMING, IN_PROGRESS, COMPLETED
    }

}
