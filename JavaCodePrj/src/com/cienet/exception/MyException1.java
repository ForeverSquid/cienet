package com.cienet.exception;

public class MyException1 extends Exception {
	int num;
	public MyException1(int a){
		num = a;
	}
	public String toString(){
		return num+"1111111";
	}
}
