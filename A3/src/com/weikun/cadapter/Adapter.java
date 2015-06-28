package com.weikun.cadapter;

public class Adapter  implements Plant{
	Animal a=new Animal();
	@Override
	public void water() {
		// TODO Auto-generated method stub
		a.bark();
	}
	
}
