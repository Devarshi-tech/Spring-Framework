package com.spring.demo.SpringFramework;

public class Student {
	
	private String studentName;
	private int studentId;
	private String address;
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", address=" + address + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int studentId, String address) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
