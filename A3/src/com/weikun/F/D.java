package com.weikun.F;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();		
		list.add("���");
		list.add("�㳦");
		list.add("��Ƭ");
		list.add("ţ��");	
		Iterator<String> it=list.iterator();//itһ��ʼ��׼���׶Σ��������α�ִ�е�һ��
		while(it.hasNext()){
			it.next();
			it.remove();
			System.out.println("���ڱ��仹ʣ�£�");	
			for(String s :list){
				System.out.println(s);	
				
			}
		}		
//		for( int i=0;i<list.size();){
//			list.remove(i);
//			System.out.println("���ڱ��仹ʣ�£�");			
//			for(String s :list){
//				System.out.println(s);				
//			}			
//		}
//		if(list.size()==0){
//			System.out.println("��");
//		}
	}
}
