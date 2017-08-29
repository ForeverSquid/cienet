package com.cienet.OOP;

public class Student2 {

	public Student2(String student_name,
			String student_sex,int student_grade,
			int student_age){

		name = student_name;
		sex = student_sex;
		grade = student_grade;
		age = student_age;
	}

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name1) {
		name = name1;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex1) {
		sex = sex1;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade1) {
		grade = grade1;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age1) {
		age = age1;
	}
	private String sex;
	private int grade;
	private int age;

}
