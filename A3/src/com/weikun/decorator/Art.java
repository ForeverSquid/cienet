package com.weikun.decorator;

public class Art extends GirlDecorator {
	private Girl girl;
	public Art(Girl girl){
		this.girl=girl;
	}
	@Override
	public String getPretty() {
		// TODO Auto-generated method stub
		return this.girl.getPretty()+";²¢ÇÒÎÒ»áÌøÎè";
	}

}
