package com.weikun.M;

public class D extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) {		
		for(int i=0;i<100;i++){
			if(i==20){				
				D d=new D();				
				d.start();
				try {
					d.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Interrupt sleep wait join				
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
		
	}
}
