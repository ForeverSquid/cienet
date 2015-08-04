package com.weikun.vo;

import java.io.Serializable;

public class City implements Serializable {
	private int pro;
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City( int id, String name) {
		super();
		
		this.id = id;
		this.name = name;
	}
	
}
