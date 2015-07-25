package com.weikun.thread5;

public class A implements Runnable{	
	public static void main(String[] args) {
		A tg = new A();
		tg.func();
	}
	public void func() {

		// create a parent ThreadGroup
		ThreadGroup pGroup = new ThreadGroup("父亲线程组");

		// create a child ThreadGroup for parent ThreadGroup
		ThreadGroup cGroup = new ThreadGroup(pGroup, "儿子线程组");

		// create a thread
		Thread t1 = new Thread(pGroup, this);//创建线程，加入父线程组
		System.out.println("Starting " + t1.getName() + "...");
		t1.start();

		// create another thread
		Thread t2 = new Thread(cGroup, this);//创建线程，加入儿线程组
		System.out.println("Starting " + t2.getName() + "...");
		t2.start();

		// returns the number of threads put into the array
		//返回线程数量进入到线程组
		Thread[] list = new Thread[pGroup.activeCount()];
		int count = pGroup.enumerate(list);//得到不确定的活动线程数量
		for (int i = 0; i < count; i++) {//遍历每个线程
			System.out.println("线程组 " + list[i].getName() + " found");
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

