package com.weikun.decorator;

public class Science extends GirlDecorator {
	private Girl girl;
	
	public Science(Girl girl){
		this.girl=girl;
	}
	@Override
	public String getPretty() {
		// TODO Auto-generated method stub
		
		return this.girl.getPretty()+",�����һ���";
	}

}
