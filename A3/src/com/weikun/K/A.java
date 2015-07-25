package com.weikun.K;
import java.io.*;
public class A {
	public static void main(String[] args) {
		new A().test();
	}
	public void test(){
		
		ByteArrayInputStream bis=null;
		ByteArrayOutputStream bos=null;
		try {
			String s="HelloWorld";
			byte buf[] =s.getBytes();
			bis=new ByteArrayInputStream(buf);
			
			bos=new ByteArrayOutputStream();
			int n=-1;
			byte buffer[]=new byte[1024];
			while((n=bis.read(buffer))!=-1){
				
				bos.write(buffer, 0, n);			
				
			}
			System.out.println("ok");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				bis.close();
				bos.flush();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public void merge(){//合并
		RandomAccessFile rfi=null;//输入
		RandomAccessFile rfo=null;//输出
		File file=new File("c://2.mp3");
		try {
			rfi=new RandomAccessFile("c://1.mp3", "r");
			rfo=new RandomAccessFile(file, "rw");
			rfo.seek(file.length());//可以定位文件的任意位置(末尾)，AVI 		
			
			int n=-1;
			byte[] buffer=new byte[1024];
			while( (n=rfi.read(buffer))!=-1){
				rfo.write(buffer, 0, n);
			}
			System.out.println("合并完成");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rfi.close();
				rfo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public void copy1(){
		RandomAccessFile rfi=null;//输入
		RandomAccessFile rfo=null;//输出
		try {
			rfi=new RandomAccessFile("c://1.jpg", "r");
			rfo=new RandomAccessFile("d://1.jpg", "rw");
			int n=-1;
			byte[] buffer=new byte[1024];
			while( (n=rfi.read(buffer))!=-1){
				rfo.write(buffer, 0, n);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rfi.close();
				rfo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	public void copy(){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("c://w.jar");
			fos=new FileOutputStream("d://w.jar");
			int n=-1;
			byte[] buffer=new byte[1024];
			
			while((n=fis.read(buffer))!=-1){
				fos.write(buffer, 0, n);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.flush();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
