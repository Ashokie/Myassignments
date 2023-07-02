package org.student;

import org.college.College;

public class Student extends College {
	public void studentName() {
		System.out.println("Ashok");
	}

	public void studentDept() {
		System.out.println("BME");
	}

	public void studentId() {
		System.out.println("21012121003");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();

	}

}
