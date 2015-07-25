package com.weikun.F;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class F {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("A");
		for(Object s :set){
			System.out.println(s);
		}
		Iterator it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Object []os=set.toArray();
		for(int i=0;i<os.length;i++){
			System.out.println(os[i]);
		}
		
	}
}
