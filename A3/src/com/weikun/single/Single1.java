package com.weikun.single;

public class Single1 {
	private Single1(){//1构造器私有
		
	}
	
	private static Single1 me;//2
	
	public static Single1 getInstance(){
		if(me==null){//第一次
			me=new Single1();
			
		}
		return me;
	}
}	
