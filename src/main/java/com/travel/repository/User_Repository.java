package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.model.User;


@Repository
public interface User_Repository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
}
