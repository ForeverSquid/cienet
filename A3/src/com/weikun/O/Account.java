package com.weikun.O;

public class Account {
	//false:ûǮ  ���Դ�Ǯ�� true����Ǯ������ȡǮ��
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
	public  void draw(int money){//	ȡǮ
		synchronized(this){
			if(flag==false){//ȡǮ�̵߳Ⱥ�
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}else{//ȡǮ��

				this.fund-=money;
				System.out.println("��ȡ��"+money);
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
	public   void deposit(int money){//	��Ǯ
		synchronized(this){
			if(flag==true){//��Ǯ�̵߳Ⱥ�
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}else{//��Ǯ��

				this.fund+=money;
				System.out.println("�����"+money);
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
