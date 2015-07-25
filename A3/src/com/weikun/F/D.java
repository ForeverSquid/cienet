package com.weikun.F;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();		
		list.add("面包");
		list.add("香肠");
		list.add("薯片");
		list.add("牛奶");	
		Iterator<String> it=list.iterator();//it一开始是准备阶段，你必须把游标执行第一个
		while(it.hasNext()){
			it.next();
			it.remove();
			System.out.println("现在冰箱还剩下：");	
			for(String s :list){
				System.out.println(s);	
				
			}
		}		
//		for( int i=0;i<list.size();){
//			list.remove(i);
//			System.out.println("现在冰箱还剩下：");			
//			for(String s :list){
//				System.out.println(s);				
//			}			
//		}
//		if(list.size()==0){
//			System.out.println("空");
//		}
	}
}
