package com.weikun.H;

import java.io.FileNotFoundException;

public class B {
	public static void main(String[] args)  {
		new B().go();
	}
	public void go() {
		System.out.println("ok");
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
