package com.cienet.OOP;

public class StringByValueRef {
	public void modify(String s2)	{
		s2="456";		
		System.out.println("s2：" + s2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="123";
		System.out.println("s1" + s1);
		StringByValueRef c = new StringByValueRef();
		
		c.modify(s1);
		
		System.out.println("main：" + s1);
	
	}


}
