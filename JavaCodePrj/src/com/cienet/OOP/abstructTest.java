package com.cienet.OOP;

abstract class Xingzhuang {          
	abstract float getArea();       
	abstract float getPerimeter();  
}  
class Dengsanjiao extends Xingzhuang {      
	float width;  
	float height;  
	Dengsanjiao(float width, float height) {   
		this.width = width;  
		this.height = height;  
	}  
	float getArea() {                         
		return (width * height) / 2;  
	}  
	float getPerimeter() {                      
		return width * 3;  
	}  
}  
class Zheng extends Xingzhuang {         
	float width;  
	float height;  
	Zheng(float width, float height) {        
		this.width = width;  
		this.height = height;  
	}  
	float getArea() {                   
		return width * height;  
	}  
	float getPerimeter() {                  
		return 2 * (width * height);  
	}  
}  
class Yuan extends Xingzhuang {               
	float radius;  
	Yuan(float number) {                
		radius = number;  
	}  
	protected float getArea() {                
		return 3.14f * radius * radius;  
	}  
	protected float getPerimeter() {            
		return 2 * 3.14f * radius;  
	}  
}  
public class abstructTest {  
	public static void main(String[] args) {  
		Dengsanjiao deng = new Dengsanjiao(10, 5);  
		System.out.println("三角形面积:" + deng.getArea());  
		System.out.println("三角形周长：" + deng.getPerimeter());  
		Zheng zheng = new Zheng(12, 8);                
		System.out.println("正方形面积:" + zheng.getArea());  
		System.out.println("正方形周长：" + zheng.getPerimeter());  
		Yuan yun = new Yuan(5.5f);                      
		System.out.println("圆的面积:" + yun.getArea());  
		System.out.println("圆的周长：" + yun.getPerimeter());  
	}  
} 