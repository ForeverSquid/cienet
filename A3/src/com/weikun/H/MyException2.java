package com.weikun.H;

public class MyException2 extends Exception {
	private int old;
	
	public MyException2(int old){
		this.old=old;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.old+"ÄêÁäÌ«´óÁË£¡";
	}
}
