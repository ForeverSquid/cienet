package com.weikun.E;

import java.util.Date;

public class E {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.ensureCapacity(400);
		sb.append("A");
		sb.append("жа");//100 Integer
		sb.append("C");
		sb.append("BEFGHIGKLMNOPQ");
		System.out.println(sb.capacity());
		//System.out.println(sb.charAt(3));
		//sb.delete(1, 3);
		System.out.println(sb.lastIndexOf("B"));
		
		sb.reverse();
		String b1=sb.substring(2, 4);
		
		System.out.println(sb.toString());
		System.out.println(b1);
		
		
		StringBuilder sb1=new StringBuilder();
		
		
		Integer i=100;
		int i0=100;
		int q=i;
		int q1=Integer.parseInt("200");
		
		int p=i.parseInt("200");
		
		int i1=200;
		String s=String.valueOf(100);
		
				
		Integer i2=300;
		
		System.out.println(i-100);
		
	}
}
