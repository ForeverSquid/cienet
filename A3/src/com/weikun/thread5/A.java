package com.weikun.thread5;

public class A implements Runnable{	
	public static void main(String[] args) {
		A tg = new A();
		tg.func();
	}
	public void func() {

		// create a parent ThreadGroup
		ThreadGroup pGroup = new ThreadGroup("�����߳���");

		// create a child ThreadGroup for parent ThreadGroup
		ThreadGroup cGroup = new ThreadGroup(pGroup, "�����߳���");

		// create a thread
		Thread t1 = new Thread(pGroup, this);//�����̣߳����븸�߳���
		System.out.println("Starting " + t1.getName() + "...");
		t1.start();

		// create another thread
		Thread t2 = new Thread(cGroup, this);//�����̣߳�������߳���
		System.out.println("Starting " + t2.getName() + "...");
		t2.start();

		// returns the number of threads put into the array
		//�����߳��������뵽�߳���
		Thread[] list = new Thread[pGroup.activeCount()];
		int count = pGroup.enumerate(list);//�õ���ȷ���Ļ�߳�����
		for (int i = 0; i < count; i++) {//����ÿ���߳�
			System.out.println("�߳��� " + list[i].getName() + " found");
		}

		

	}

	// implements run()
	public void run() {

		for(int i = 0; i < 1000; i++) {
			i++;
		}
		System.out.println(Thread.currentThread().getName() + 
				" finished executing.");
	}

}

