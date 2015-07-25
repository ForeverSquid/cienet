package com.weikun.O;

/**
 * Description:
 * <br/>Copyright (C), 2008-2010, weikun
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  weikun@163.com
 * @version  1.0
 */
//存款
public class DepositThread extends Thread{
	//模拟用户账户
	private Account account;
	//当前取钱线程所希望存款的钱数
	private int depositAmount;

	public DepositThread(String name , Account account , 
			int depositAmount){
		super(name);
		this.account = account;
		this.depositAmount = depositAmount;
	}

	//重复100次执行存款操作
	public void run(){
		for (int i = 0 ; i < 100 ; i++ ){
			account.deposit(depositAmount);
		}		
	}
}