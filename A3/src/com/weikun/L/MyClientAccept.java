package com.weikun.L;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClientAccept {
	
	public void accept(){
		Socket client=null;
		DataInputStream dis=null;
		FileOutputStream fos=null;
		try {
			client=new Socket("127.0.0.1",8111);
			
			dis=new DataInputStream(client.getInputStream());
			
			String filename=dis.readUTF();//文件名
			File file=new File("d://"+filename);
			fos=new FileOutputStream(file);
			long l=dis.readLong();//长度
			byte buffer[]=new byte[1024];
			int n=-1;
			while((n=dis.read(buffer))!=-1){
				
				fos.write(buffer, 0, n);
			}
			
			System.out.println("成功");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				fos.flush();
				fos.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		new MyClientAccept().accept();
	}
}
