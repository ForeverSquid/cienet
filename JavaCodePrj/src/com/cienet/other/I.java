package com.cienet.other;
import java.util.HashSet;
import java.util.Set; 

public class I { 

	public static void main(String[] args) { 
		testfunction1();
		testfunction2(); 
	} 
	public static void testfunction1() { 
		System.out.println("----- test1 -----------"); 
		Set set = new HashSet(); 
		set.add("a"); 
		set.add(new Integer(1)); 
		set.add(123.45); 
		System.out.println(set.size()); 
		set.add("b");
		set.add(null); 
		System.out.println(set.size()); 
		System.out.println(set.contains(null));
		set.remove(null); 

		System.out.println(set.size()); 
		System.out.println(set.contains(null));
	} 

	public static void testfunction2() { 
		System.out.println("----- test2 -----------"); 
		HashSet set = new HashSet(); 
		set.add(null); 
		System.out.println(set.size());
		set.add(null); 
		System.out.println(set.size());

		MyObject2 obj = new MyObject2("java2000", 2); 
		set.add(obj); 

		obj = new MyObject2("asdf", 10); 
		set.add(obj); //

		System.out.println(set.size());

		System.out.println(set.contains(obj));

		obj = new MyObject2("java2000_", 2); 
		set.add(obj); 

		System.out.println(set.size()); 

		set.add(obj); 
		System.out.println(set.size()); 

		obj = new MyObject2("java2000_net", 2); 
		set.add(obj); 
		System.out.println(set.size()); 
		obj.setAge(3); 
		System.out.println(set.contains(obj));

		set.add(obj); 
		System.out.println(set.size()); 
	} 
} 

class MyObject { 
	private int age; 
	private String name; 

	public int getAge() { 
		return age; 
	} 

	public void setAge(int age) { 
		this.age = age; 
	} 

	public String getName() { 
		return name; 
	} 

	public void setName(String name) { 
		this.name = name; 
	} 

	MyObject(String name, int age) { 
		this.name = name; 
		this.age = age; 
	} 

	public boolean equals(Object obj) { 
		System.out.println("equals");
		if (obj == null || !(obj instanceof MyObject)) { 
			return false; 
		} 
		MyObject o = (MyObject) obj; 
		return this.age == o.age && this.name.equals(o.name); 
	} 

	public int hashCode() { 
		int hashCode = name.hashCode() + String.valueOf(age).hashCode(); 
		return hashCode; 
	} 
} 

class MyObject2{
	private String name;    
	private int age;    
	private int HASHCODE= Integer.MIN_VALUE;    

	public MyObject2(String name,int age){    
		this.name = name;    
		this.age = age;    
	}    
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

	public int hashCode() {     
		if (HASHCODE == Integer.MIN_VALUE) {     
			HASHCODE = name.hashCode() + String.valueOf(age).hashCode();         
		}     
		return HASHCODE;     
	}     

	public boolean equals(Object obj) {    
		System.out.println("deng");
		if(obj == null || !(obj  instanceof  MyObject2)){    
			return false;    
		}    
		MyObject2 o = (MyObject2)obj;    
		return this.age == o.age && this.name.equals(o.name); 
	}    
}