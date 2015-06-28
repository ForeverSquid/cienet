package com.weikun.M;

public class A extends Thread {
	public static void main(String[] args) {
		A a=new A();
		a.start();
		
		A a1=new A();
		a1.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
