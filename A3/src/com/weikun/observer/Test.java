package com.weikun.observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject subject =new ConcreteSubject ();
		
		subject.attach(new ConcreteObserver(subject, "A"));
		subject.attach(new ConcreteObserver(subject, "B"));
		subject.attach(new ConcreteObserver(subject, "C"));
	
		subject.setSubjectState("Ready");
		
		subject.notifyO();
		
	}

}
