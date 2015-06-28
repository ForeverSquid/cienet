package com.weikun.D;

public class A extends A0{
	public void go(){
		System.out.println("A--GO");
	}
	public void plan(){
		System.out.println("A--plan");
	}
	public static void main(String[] args) {
		
		A0 a1=new A();//虚方法调用,多态
		//a1.go();
		((A)a1).plan();
	}
	
}
class A0{
	public void go(){
		System.out.println("A0--GO");
	}
}