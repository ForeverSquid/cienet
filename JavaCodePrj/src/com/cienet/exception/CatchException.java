package com.cienet.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchException {

	public static void main(String[] args) {

		try{
			FileInputStream fis = new FileInputStream("c:/a.txt");	
		}
		catch(FileNotFoundException e){
			System.out.println("文件未找到！");
		}
		catch(IOException e1){
			System.out.println("读写出现错误！");
		}		
	}
}
