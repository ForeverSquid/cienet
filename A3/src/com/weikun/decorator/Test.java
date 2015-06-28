package com.weikun.decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl a=new AmericanGirl();
		System.out.println(a.getPretty());
		
		Science s=new Science(a);
		System.out.println(s.getPretty());
		
		Art b=new Art(s);
		System.out.println(b.getPretty());
	}

}
