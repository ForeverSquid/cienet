package com.weikun.B;

public class D {
	public  static final String COUNTRY="CHINESE";
	public D(){
		
	}
	public static int age=100;//类属性，类成员
	public int old=200;
	
	public  void ok(){//类方法
		age=200;
	}
	
	public static void main(String[] args) {
		//new D().age=200;
		D.age=200;
		//D.COUNTRY="";
	}
	
}
