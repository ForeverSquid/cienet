package com.weikun.N;

public class DrawMoney extends Thread {
	private Account account;
	private String name;
	private int money;
	public DrawMoney(Account account, String name, int money) {
		super();
		this.account = account;
		this.name = name;
		this.money = money;
	}	

	@Override
	public  void run() {
		// TODO Auto-generated method stub
		synchronized(account){
			
			if(this.money<=account.getFund()){
				
				System.out.println(this.name+"取了"+this.money);
				
				this.account.setFund(this.account.getFund()-this.money);
			}else{
				System.out.println("没有钱了！");
			}
		}
		
		
	}
		
}
