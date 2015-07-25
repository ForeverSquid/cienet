package com.weikun.J;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class A {
	public static void main(String[] args) {
		new A().copy();
	}
	public void copy(){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			long  start=System.currentTimeMillis();
			fis=new FileInputStream("G://1.rmvb");
			fos=new FileOutputStream("c://1.rmvb");
			
			int n=-1;
			byte[] buffer=new byte[1024*10];
			
			while((n=fis.read(buffer))!=-1){
				fos.write(buffer, 0, n);
				
			}
			long  end=System.currentTimeMillis();
			
			SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
			
			
			
			System.out.println("ok:"+sdf.format(end-start));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				fos.flush();
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void write(){
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("c://44.txt");
			String s="我爱你们";
			System.out.println(s.getBytes().length);
			System.out.println(s.length());
			fos.write(s.getBytes(), 0, s.getBytes().length);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				fos.flush();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}
	public void read(){
		
		
			FileInputStream fis=null;
			try {
				fis = new FileInputStream("src//1.txt");
				
				int n=-1;//每次读取的字节数量
				
				byte[] buffer=new byte[1024];//读一次的缓存区
				
				while(  (n=fis.read(buffer))!=-1){
					
					System.out.write(buffer, 0, n);
					
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		
			
		
	}
}
