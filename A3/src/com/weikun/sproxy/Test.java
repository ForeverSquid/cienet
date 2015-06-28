package com.weikun.sproxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject rs=new RealSubject();
		Proxy p=new Proxy(rs);
		p.print();
	}

}
