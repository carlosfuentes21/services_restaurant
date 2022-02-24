package com.fuentes.restaurant.VO;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="role")
public class Role implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	private int id_role;
	
	@OneToOne(mappedBy="role")
	private Employee employee;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
	        name = "role_has_permission",
	        joinColumns = @JoinColumn(name = "FK_ROLE", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="FK_PERMISSION", nullable = false)
	    )
    private List<Permission> permission;
	
	public List<Permission> getPermission() {
		return permission;
	}

	public void setPermission(List<Permission> permission) {
		this.permission = permission;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String name_role;

	public int getId_role() {
		return id_role;
	}

	public void setId_role(int id_role) {
		this.id_role = id_role;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getName_role() {
		return name_role;
	}

	public void setName_role(String name_role) {
		this.name_role = name_role;
	}
	
}
