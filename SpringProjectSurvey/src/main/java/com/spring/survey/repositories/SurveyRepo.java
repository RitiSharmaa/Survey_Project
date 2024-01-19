package com.spring.survey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.survey.entities.Survey;

public interface SurveyRepo extends JpaRepository<Survey, Integer>{

}
