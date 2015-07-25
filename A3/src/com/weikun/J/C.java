package com.weikun.J;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class C {
	public static void main(String[] args) {
		new C().copy();
	}
	public void copy(){
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		try {
			long  start=System.currentTimeMillis();
			bis=new BufferedInputStream(new FileInputStream("G://1.rmvb"), 4096);
			bos=new BufferedOutputStream(new FileOutputStream("c://1.rmvb"), 4096);
			
			byte[] buffer=new byte[1024*4];
			int n=-1;
			while((n=bis.read(buffer))!=-1){
				bos.write(buffer, 0, n);
			}
			long  end=System.currentTimeMillis();
			
			SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
			
			
			
			System.out.println("ok:"+sdf.format(end-start));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				bos.flush();
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
