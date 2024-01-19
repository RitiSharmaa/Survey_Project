package com.spring.survey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.survey.payloads.SurveyDto;
import com.spring.survey.service.SurveyService;

@RestController
@RequestMapping("/api/survey")
public class SurveyController {
	@Autowired
	private SurveyService surveyService;
	
	@PostMapping("/")
	public ResponseEntity<SurveyDto> createSurvey(@RequestBody SurveyDto surveyDto){
		
		SurveyDto createdSurveyDto = this.surveyService.createSurvey(surveyDto);
		return new ResponseEntity<>(createdSurveyDto,HttpStatus.CREATED);
		
	}
	
}
