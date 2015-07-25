package com.weikun.G;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
//		String s="c3131t";//两位小数 a-d 0-9
//		System.out.println(s.matches("c(a|31|@)+t"));
//		
		
		
		//String s1="23010319760119061X";
		//System.out.println(s1.matches("^[1-9](\\d{16}|\\d{13})[0-9xX]$"));
		
		Pattern p=Pattern.compile("^[1-9](\\d{16}|\\d{13})[0-9xX]$");//编译
		Matcher m=p.matcher("23010319760119061X");
		System.out.println(m.matches());
		
		
		
//		String str="HelloJava";
//		
//		System.out.println(str.replaceFirst("\\w??", "■"));
//		
//		System.out.println(str.replaceFirst("\\w+?", "■"));
	}
}
