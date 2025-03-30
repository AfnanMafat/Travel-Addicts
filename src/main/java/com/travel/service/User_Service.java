package com.travel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.model.User;
import com.travel.repository.User_Repository;

@Service
public class User_Service {

	
	@Autowired
	User_Repository user_Repository;
	
	public void Add_User(User user) {
		user_Repository.save(user);
	}
	
	public User Validate_User(String email) {
		return user_Repository.findByEmail(email);
	}
}
