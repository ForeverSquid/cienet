package com.weikun.H;

import java.io.IOException;

public class A {
	public static void main(String[] args) {		
		try {
			//int a=Integer.parseInt(args[0]);
			//int b=Integer.parseInt(args[1]);
			int a=10;
			int b=0;
			System.out.println(a/b);			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			
			//System.out.println("请联系管理员！"+e.getMessage());
		}finally{
		
			System.out.println("ok");
		}
	}
}
