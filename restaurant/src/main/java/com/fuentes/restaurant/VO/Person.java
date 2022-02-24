package com.fuentes.restaurant.VO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	private int id_person;
	
	@OneToOne(mappedBy="person")
	private Employee employee;
	
	private String name_person;
	private String doc_person;
	private String name_last_person;
	private String direction_person;
	private String phone_person;
	private String email_person;
	private String gender_person;
	
	public int getId_person() {
		return id_person;
	}
	public void setId_person(int id_person) {
		this.id_person = id_person;
	}
	public String getName_person() {
		return name_person;
	}
	public void setName_person(String name_person) {
		this.name_person = name_person;
	}
	public String getDoc_person() {
		return doc_person;
	}
	public void setDoc_person(String doc_person) {
		this.doc_person = doc_person;
	}
	public String getName_last_person() {
		return name_last_person;
	}
	public void setName_last_person(String name_last_person) {
		this.name_last_person = name_last_person;
	}
	public String getDirection_person() {
		return direction_person;
	}
	public void setDirection_person(String direction_person) {
		this.direction_person = direction_person;
	}
	public String getPhone_person() {
		return phone_person;
	}
	public void setPhone_person(String phone_person) {
		this.phone_person = phone_person;
	}
	public String getEmail_person() {
		return email_person;
	}
	public void setEmail_person(String email_person) {
		this.email_person = email_person;
	}
	public String getGender_person() {
		return gender_person;
	}
	public void setGender_person(String gender_person) {
		this.gender_person = gender_person;
	}
	
}
