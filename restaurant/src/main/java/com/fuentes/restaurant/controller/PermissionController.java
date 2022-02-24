package com.fuentes.restaurant.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuentes.restaurant.Utils;
import com.fuentes.restaurant.VO.Permission;
import com.fuentes.restaurant.repository.PermissionRepository;

@RestController
@RequestMapping(path = "/permission")
public class PermissionController {

	@Autowired
	private PermissionRepository permissionRepository;
	
	@PostMapping("/register")
	public Map<String, Object> create(@RequestBody Permission permission) {

		try {
			if(!permission.getName_permission().isEmpty()) {
				permissionRepository.save(permission);
				
			}else {
				return Utils.msg(false, "Registro fallido");
			}
			return Utils.msg(true, "Registro exitoso");
		} catch (Exception e) {
			return Utils.msg(false, "Error al registrar el rol");
		}

	}
}
