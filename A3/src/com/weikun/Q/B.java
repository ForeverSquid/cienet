package com.weikun.Q;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class B {
	//查询包括子目录
	public static void walkTree(){
		Path path=Paths.get("c://3000soft");
		try {
			Files.walkFileTree(path,new MyFile() );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void searchFiles(){
		Path p=Paths.get("c://");
		try (DirectoryStream<Path> ds=Files.newDirectoryStream(p, "*.sql")){			
			
			for(Path s:ds){				
				System.out.println(s.getFileName());
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		searchFiles();
	}
}
class MyFile extends SimpleFileVisitor<Path>{

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
			throws IOException {
		
		// TODO Auto-generated method stub
		Path p=file.getFileName();
		if(p.toString().endsWith(".ini")){
			System.out.println(file.getFileName());			
		}
		
		
		return FileVisitResult.CONTINUE;
	}
	
	
}
