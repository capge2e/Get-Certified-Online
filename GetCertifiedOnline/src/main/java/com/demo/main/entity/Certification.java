package com.demo.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Certification {
	@Id
	@GeneratedValue
	private int cId;
	private String cName;
	private int duration;
	private int cost;
	
	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certification(int cId, String cName, int duration, int cost) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.duration = duration;
		this.cost = cost;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Certification [cId=" + cId + ", cName=" + cName + ", duration=" + duration + ", cost=" + cost + "]";
	}
	
}