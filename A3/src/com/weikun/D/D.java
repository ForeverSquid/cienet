package com.weikun.D;

public class D {
	
	public void go(ID d,String name){
		d.ok(name);
	}
	public ID go1(){
		
		return new ID(){

			@Override
			public void ok(String name) {
				// TODO Auto-generated method stub
				System.out.println(name);
			}
			
			
			
		};
	}
	
	public static void main(String[] args) {
//		new ID(){//ʵ���������ڲ���
//
//			@Override
//			public void ok() {
//				// TODO Auto-generated method stub
//				System.out.println("iiii");
//			}
//			
//		}.ok(); 
//		new D().go(new ID(){//�β������ڲ���
//
//			@Override
//			public void ok(String name) {
//				// TODO Auto-generated method stub
//				System.out.println(name);
//			}
//			
//			
//			
//		},"����");
		
		new D().go1().ok("����");
	}
	
	
}
class D1 implements ID{

	@Override
	public void ok(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
	}
	
}
interface ID{
	
	public void ok(String name);
}
