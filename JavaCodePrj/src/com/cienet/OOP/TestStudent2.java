package com.cienet.OOP;

public class TestStudent2 {

	public static void main(String[] args){
		Student2 s1;
		s1 = new Student2("Lisa","FMale",1,18);
		System.out.println("名字: " + s1.getName());
		Student2 s2;
		s2 = s1;	
		s1.setName("Sophie");
		System.out.println("名字："+s2.getName());
		
	}
}
