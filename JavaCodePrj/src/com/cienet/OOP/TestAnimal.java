package com.cienet.OOP;

class Animal{
	private void beat()	{
		System.out.println("动物类");
	}
	public void breath(){
		beat();
		System.out.println("呼吸方法");
	}
}
class Bird{

	private Animal a;
	public Bird(Animal a1){
		a = a1;
	}
	public void breath(){
		a.breath();
	}
	public void fly(){
		System.out.println("飞");
	}
}
class Wolf{
	private Animal a;
	public Wolf(Animal a1){
		a = a1;
	}
	public void breath(){
		a.breath();
	}
	public void run(){
		System.out.println("跑");
	}
}
public class TestAnimal{
	public static void main(String[] args){
		Animal a1 = new Animal();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
		w.breath();
		w.run();		
	}
}