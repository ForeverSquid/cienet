package com.weikun.C;

public abstract class Account {
	public int principal=800;//����
	
	public abstract float getRate();//����
		
	
	
	public float getInterest(){//��Ϣ
		return this.principal*this.getRate();
	}
	
}
