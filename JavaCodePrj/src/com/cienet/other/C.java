package com.cienet.other;

public class C {

	public static void main(String[] args) {
	  double d=Double.parseDouble("9.1");
		int w = Integer.parseInt("12");  
		int h = new  Integer("4").intValue();
		//int h = Integer.valueOf("4").intValue();
		//int h = Integer.valueOf("4"); 
		//int h = new  Integer("4"); 
	    //String s=new Integer(12).toString();
		for(int i=0;i<h;i++){
			StringBuffer sb=new StringBuffer();
			for(int j=0 ;j<w;j++){
				sb.append('*');
			}
			System.out.println(sb.toString());
		}

	}

}
