package com.weikun.F;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class G {
	public static void main(String[] args) {
		Map map=new HashMap();
		
		
		Hashtable<String,Integer> table=new Hashtable<String,Integer>();
		
		table.put("D", 100);

		table.put("E", 200);
		
		table.put("A", 300);
		
		table.put("C", 400);
		table.put("F", null);
		
		Enumeration<Integer> e=table.elements();//集合线程同步专用
		
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		
		Enumeration<String> e1=table.keys();
		
		while(e1.hasMoreElements()){
			String key=e1.nextElement();
			System.out.println(key+table.get(key));
			
		}
		
		
		Set<String> ss=table.keySet();
		
		Iterator<String> it1=ss.iterator();
		while(it1.hasNext()){
			String key=it1.next();
			System.out.println(key+table.get(key));
		}
		
		
		Collection<Integer> cc=table.values();
		
		Iterator<Integer> it2=cc.iterator();
		
		while(it2.hasNext()){
			
			System.out.println(it2.next());
		}
		
		
		Set<Entry<String,Integer>> s2=table.entrySet();
		
		
		Iterator<Entry<String,Integer>> it3=s2.iterator();

		while(it3.hasNext()){
			Entry<String,Integer> e2=it3.next();
			System.out.println(e2.getKey()+"~"+e2.getValue());
		}
		
		
		
		
		
	}
}
