package com.weikun.vo;

import java.io.Serializable;

public class Book implements Serializable {
	private float price;
	private String name;
	private String path;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book(int id,float price, String name, String path) {
		super();
		this.id=id;
		this.price = price;
		this.name = name;
		this.path = path;
	}
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
