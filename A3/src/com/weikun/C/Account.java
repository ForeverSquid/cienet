package com.weikun.C;

public abstract class Account {
	public int principal=800;//本金
	
	public abstract float getRate();//利率
		
	
	
	public float getInterest(){//利息
		return this.principal*this.getRate();
	}
	
}
