package com.fuentes.restaurant.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuentes.restaurant.Utils;
import com.fuentes.restaurant.VO.Permission;
import com.fuentes.restaurant.VO.Role;
import com.fuentes.restaurant.repository.PermissionRepository;
import com.fuentes.restaurant.repository.RoleRepository;

@RestController
@RequestMapping(path = "/role")
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private PermissionRepository permissionRepository;
	
	@PostMapping("/register")
	public Map<String, Object> create(@RequestBody Role role) {

		try {
			if(!role.getName_role().isEmpty()) {
				roleRepository.save(role);
			}else {
				return Utils.msg(false, "Registro fallido");
			}
			return Utils.msg(true, "Registro exitoso");
		} catch (Exception e) {
			return Utils.msg(false, "Error al registrar el rol");
		}

	}
	
	@PostMapping("/add_permissions")
	public Map<String, Object> addPermisions(@RequestHeader(name = "id_rol") int idRol, @RequestBody List<Permission> permissions) {

		try {
			Role role = roleRepository.findById(idRol).get();
			if(role != null) {
				role.setPermission(permissions);
				roleRepository.save(role);
				return Utils.msg(true, "Permisos asignados");
			}
			return Utils.msg(false, "El rol no fue encontrado");
		} catch (Exception e) {
			return Utils.msg(false, "Error al asignar permisos");
		}

	}

}
