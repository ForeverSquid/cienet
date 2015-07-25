package com.weikun.observer;

import java.util.ArrayList;

public abstract class Subject {
	
	private ArrayList<Observer> list=new ArrayList<Observer>();
	public void attach(Observer observer){//���ӹ۲���
		
		list.add(observer);
		
	}
	public void dttach(Observer observer){//ȥ���۲���
		
		list.remove(observer);
		
	}
	public void notifyO(){
		for(Observer o :list){
			o.update();
		}
	}
}
