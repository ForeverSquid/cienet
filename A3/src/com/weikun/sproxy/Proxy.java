package com.weikun.sproxy;

public class Proxy implements Subject{
	private Subject subject;
	public Proxy(Subject subject){
		this.subject=subject;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Welcome!");
		this.subject.print();
	}
	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}

}
