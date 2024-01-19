package com.spring.survey.payloads;

public class SurveyDto {
	
	private int surveyId;
	private String title;
	private String questions;
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
		return questions;
	}
	public void setQuestions(String questions) {
		this.questions = questions;
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
