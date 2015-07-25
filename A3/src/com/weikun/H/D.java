package com.weikun.H;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D {
	public static void main(String[] args) {
		String[] a={"ABC","DEF"};
		List<String> list=Arrays.asList(a);
		int i=100_000_1;
		double d=1.112;
		int i1=0b0101;
		System.out.println(i1);
		
		try(
				FileInputStream fis=new FileInputStream("");
				FileInputStream fis1=new FileInputStream("");
		) {
			
			
		} catch ( IOException | RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
