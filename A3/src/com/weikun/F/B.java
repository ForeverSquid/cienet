package com.weikun.F;
import java.util.*;
public class B {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		
		
		Enumeration<String> es=v.elements();
		
		while(es.hasMoreElements()){
			System.out.println(es.nextElement());
		}
		
	}
}
