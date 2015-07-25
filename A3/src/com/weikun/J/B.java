package com.weikun.J;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B {
	public static void main(String[] args) {
		new B().write();
	}
	public void write(){
		FileWriter fw=null;
		try {
			fw=new FileWriter("c://55.txt");
			
			fw.write("¹þ¶û±õ");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				fw.flush();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public void read(){
		FileReader fr=null;
		try {
			fr=new FileReader("c://mpet.sql");
			int n=-1;
			char buffer[]=new char[1024];
			
			while((n=fr.read(buffer))!=-1){
				
				System.out.println(new String(buffer,0,n));
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
