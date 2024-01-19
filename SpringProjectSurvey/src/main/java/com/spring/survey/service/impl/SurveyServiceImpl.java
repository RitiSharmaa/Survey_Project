package com.spring.survey.service.impl;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.survey.entities.Survey;
import com.spring.survey.exceptions.ResourceNotFoundException;
import com.spring.survey.payloads.SurveyDto;
import com.spring.survey.repositories.SurveyRepo;
import com.spring.survey.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService{
	
	@Autowired
	private SurveyRepo surveyRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public SurveyDto createSurvey(SurveyDto surveyDto) {
		Survey survey = this.dtoToSurvey(surveyDto);
		Survey savedSurvey = this.surveyRepo.save(survey);
		return this.surveyToDto(savedSurvey);
	}

	@Override
	public SurveyDto getSurveyById(Integer surveyId) {
		Survey survey = this.surveyRepo.findById(surveyId).orElseThrow(()->new ResourceNotFoundException("Survey","surveyId",surveyId));
		return this.surveyToDto(survey);
	}
	
	private Survey dtoToSurvey(SurveyDto surveyDto) {
		Survey survey = this.modelMapper.map(surveyDto,Survey.class);
		return survey;
		
	}
	private SurveyDto surveyToDto(Survey survey) {
		SurveyDto surveyDto = this.modelMapper.map(survey,SurveyDto.class);
		return surveyDto;
	}

}
