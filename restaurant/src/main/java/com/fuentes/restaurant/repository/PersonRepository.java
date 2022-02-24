package com.fuentes.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fuentes.restaurant.VO.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
