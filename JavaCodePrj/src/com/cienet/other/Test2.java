package com.cienet.other;

public class Test2{      
	public Person2 methodOne(int i)	{
		if (i==1) {
			return new Student2();
		}
		else  {
			return new Teacher2();
		}
	}
	public static void main(String[] args){
		Test2 t = new Test2();
		Person2  p = t.methodOne(2);
		p.sleeping();
		p.eating();
	}
}