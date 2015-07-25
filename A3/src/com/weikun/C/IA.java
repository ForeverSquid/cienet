package com.weikun.C;

public interface IA extends IB {
	int age=200;
	abstract void ok();
}
abstract class A implements IA,IC{
	
}
class B{	
}
interface IB{
	void ok();
}
interface IC{
	void ok1();
}