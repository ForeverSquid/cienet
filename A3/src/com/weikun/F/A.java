package com.weikun.F;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A {
	public  static void main(String[] args) {
		List list=new ArrayList();
		list.add("A");		
		list.add("B");
		list.add("C");
		list.add("D");
		
		//list.add(new Date());
		//1
		for(Object s : list){
//			if(s instanceof Date){
//				System.out.println(((Date)s).getDate());
//				
//			}else{
//				System.out.println(s);
//			}
			
		}
		//2
		Iterator it=list.iterator();
		
		while( it.hasNext() ){
			System.out.println(it.next());
			
		}
		//3
		ListIterator it1=list.listIterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
			
		}
		
		while(it1.hasPrevious()){
			System.out.println(it1.previous());
			
		}
		//4
		for(int i=0;i<list.size();i++){
			
			System.out.println(list.get(i));
		}
		//5
		Object [] os=list.toArray();
		
		for(int i=0;i<os.length;i++){
			
			System.out.println(os[i]);
			
		}
		String [] ss={"O","P","Q"};
		
//		List list1=Arrays.asList(ss,ss);
//		Object [] os=list1.toArray();
//		for(int i=0;i<os.length;i++){
//			Object[] os1=(Object [])os[i];
//			for(int j=0;j<os1.length;j++){
//				System.out.println(os1[j]);
//			}
//		}
		
	}
}
