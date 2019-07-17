package com.ahsan.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class DepartmentsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "dname")
	private String name;
	@Column(name = "phone")
	private String phone;
	
	@OneToMany(mappedBy = "departments", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<StudentsEntity> student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	

	public List<StudentsEntity> getStudent() {
		return student;
	}

	public void setStudent(List<StudentsEntity> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "DepartmentsEntity [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
	
	

}
