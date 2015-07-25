package com.weikun.I;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.weikun.A.Animal;

public class A {
	public static void main(String[] args) {
		
		reArrays();
//		List<?> list=new ArrayList<>();
//		List<Integer> list1=new ArrayList<>();
//		ok(list);
	}
//	public static void ok(List<?> list){
//		
//	}
	
	private static void reArrays() {//Arrays
		
		Object o=Array.newInstance(String.class, 3);
		
		Array.set(o, 0, "���");
		Array.set(o, 1, "����");
		Array.set(o, 2, "����");
		
		//String [] s={};
		
		System.out.println(Array.get(o, 2));
		
	}
	private static void reProperty() {//attribute
		
		try {
			Class<?> c=Class.forName("org.weikun.A.Animal");
			
			Object o=c.newInstance();
			
//			Field [] fs=c.getDeclaredFields();
//			
//			for(Field f :fs){
//				
//				System.out.println(f.getName());
//			}
			
			Field name=c.getDeclaredField("name");
			name.setAccessible(true);
			name.set(o, "��");
			
			
			System.out.println(name.get(o));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	private static void refMethod() {
		try {
			
			Class<?> c=Class.forName("org.weikun.A.Animal");
			
//			Method ms[]=c.getMethods();
//			
//			for(Method m :ms){
//				
//				System.out.println(m.getName());
//			}
			Object o=c.newInstance();
			Method s=c.getMethod("setName", String.class);//setName
			
			s.invoke(o,"è" );
			
			
			Method s1=c.getMethod("getName");//setName
			System.out.println(s1.invoke(o));
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	/*
	 * ��Ĭ�Ϲ���������
	 */
	
	private static void refCon1() {
		try {
			Class<?> c=Class.forName("org.weikun.A.Animal");//��
			
			Constructor<?> con=c.getConstructor(int.class,String.class);//����ʱ��
			
			Animal a=(Animal)con.newInstance(100,"��");
			
			System.out.println(a.getName()+a.getOld());
			
			
			//destory
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	/**
	 * //Ĭ�Ϲ�����
	 */
	private static void refCon() {
		try {
			Class<?> c=Class.forName("org.weikun.A.Animal");//���׼�ķ���
			//
			Animal a=(Animal)c.newInstance();//org.weikun.A.Animal �Ķ���
			
			a.setName("��");
			System.out.println(a.getName());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
