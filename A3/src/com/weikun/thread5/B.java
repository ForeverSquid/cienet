package com.weikun.thread5;
import java.io.IOException;
import java.util.concurrent.*;

public class B { //用于管理线程和提供线程服务的类

	public static void main(String[] args) throws IOException, InterruptedException {
		// 创建一个固定大小的线程池,有3个线程
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			System.out.println("创建线程" + i);
			Runnable run = new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+"启动线程");
				}
			};
			// 在未来某个时间执行给定的命令
			service.execute(run);
		}
		//用于关闭启动线程，如果不调用该语句，jvm不会关闭。
		service.shutdown();
		// 等待子线程结束，再继续执行下面的代码
		//用于等待子线程结束，再继续执行下面的代码。该例中我设置一直等着子线程结束。
		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		System.out.println("all thread complete");
	}


}
