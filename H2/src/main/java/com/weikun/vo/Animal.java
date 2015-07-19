package com.weikun.vo;

import java.io.Serializable;

public class Animal implements Serializable {
	private int old;
	private String name;
	private String sex;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getOld() {
		return old;
	}
	public void setOld(int old) {
		this.old = old;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals("狗")){
			this.name="人";
					
		}else{
			this.name = name;
			
		}
		
	}
	
}
