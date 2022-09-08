package com.example.springdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rollno;
	private String student_name;
	private String sclass;
	private float per;

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", student_name=" + student_name + ", sclass=" + sclass + ", per=" + per
				+ "]";
	}

	public Student(String student_name, String sclass, float per) {
		super();
		this.student_name = student_name;
		this.sclass = sclass;
		this.per = per;
	}

	public Student() {
		super(); //

	}

}
