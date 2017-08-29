package com.cienet.OOP;
public class Dog extends Animal{
	private int weight;
	public void Bark(){
		System.out.println("WangWang~~~");
	}

	public void beat(){
		System.out.println("Dog呼吸~~~");
	}
	
	public void setWeight(int i) {
		// TODO Auto-generated method stub
		this.weight = i;
	}

	public int getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}

}

	