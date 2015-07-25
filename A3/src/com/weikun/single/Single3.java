package com.weikun.single;

public class Single3 {
	private Single3(){
		
	}
	private volatile static Single3 single3;
	
	public static Single3 getInstance(){
		
		if(single3==null){
			synchronized(Single3.class){
				single3=new  Single3();
				
			}
		}
		return single3;
	}
}
