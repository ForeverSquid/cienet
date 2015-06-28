package com.weikun.M;

public class B implements Runnable {
	public static void main(String[] args) {
		B b=new B();
		Thread t=new Thread(b);
		
		t.start();		
		
		B b1=new B();
		Thread t1=new Thread(b1);
		
		t1.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			
				
				
				try {
					Thread.currentThread().yield();
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
