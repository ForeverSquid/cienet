package com.weikun.E;

public enum EPlanet {
	MARS,EARTH;
	private EPlanet(){
		
	}
	public void plan(){
		if(this==MARS){
			System.out.println("����OK111");
		}
		switch (this) {
		case MARS:
			System.out.println("����OK");
			break;
		case EARTH:
			System.out.println("����OK");
			break;

		default:
			break;
		}
			
		
		
		
	}
	
	
}
interface IA{
	public void ok();
}
interface IB{
	public void ok1();
}

