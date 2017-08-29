package com.cienet.exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Throwtest2 {

	public void readFile() throws FileNotFoundException,IOException
	{
		File f = new File("c:/a.txt");
		if (!f.exists()){
			throw new FileNotFoundException("File can't be found!");
		}		
		FileInputStream fis = new FileInputStream(f);	
		int b;	
		b = fis.read();
		while(b!= -1){
			System.out.print((char)b);
			b = fis.read();
		}
		fis.close();		
	}
	public static void main(String[] args) {

		Throwtest te = new Throwtest();
		try	{			
			te.readFile();
		}
		catch(FileNotFoundException e)	{
			System.out.println("FileNotFoundException:"+e.getMessage());
		}
		catch(IOException e1)	{
			System.out.println("IOException:"+e1.getMessage());
		}

	}

}
