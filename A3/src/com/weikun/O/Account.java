package com.weikun.O;

public class Account {
	//false:没钱  可以存钱了 true：有钱，可以取钱了
	private boolean flag=false;

	private int fund;
	private String no;
	public int getFund() {
		return fund;
	}
	public void setFund(int fund) {
		this.fund = fund;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public Account(int fund, String no) {
		super();
		this.fund = fund;
		this.no = no;
	}
	public  void draw(int money){//	取钱
		synchronized(this){
			if(flag==false){//取钱线程等候
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}else{//取钱了

				this.fund-=money;
				System.out.println("你取了"+money);
				try {
					Thread.currentThread().sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				flag=false;
				notifyAll();
				notify();
			}
		}
		



	}
	public   void deposit(int money){//	存钱
		synchronized(this){
			if(flag==true){//存钱线程等候
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}else{//存钱了

				this.fund+=money;
				System.out.println("你存了"+money);
				try {
					Thread.currentThread().sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				flag=true;
				notifyAll();
			}
		}

	}


}
