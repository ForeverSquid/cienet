package com.cienet.other;
public class MyKey {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	public MyKey(String name,int age){
		this.name = name;
		this.age = age;
	}


}
