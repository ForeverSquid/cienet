package com.cienet.other;

public class Test{
	
	public void methodOne(Person p)	{  
		
		p.sleeping();
	}
	
	
	public static void main(String[] args)	{
		Test test = new Test();
		Person p = new Person();
		Teacher t = new Teacher();
		
		test.methodOne(t);
	}
}