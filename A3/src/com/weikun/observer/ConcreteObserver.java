package com.weikun.observer;


public class ConcreteObserver extends Observer {
	private String name;//�۲�������
	private ConcreteSubject subject;
	public ConcreteObserver(ConcreteSubject subject,String name){
		this.subject=subject;
		this.name=name;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String state=this.subject.getSubjectState();
		System.out.println("�ҽУ�"+name+",���ⷢ���˸ı䣺"+state);
		
	}
}
