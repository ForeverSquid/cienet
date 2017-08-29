package com.cienet.OOP;

public  class adbstrctTest  {  
	public static void main(String[] args)  {  
		man boys = new man();
		boys.sex = "nan";
		System.out.println(boys.sex);  
		boys.function();  
	}  
}  

abstract class personlei{    
	public String sex;  
	public abstract void function();  
}  
class man extends personlei {    
	public void function() {  
		System.out.println("实例化完成");  
	}  
}  