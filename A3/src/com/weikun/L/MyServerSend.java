package com.weikun.L;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSend {
	public static void main(String[] args) {
		new MyServerSend().send();
	}
	public void send(){
		Socket client=null;
		ServerSocket server= null;
		DataInputStream dis=null;
		DataOutputStream dos=null;		
		try {
			server=new ServerSocket(8111);
			String path="Java�з�����ʦ_������_����������ѧ_����.doc";
			File file=new File("c://",path);
			
			FileInputStream fis=new FileInputStream(file);
			dis=new DataInputStream(fis);
			
			client=server.accept();
			
			dos=new DataOutputStream(client.getOutputStream());
			//�����ļ�����
			dos.writeUTF(path);
			dos.flush();
//			//�����ĵ���С
			dos.writeLong(file.length());
			dos.flush();
			
			
			//��������
			int n=-1;
			byte buffer[]=new byte[1024];
			while( (n=dis.read(buffer))!=-1){
				dos.write(buffer, 0, n);
			}
			System.out.println("ok");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			try {
				dos.flush();
				dos.close();
				dis.close();
				client.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
