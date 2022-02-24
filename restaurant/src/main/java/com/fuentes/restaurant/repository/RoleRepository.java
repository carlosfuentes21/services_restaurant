package com.fuentes.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fuentes.restaurant.VO.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
}
