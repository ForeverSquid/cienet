package com.cienet.exception;

public class MyException2 extends Exception {
	int num;
	public MyException2(int a) {
		num = a;
	}
	public String toString() {
		return num+"222222";
	}


}
