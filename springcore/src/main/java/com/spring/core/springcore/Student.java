package com.spring.core.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public String getStudentAddress() {
		return this.studentAddress;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + this.studentId + ", studentName=" + this.studentName + ", studentAddress="
				+ this.studentAddress + "]";
	}

}
