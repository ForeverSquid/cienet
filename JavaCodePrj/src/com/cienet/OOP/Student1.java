package com.cienet.OOP;

public class Student1 {
	private int age;

	public Student1() {
	}
	public void setAge(int _age){
		if (_age>100){
			age = 100;
		}
		else if (_age<10){
			age = 10;
		}
		else{
			age = _age;
		}		
	}
	public int getAge(){
		return age;
	}

}
