package com.fuentes.restaurant.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuentes.restaurant.Utils;
import com.fuentes.restaurant.VO.Employee;
import com.fuentes.restaurant.repository.EmployeeRepository;
import com.fuentes.restaurant.repository.PersonRepository;
import com.fuentes.restaurant.repository.UserRepository;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
	
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private UserRepository userRepository;
	
	
	@PostMapping("/register")
	public Map<String, Object> create(@RequestBody Employee employye) {

		try {
			
			return Utils.msg(true, "nitido");
			
			
			/*
			if (Utils.validarCorreo(user.getUser_email())) {
				if (Utils.validarContra(user.getUser_password())) {
					
					Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
			        String hash = argon2.hash(1, 1024, 1, user.getUser_password());
			        user.setUser_password(hash);
					userRepository.save(user);
					Bill cuenta = new Bill();
					cuenta.setUser_id(user);
					cuenta.setBill_number(Long.valueOf(Utils.numeroCuenta()));
					cuenta.setBill_amount(1000000);
					billRepository.save(cuenta);

				} else {
					return Utils.msg(false, "La contraseña no es valida.");
				}
			} else {
				return Utils.msg(false, "El correo no es valido.");
			}
			return Utils.msg(true, "Registro exitoso");
			*/
		} catch (Exception e) {
			return Utils.msg(false, "Error al registrar el usuario");
		}

	}

}
