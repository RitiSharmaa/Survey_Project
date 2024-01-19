package com.spring.survey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.survey.entities.User;


public interface UserRepo extends JpaRepository<User,Integer>{

}
