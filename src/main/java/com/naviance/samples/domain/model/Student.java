package com.naviance.samples.domain.model;

public class Student {

	private String name = null;
	private String studentId = null;
	private double gpa = 0.0;

	public Student(String studentId, String name) {
		this.name = name;
		this.studentId = studentId;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public String getStudentId() {
		return studentId;
	}

	public double getGpa() {
		return gpa;
	}

}
