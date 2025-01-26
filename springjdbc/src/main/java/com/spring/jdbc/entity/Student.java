package com.spring.jdbc.entity;

import java.time.LocalDate;

public class Student {

	private Long id;

	private String firstName;

	private String lastName;

	private String email;

	private LocalDate dateOfBirth;

	private LocalDate enrollmentDate;

	// Default constructor (needed by JPA)
	public Student() {
	}

	public Student(String firstName, String lastName, String email, LocalDate dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	// Parameterized constructor
	public Student(String firstName, String lastName, String email, LocalDate dateOfBirth, LocalDate enrollmentDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.enrollmentDate = enrollmentDate;
	}

	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public LocalDate getEnrollmentDate() {
		return this.enrollmentDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	// Getters and Setters
	public Long getId() {
		return this.id;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName
				+ '\'' + ", email='" + this.email + '\'' + ", dateOfBirth=" + this.dateOfBirth + ", enrollmentDate="
				+ this.enrollmentDate + '}';
	}
}
