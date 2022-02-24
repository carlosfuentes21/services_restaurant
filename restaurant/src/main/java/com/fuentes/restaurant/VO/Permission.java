package com.fuentes.restaurant.VO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="permission")
public class Permission implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	private int id_permission;
	
	@ManyToMany(mappedBy = "permission", cascade = CascadeType.PERSIST)
    private List<Role> role;
	
	private String name_permission;

	public int getId_permission() {
		return id_permission;
	}

	public void setId_permission(int id_permission) {
		this.id_permission = id_permission;
	}

	public List<Role> getRoles() {
		return role;
	}

	public void setRoles(List<Role> role) {
		this.role = role;
	}

	public String getName_permission() {
		return name_permission;
	}

	public void setName_permission(String name_permission) {
		this.name_permission = name_permission;
	}
	
	
	
	
	
}
