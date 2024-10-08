package com.hibernate.HibernateTutorial;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int studentId;
	
	private String name;
	private String city;
	private Certificate certificate;
	public Student() {
		
	}
	
	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", city=" + city + ", certificate=" + certificate
				+ "]";
	}
	
	

}
