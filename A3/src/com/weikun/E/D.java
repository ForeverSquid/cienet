package com.weikun.E;

import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.net.*;
public class D {
	public static void main(String[] args) {
		/*Random r=new Random();
		
		for(int i=0;i<6;i++){
			System.out.println((char)(r.nextInt(9999)+30000));//a z
		}*/
//		try {
//			new String("我爱你".getBytes("ISO8859-1"),"UTF-8");
//			
//			System.out.println(URLEncoder.encode("我爱你"));
//			System.out.println(URLDecoder.decode("%CE%D2%B0%AE%C4%E3"));
//			
//			
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	/*	String s="ABC";
		String s2="ABB";
		
		String s1=new String("ABC");//强制开堆，
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s==s2);
		
		System.out.println(s.compareTo(s2));*/
		String s="ABCDABCDEFGH";
		//System.out.println(s.startsWith("1.e"));
		//System.out.println(s.endsWith("lld.1"));
		
		//System.out.println(s.indexOf("CD",4));
		
		
		System.out.println(s.lastIndexOf("E",5));
		
		System.out.println(" 北 京 ".trim());
		System.out.println("ABC".toLowerCase());
		
		//System.out.println("ABCDEF".substring(1, 3).substring(1).substring(beginIndex));
		
		String [] ss="A%B%C#E".split("%");
		for(String s4 :ss){
			String [] ss1=s4.split("#");
			for(String s5 :ss1){
				System.out.println(s5);				
			}			
		}
	}
}
