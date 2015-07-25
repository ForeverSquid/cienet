package com.weikun.observer;

import java.util.ArrayList;

public abstract class Subject {
	
	private ArrayList<Observer> list=new ArrayList<Observer>();
	public void attach(Observer observer){//增加观察者
		
		list.add(observer);
		
	}
	public void dttach(Observer observer){//去除观察者
		
		list.remove(observer);
		
	}
	public void notifyO(){
		for(Observer o :list){
			o.update();
		}
	}
}
