package com.weikun.dproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		
		IAnimal c=new Cat();
		InvocationHandler ih=new DyProxy(c);
		
		Object o=Proxy.newProxyInstance(c.getClass().getClassLoader(), c.getClass().getInterfaces(), ih);
		
		((IAnimal)o).go();
		((IAnimal)o).bark();
		
	}
}
