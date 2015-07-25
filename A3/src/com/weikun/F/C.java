package com.weikun.F;

public class C extends C1<Integer,String,Double>{
	
	public static void main(String[] args) {
		//new C().set
	}
}
class C1<T,K,S> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
