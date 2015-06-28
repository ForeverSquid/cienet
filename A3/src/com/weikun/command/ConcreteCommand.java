package com.weikun.command;

public class ConcreteCommand implements Command {
	private Receiver rece;
	public ConcreteCommand(Receiver rece){
		this.rece=rece;
	}
	@Override
	public void exceute() {
		// TODO Auto-generated method stub
		this.rece.sendSister();
	}

}
