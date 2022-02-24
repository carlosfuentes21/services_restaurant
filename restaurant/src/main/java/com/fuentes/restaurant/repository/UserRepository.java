package com.fuentes.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fuentes.restaurant.VO.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	
}
