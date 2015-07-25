package com.weikun.single;

public class Single2 {
	private Single2(){
		
	}
	private static class Single2Holder {
		
		private static final Single2 INSTANCE=new Single2();
	}
	
	public static Single2 getInstance(){
		return Single2Holder.INSTANCE;
	}
}
