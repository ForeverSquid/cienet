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
		e.setDaemon(true);//�ػ�
		e.setName("�ػ�");
		e.start();
		
		E1 e1=new E1();
		e1.setDaemon(false);//�û��߳�
		e1.setName("�û�");
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
