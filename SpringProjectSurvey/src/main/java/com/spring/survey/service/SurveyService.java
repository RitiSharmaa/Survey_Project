package com.spring.survey.service;

import com.spring.survey.payloads.SurveyDto;

public interface SurveyService {
	
	SurveyDto createSurvey(SurveyDto survey);
	SurveyDto getSurveyById(Integer surveyId);
	

}
