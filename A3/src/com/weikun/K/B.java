package com.weikun.K;
import java.io.*;
public class B {
	private 	int i=0;
	private void getFile(String path){
	
		File file=new File(path);
		
		File fs[]=file.listFiles();
		
		for(File f :fs){
			
			if(f.isDirectory()){
				getFile(f.getPath());
				
			}else{
				System.out.println(f.getPath());
			}
		}
		
		
	}
	public static void main(String[] args) {
		B b=new B();
		String path="c://T8";
		b.getFile(path);
		
//		File f=new File("c://");
//		//System.out.println(f.exists());
//		//System.out.println(f.isFile());
//
//		String[] ss=f.list();
//		for(String s :ss){
//			System.out.println(s);
//			
//		}
		
		
	//	System.out.println(f.mkdir());
		

	}
}
