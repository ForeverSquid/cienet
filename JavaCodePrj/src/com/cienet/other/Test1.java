package com.cienet.other;

public class Test1{
	
	public static void main(String[] args)	{
		Person1 p = new Student1();
		p.sleeping();
		p.eating();
		p.talking();
		
		Student s = (Student)p;
		s.study();
		 
	}
}