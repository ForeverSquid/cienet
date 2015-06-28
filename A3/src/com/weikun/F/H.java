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
		list.add(new Goods("伊利"));
		list.add(new Goods("蒙牛"));
		list.add(new Goods("完达山"));
		map.put("milk", list);
		
		List <Goods>list1=new ArrayList<Goods>();
		list1.add(new Goods("德芙"));
		list1.add(new Goods("好时"));
		list1.add(new Goods("费列罗"));
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
