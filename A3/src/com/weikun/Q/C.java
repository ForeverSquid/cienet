package com.weikun.Q;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class C {
	public static void main(String[] args) {
		getAttribute();
	}
	public static void move(){
		
		try {
			Path source =Paths.get("c://g.sql");
			Path target =Paths.get("c://3000soft//g.sql");
			Files.move(source, target, StandardCopyOption .ATOMIC_MOVE,StandardCopyOption.REPLACE_EXISTING);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void copy(){
		
		try {
			Path source =Paths.get("c://1.jpg");
			Path target =Paths.get("d://4.jpg");
			Files.copy(source, target, StandardCopyOption .COPY_ATTRIBUTES,StandardCopyOption.REPLACE_EXISTING);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void setAttribute(){
		
		DosFileAttributeView  dv=Files.getFileAttributeView(Paths.get("c://1.txt"), DosFileAttributeView.class);
		try {
			dv.setReadOnly(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void getAttribute(){
		
		DosFileAttributeView  dv=Files.getFileAttributeView(Paths.get("c://1.txt"), DosFileAttributeView.class);
		try {
			DosFileAttributes da=dv.readAttributes();
			
			System.out.println(da.isReadOnly());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}

