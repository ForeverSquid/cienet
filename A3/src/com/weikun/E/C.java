package com.weikun.E;

import java.math.BigDecimal;

public class C {
	public static void main(String[] args) {
		/*System.out.println(Math.ceil(1.2));//比这个数大的最小double数
		
		System.out.println(Math.floor(1.2));//比这个数晓得最大double数
		
		System.out.println(Math.pow(2, 1000));*/
		System.out.println((int)(Math.random()*9+2));
		
		/*for(int i=0;i<20;i++){
			System.out.println((int)(Math.random()*9+2));
			System.out.println((char)(Math.random()*26+65));//A  -Z
		}*/
		
		//System.out.println(Math.round(9.79));
		
		BigDecimal big=new BigDecimal(6.745165f);
		
		System.out.println(big.setScale(-1, BigDecimal.ROUND_HALF_UP));
		
		System.out.println(Math.sqrt(-4));
	
		
	}
}
