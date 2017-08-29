package com.cienet.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchException1 {

	public static void main(String[] args) {
		 FileInputStream fis = null;
	        try{
	            fis = new FileInputStream("c:/a.txt");    
	            int b;    
	            b = fis.read();
	            while(b!= -1){
	                System.out.print((char)b);
	                b = fis.read();
	            }
	        }
	        catch(FileNotFoundException e){
	            System.out.println("FileNotFoundException :"+e.getMessage());
	        }
	        catch(IOException e1){
	            System.out.println("IOException :"+e1.getMessage());
	        }
	        finally{
	            try{
	                fis.close();
	            }
	            catch(IOException ioe){
	                System.out.println("文件关闭问题！");    
	            }
	        }        
	}
}
