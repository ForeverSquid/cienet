package com.weikun.P;

public class A {
	public static void main(String[] args) {
		ThreadGroup tg1=new ThreadGroup("A1");
		
		ThreadGroup tg2=new ThreadGroup("A2");
		
		Thread t1=new Thread(tg1,"t1");
		t1.start();
		Thread t2=new Thread(tg1,"t2");
		t2.start();
		
		//System.out.println(tg1.activeCount());
		Thread[] ts=new Thread[tg1.activeCount()];
		System.out.println(tg1.enumerate(ts));
		System.out.println(ts[0].isAlive());
		
	}
}
