package com.weikun.Q;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class D {
	public static void main(String[] args) {
		simpleFile();
	}
	public static void writeFile(){
		BufferedWriter out=null;
		Path p=Paths.get("c://89.txt");
		try {
			Files.createFile(p);
			out=Files.newBufferedWriter(p,
					StandardCharsets.UTF_8,StandardOpenOption.WRITE);
			out.write("ÄãºÃÂð");
			System.out.println("ok");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				out.flush();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void simpleFile(){
		Path path=Paths.get("c://89.txt");
		try {
			byte[] buffer=Files.readAllBytes(path);
			
			System.out.println(new String(buffer,"utf-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void readFile2(){
		try {
			InputStream is=Files.newInputStream(Paths.get("c://2.txt"));
			//java8 lanmada
			int n=-1;
			byte [] buffer=new byte[1024];
			while((n=is.read(buffer))!=-1){
				
				System.out.print(new String(buffer,"GBK"));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void readFile(){
		try {
			BufferedReader br=Files.newBufferedReader(Paths.get("c://88.txt"), StandardCharsets.UTF_8);
			//java8 lanmada
			String n=null;
			
			while((n=br.readLine())!=null){
				System.out.println(n);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
