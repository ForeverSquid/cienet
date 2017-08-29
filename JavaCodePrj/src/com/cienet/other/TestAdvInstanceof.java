package com.cienet.other;

public class TestAdvInstanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				IObject f=new TestA();
        if(f instanceof Object)
        	System.out.println("true");
        if(f instanceof Foo)
        	System.out.println("true");
        if(f instanceof TestA)
        	System.out.println("true");
        if(f instanceof IObject)
        	System.out.println("true");

	}

}
