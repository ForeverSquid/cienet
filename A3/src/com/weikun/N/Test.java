package com.weikun.N;

public class Test {
	public static void main(String[] args) {
		Account a=new Account(800,"NO0001");
		
		
		
		DrawMoney dm1=new DrawMoney(a,"ÒÒ",800);
		dm1.start();
		DrawMoney dm=new DrawMoney(a,"¼×",800);
		dm.start();
	}
}
