package com.emrulrony.model;
//POJO=Plain Old Java Object
public class StudentModel {
	private int studentId;
	private String studentName;
	
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "StudentModel [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	
}
