package com.weikun.single;

public class TestSingle1 {
	public static void main(String[] args) {
		Single1 sin=Single1.getInstance();
		
		System.out.println(sin);
		
		Single1 sin1=Single1.getInstance();
		System.out.println(sin1);
	}
}
