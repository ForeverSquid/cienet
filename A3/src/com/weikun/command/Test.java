package com.weikun.command;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver rec=new Receiver();
		
		
		ConcreteCommand cmd=new ConcreteCommand(rec);
		
		
		Invoker invo=new Invoker();
		
		invo.startCommand(cmd);
	}

}
