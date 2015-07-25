package com.weikun.H;

public class Test {
	public static void main(String[] args) {
		int old=100;
		
		if(old<20){
			try {
				throw new MyException1();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);//adult
			}
			
		}
		if(old>60){
			
			try {
				throw new MyException2(old);
				
			} catch (MyException2 e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
}
