package com.weikun.O;

public class Test {
	public static void main(String[] args) {
		Account account=new Account(800,"No0001");
		new DepositThread("��",account,800).start();
		new DrawThread("��",account,800).start();
	}
}
