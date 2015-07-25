package com.weikun.Q;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class F {
	public static void main(String[] args) {
		try {
			readData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void readData() throws IOException{
		FileChannel fc=null;
		ByteBuffer buffer= ByteBuffer.allocate(1024);
		
		try {
			fc=FileChannel.open(Paths.get("d://video//NIO.wmv"), StandardOpenOption.READ);
			int n=-1;
			while((n=fc.read(buffer))!=-1){
				System.out.println("ok");
			}
			
			//buffer.flip();//把缓冲区的指针还原到起始位置
			//Charset charset=Charset.forName();
			//System.out.println(new String(buffer.array()));
			//System.out.println(charset.decode(buffer));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			fc.close();
		}
	}
	public static void appendData() throws IOException{
		FileChannel fc=null;
		try {
			
			fc=new RandomAccessFile(new File("c://1.txt"),"rw").getChannel();
			fc.position(fc.size());
			fc.write(ByteBuffer.wrap("我在沈阳".getBytes()));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			fc.close();
			
		}
	}
	public static void writeData() throws IOException{
		FileChannel fc=null;
		Path path=Paths.get("c://1.txt");
		try {
			fc=FileChannel.open(path, StandardOpenOption.WRITE);
			fc.write(ByteBuffer.wrap("我在哈尔滨".getBytes()));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			fc.close();
		}
	}
}
