package com.weikun.observer;


public class ConcreteObserver extends Observer {
	private String name;//观察者名字
	private ConcreteSubject subject;
	public ConcreteObserver(ConcreteSubject subject,String name){
		this.subject=subject;
		this.name=name;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String state=this.subject.getSubjectState();
		System.out.println("我叫："+name+",主题发生了改变："+state);
		
	}
}
