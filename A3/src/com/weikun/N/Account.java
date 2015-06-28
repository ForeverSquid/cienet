package com.weikun.N;

public class Account {
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
	
}
