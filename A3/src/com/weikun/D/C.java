package com.weikun.D;

public class C {
	public static void main(String[] args) {
		new C().plan(3).ok();
	}
	public C0 plan(int i){
		switch (i) {
		case 0:

			return new C0();
		case 1:

			return new C1();
		case 2:

			return new C2();

		default:
			return null;
		}
	}
}

class C1 extends C0{
	public void ok(){
		System.out.println("C1-ok");
	}
}
class C2 extends C0{
	public void ok(){
		System.out.println("C2-ok");
	}
}
class C0{
	public void ok(){
		System.out.println("C0-ok");
	}
}