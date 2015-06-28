package com.weikun.M;

public class E extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) {
		E e=new E();
		e.setDaemon(true);//守护
		e.setName("守护");
		e.start();
		
		E1 e1=new E1();
		e1.setDaemon(false);//用户线程
		e1.setName("用户");
		e1.start();
	}
}
class E1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			try {
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
}
