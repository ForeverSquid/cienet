package com.weikun.D;

public class B {
	
	public void ok(B0 b0){
		b0.go();
	}
	
	public static void main(String[] args) {
		
		new B().ok(new B2());
		new B().ok(new B1());
	}
	
}
class B2 extends B0{
	public void go(){
		System.out.println("B2=go");
	}
}
class B1 extends B0{
	public void go(){
		System.out.println("B1=go");
	}
}
class B0{
	public void go(){
		
	}
	
}
