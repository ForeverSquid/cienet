package com.weikun.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DyProxy implements InvocationHandler {
	private Object obj;
	public DyProxy(Object obj){
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("¶¯Ì¬´úÀí£¡");
		
		return method.invoke(this.obj, args);//go bark;
	}

}
