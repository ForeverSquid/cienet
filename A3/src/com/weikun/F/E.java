package com.weikun.F;

import java.util.LinkedList;

//LinkedList
public class E {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.push("G");
		list.offerFirst("E");
		list.offerLast("F");
		list.offer("D");
		list.add("A");
		list.addFirst("B");	
		list.addLast("C");
		list.addLast("H");	
		list.addLast("I");	
		list.add(3, "J");
		
//		System.out.println("DEL:"+list.remove());
//		System.out.println("DEL:"+list.removeFirst());
//		
//		System.out.println("DEL:"+list.removeLast());
//		
//		System.out.println("DEL:"+list.pop());
//		
//		System.out.println("DEL:"+list.poll());
//		
//		System.out.println("DEL:"+list.pollFirst());
//		
//		System.out.println("DEL:"+list.pollLast());
//		System.out.println("��ҪDEL:"+list.peek()+"ʵ��ûɾ��");
//		System.out.println("��ҪDEL:"+list.peekFirst()+"ʵ��ûɾ��");
//		System.out.println("��ҪDEL:"+list.peekLast()+"ʵ��ûɾ��");
		
		for(String s:list){
			
			System.out.println(s);
		}
	}
}
