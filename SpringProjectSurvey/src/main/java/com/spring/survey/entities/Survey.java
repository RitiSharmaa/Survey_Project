package com.spring.survey.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="survey")
public class Survey {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int surveyId;
	private String title;
	@Column(length=100)
	private String question;
	private String targetGender;
	private int cordinatorId;
	
	public int getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuestions() {
		return question;
	}
	public void setQuestions(String questions) {
		this.question = questions;
	}
	public String getTargetGender() {
		return targetGender;
	}
	public void setTargetGender(String targetGender) {
		this.targetGender = targetGender;
	}
	public int getCordinatorId() {
		return cordinatorId;
	}
	public void setCordinatorId(int cordinatorId) {
		this.cordinatorId = cordinatorId;
	}
	

}
