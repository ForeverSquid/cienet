package com.weikun.thread5;
import java.io.IOException;
import java.util.concurrent.*;

public class B { //���ڹ����̺߳��ṩ�̷߳������

	public static void main(String[] args) throws IOException, InterruptedException {
		// ����һ���̶���С���̳߳�,��3���߳�
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			System.out.println("�����߳�" + i);
			Runnable run = new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName()+"�����߳�");
				}
			};
			// ��δ��ĳ��ʱ��ִ�и���������
			service.execute(run);
		}
		//���ڹر������̣߳���������ø���䣬jvm����رա�
		service.shutdown();
		// �ȴ����߳̽������ټ���ִ������Ĵ���
		//���ڵȴ����߳̽������ټ���ִ������Ĵ��롣������������һֱ�������߳̽�����
		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		System.out.println("all thread complete");
	}


}
