package com.cienet.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throwtest {

	public void readFile() throws FileNotFoundException	{
		FileInputStream fis = new FileInputStream("c:/a.txt");	
		int b;	
		try{
			b = fis.read();
			while(b!= -1){
				System.out.print((char)b);
				b = fis.read();
			}
		}catch(IOException ex){
			try {
				throw ex;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}				
		}			
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Throwtest te = new Throwtest();
		try{			
			te.readFile();
			
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException111:"+e.getMessage());
		}catch(NullPointerException e1){
			System.out.println("NullPointerException:"+e1.getMessage());
		}catch(IOException e2){
			System.out.println("IOException:"+e2.getMessage());
		}
	}
}
