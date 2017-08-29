package com.cienet.other;

import java.lang.reflect.Method;

public class Reflextest {
	public static void main(String[] args) {
		java.lang.Class c = null;
		Reflex reflex = null;
		try{
			c = Reflex.class;
			Method m1 = c.getDeclaredMethod("getObject");
			m1.setAccessible(true);
			reflex = (Reflex)m1.invoke(c);
		} catch(Exception e){
			e.printStackTrace();
		}

		try{
			java.lang.reflect.Field fieldId = reflex.getClass().getDeclaredField("id");

			String firstLetter = fieldId.getName().substring(0, 1).toUpperCase();
			String setName = "set" + firstLetter + fieldId.getName().substring(1);
			String getName = "get" + firstLetter + fieldId.getName().substring(1);
			java.lang.reflect.Method setMethod = reflex.getClass().getDeclaredMethod(setName, new Class[]{fieldId.getType()});
			Method getMethod = reflex.getClass().getDeclaredMethod(getName, new Class[]{});
			setMethod.setAccessible(true);
			setMethod.invoke(reflex, new Object[]{ 23 });
			System.out.println("-------------通过公共方法获取到的id值：" + reflex.getId());
			System.out.println("-------------通过反射获取到的id值：" + getMethod.invoke(reflex, null));
		} catch(Exception e){}
	}
}
