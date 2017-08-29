package com.cienet.OOP;

class Car {
	String color;    
	String model; 
	public Car() {   
		this.color = "粉色";  
		this.model = "卡车";  
	}  
	public Car(String color, String model) {
		this.color = color;  
		this.model = model;  
	}  
	public void getColor() {
		System.out.println("颜色：" + this.color);  
	}  
	public void getLeixing() {
		System.out.println("类型：" + this.model);  
	}  
}  
class Son extends Car {      
	String produce;          
	Son(String color, String model, String produce) {
		super(color, model);
		this.produce = produce;  
	}  
	Son(String color) {      
		this.color = color;  
		this.produce = "北京现代";  
	}  
	Son() {              
		this("灰色");  
	}  
}  



public class extendsTest {  
	public static void main(String[] args) {  
		Son c = new Son(); 
		System.out.println("produce：" + c.produce);
		c.getColor();        
		c.getLeixing();       
		Son c1 = new Son("银白色");  
		System.out.println("produce：" + c1.produce);  
		c1.getColor();  
		c1.getLeixing();  
		Son c2 = new Son("彩色", "拖拉机", "东红三号");  
		System.out.println("produce:" + c2.produce);  
		c2.getColor();  
		c2.getLeixing();  
	}  
}  
