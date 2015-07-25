package com.weikun.F;

public class Goods {
	private String no;
	private String name;
	private int price;
	private int quantity;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Goods(String no, String name, int price, int quantity) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Goods(){
		
	}
	
	public Goods( String name) {
		
		this.name = name;
	
	}
	
	
	
}
