package com.cienet.other;

import java.util.Comparator;

public class MyComparator implements Comparator{

	public int compare(Object o1,Object o2) {
		Person1111 p1=(Person1111)o1;
		Person1111 p2=(Person1111)o2;  
		if(p1.age<p2.age)
			return 1;
		else
			return 0;
	}

}
