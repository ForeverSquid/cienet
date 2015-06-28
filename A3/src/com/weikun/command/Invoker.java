package com.weikun.command;

public class Invoker {
	Command command;
	public void startCommand(Command command){
		this.command=command;
		this.command.exceute();
	}
}
