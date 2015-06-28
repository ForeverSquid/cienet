package com.weikun.thread5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;



public class C {
	public static void main(String[] args) {
		try {
			//���н�����£���������ִ�У�������ֻ��ʹ��һ���߳������С�
			//new C().testDemo();


			//����Ľ�����£����п��Է��֣�ÿ�ĸ�һ���������һ���������ĸ��̣߳�
			//ÿ��ÿ���̶߳���ִ�������������˳��λÿһ��������ĸ�����һ��
			//new C().testDemo2();
			
			
			new C().testDemo3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testDemo() throws Exception {
		//�����̣߳�����ʱ��(ͬһʱ��)����ֻ����һ���߳�
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new Runnable() {
			@Override
			public void run() {
				System.err.println("�߳�����������"+Thread.currentThread().getName());
			}
		});
		//ִ�����Σ�
		es.execute(new Runnable() {
			@Override
			public void run() {
				System.err.println("�ڶ���Ҳ������"+Thread.currentThread().getName());
			}
		});
		
		es.shutdown();
		// �ȴ����߳̽������ټ���ִ������Ĵ���
		//���ڵȴ����߳̽������ټ���ִ������Ĵ��롣������������һֱ�������߳̽�����
		es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		//Thread.sleep(1000 * 60 * 60);
	}
	private int j=0;//�Ƿ�ִ���߳�run�����Ŀ���
	public void testDemo2() throws Exception {
		//����һ����������̳߳�,�̳߳�Ϊ���޴󣬿����Զ������̻߳��գ���ִ�еڶ�������ʱ��һ�������Ѿ���ɣ��Ḵ��ִ�е�һ��������̣߳�
		//������ÿ���½��̡߳�
		ExecutorService es = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 10; i++) {
			final int a = i;//�ڲ���
			
			//ÿһ��execute��������������з���һ������
			es.execute(new Runnable() {//�ȷ���4���̣߳���ȥִ��run
				public void run() {
					
					while(j<80){		//4���̲߳�ͣ�ķ���ʹ��				
						try{
							System.err.println("����...."+a+">"
									+Thread.currentThread().getName());
							j++;
							Thread.sleep(1000);
							
						}catch(Exception e){
							e.printStackTrace();
						}
					}
					
				}
			});
		}
		es.shutdown();
		// �ȴ����߳̽������ټ���ִ������Ĵ���
		//���ڵȴ����߳̽������ټ���ִ������Ĵ��롣������������һֱ�������߳̽�����
		es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
	
	}
	public void testDemo3() throws Exception{
		//����һ���࣬���Ա����ã��������̣߳���������ӵ�з���ֵ
		//���ؽ�����ҿ����׳��쳣������ʵ���߶�����һ�������κβ����Ľ��� call �ķ����� 	
		
		//Executor �ṩ�˹�����ֹ�ķ�����
		//�Լ���Ϊ����һ�������첽����ִ��״�������� Future �ķ����� 
		ExecutorService es = Executors.newCachedThreadPool();//���������̳߳ض���
		List<Future<String>> result =new ArrayList<Future<String>>();//�Ž���õļ���
		for(int i=0;i<3;i++){
			//�ύһ������ֵ����������ִ�У�����һ����ʾ�����δ������� Future
			Future<String> f=es.submit(new MyCall(i));//�߳�ִ������Ժ����ͨ�����û�ȡ����ֵ
			result.add(f);
		}
		for(Future<String> f:result){
			System.out.println("����ֵ��"+f.get());//������ص�ֵ
		}
		es.shutdown();
		// �ȴ����߳̽������ټ���ִ������Ĵ���
		//���ڵȴ����߳̽������ټ���ִ������Ĵ��롣������������һֱ�������߳̽�����
		es.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		System.out.println("���....");
	}
}
//Callable �ӿ������� Runnable�����߶���Ϊ��Щ��ʵ�����ܱ���һ���߳�ִ�е�����Ƶġ�
//���� Runnable ���᷵�ؽ���������޷��׳����������쳣�� 
/*
 * Callable��Future������������˼�ģ�һ�����������һ���õ������

Callable�ӿ�������Runnable�������־Ϳ��Կ������ˣ�����Runnable���᷵�ؽ����
         �����޷��׳����ؽ�����쳣����Callable���ܸ�ǿ��һЩ�����߳�ִ�к�
        ���Է���ֵ���������ֵ���Ա�Future�õ���Ҳ����˵��Future�����õ��첽ִ������ķ���ֵ��
 * 
 */
class MyCall implements Callable<String>{
	private int seq;
	public MyCall(int seq){
		this.seq=seq;
	}
	//�׳��쳣������ӵ�з���ֵ
	public String call() throws Exception {
		System.out.println("ִ��"+seq+","+Thread.currentThread().getName());
		
		
		return "���"+seq;//���Ƿ���ֵ
	}
}
