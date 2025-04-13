package com.example.CRUD;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private Integer markobtained;
	@Column(nullable = false)
	private LocalDate admissiondate;

	public Student() {
	}

	public Student(String name, String email, Integer markobtained, LocalDate admissiondate) {
		this.name = name;
		this.email = email;
		this.markobtained = markobtained;
		this.admissiondate = admissiondate;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMarkobtained() {
		return markobtained;
	}

	public void setMarkobtained(Integer markobtained) {
		this.markobtained = markobtained;
	}

	public LocalDate getAdmissiondate() {
		return admissiondate;
	}

	public void setAdmissiondate(LocalDate admissiondate) {
		this.admissiondate = admissiondate;
	}
}