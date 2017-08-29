package com.cienet.other;

import java.util.Random;

public class M { 
	public static void main(String[] args) { 
		Test(); 
	} 
	public static void Test() { 
		System.out.println("--------------test()--------------"); 
		long r1 = System.currentTimeMillis(); 
		double r2 = Math.random(); 
		int r3 = new Random().nextInt(); 
		System.out.println("r1 = " + r1); 
		System.out.println("r2 = " + r2); 
		System.out.println("r3 = " + r3); 
	} 
} 
