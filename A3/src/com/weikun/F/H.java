package com.weikun.F;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class H {
	public static void main(String[] args) {
		HashMap<String,List<Goods>> map=new HashMap<String,List<Goods>>();
		List <Goods>list=new ArrayList<Goods>();
		list.add(new Goods("����"));
		list.add(new Goods("��ţ"));
		list.add(new Goods("���ɽ"));
		map.put("milk", list);
		
		List <Goods>list1=new ArrayList<Goods>();
		list1.add(new Goods("��ܽ"));
		list1.add(new Goods("��ʱ"));
		list1.add(new Goods("������"));
		map.put("qiaokeli", list1);
		
		Set <String> s=map.keySet();
		Iterator<String> it=s.iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.println(key);
			
			
			List<Goods> ll=map.get(key);
			
			for(Goods g :ll){
				System.out.println(g.getName());
				
			}
		}
		
		
		
		
	}
}
