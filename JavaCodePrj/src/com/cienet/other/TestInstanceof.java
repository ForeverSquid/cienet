package com.cienet.other;

public class TestInstanceof {

	public static void main(String[] args) {
		Animal ani=new Animal();
		Dog dog=new Dog();		
		if (ani instanceof Dog){
			System.out.println("ani是Dog的object");
			
		}else{
			System.out.println("ani不是Dog的object");
		}
		if ( dog instanceof Animal){
			System.out.println("dog是动物的object");
			
		}else{
			System.out.println("dog是动物的object");
		}
		String [] str = new String[2];
		if (str instanceof String[]){
			System.out.print("true");
		}
			
	}

}
