package com.weikun.E;

import java.util.Arrays;

public class F {
	public static void main(String[] args) {
		int [] i={1,2,3,4,5};
		Animal[] as={new Animal(100,"π∑","gou"),new Animal(100,"÷Ì","zhu"),new Animal(100,"√®","mao")};
		
		//∂‘œÛ ˝◊ÈøΩ±¥
		//Animal[] as1=Arrays.copyOf(as, 2);
		
		
		
		
		Arrays.sort(as);
		System.out.println(Arrays.binarySearch(as, new Animal(100,"212221√®","mao")));
		
		for(Animal a :as){
			System.out.println(a.getName());
			
		}
		
	}
}

class Animal implements Comparable{
	private String pinyin;
	public Animal(int old, String name,String pinyin) {
		super();
		this.old = old;
		this.name = name;
		this.pinyin=pinyin;
	}
	private int old;
	private String name;
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
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {//≈≈–ÚÀ„∑®
		// TODO Auto-generated method stub
		Animal a=(Animal)o;
		
//		if(this.old==a.old){
//			
//			return this.name.compareTo(a.name);
//		}else{
//			
//			return this.old-a.old;
//		}
		return this.old-a.old==0?this.pinyin.compareTo(a.pinyin) : this.old-a.old;
		
		
		
	}
	
}