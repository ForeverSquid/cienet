package com.cienet.exception;

public class MyExceptionTest {

	static void makeException(int a) throws MyException1,MyException2{
		if(a<10)
			throw new MyException1(a);
		if(a>100)
			throw new MyException2(a);
		System.out.println("No Exception");
	}
	public static void main(String[] args){
		int a;
		try{
			a = Integer.parseInt("2");
			makeException(a);
			System.out.println("a="+a);
		}
		catch (MyException1 e){
			System.out.println("exception1"+e);
		}
		catch(MyException2 e){
			System.out.println("exception2"+e);
		}
	}
}
