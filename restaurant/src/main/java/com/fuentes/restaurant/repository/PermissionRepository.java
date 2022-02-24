package com.fuentes.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fuentes.restaurant.VO.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Integer>{
	
}
