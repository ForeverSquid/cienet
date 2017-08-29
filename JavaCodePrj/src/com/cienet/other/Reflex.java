package com.cienet.other;

public class Reflex {
	private long id;
	private String name;
	private String age;

	private static Reflex flag = null;
	private Reflex(){}
	
	//单例模式获取对象：
	private static synchronized Reflex getObject(){
		if(flag == null){
			return new Reflex();
		}
		return flag;
	}

	private void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	private void setAge(String age) {
		this.age = age;
	}
	public String getAge() {
		return age;
	}
}
