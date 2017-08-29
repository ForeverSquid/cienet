package com.cienet.other;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class A {

	public static String formatDateByFormat(java.util.Date date,String format) { 
		String result = ""; 
		if(date != null) { 
			try { 
				TimeZone tz = TimeZone.getTimeZone("GMT+8");
				SimpleDateFormat sdf = new SimpleDateFormat(format); 
				sdf.setTimeZone(tz);
				result = sdf.format(date); 
			} 
			catch(Exception ex) { 
				ex.printStackTrace(); 
			} 
		} 
		return result; 
	} 
	
	public String formatDate(java.util.Date date) { 
		return formatDateByFormat(date,"yyyy-MM-dd"); 
	}

	public static int getMonth(java.util.Date date) { 
		java.util.Calendar c = java.util.Calendar.getInstance(); 
		c.setTime(date); 
		return c.get(java.util.Calendar.MONTH) + 1; 
	} 
	
	public static int getDay(java.util.Date date) { 
		java.util.Calendar c = java.util.Calendar.getInstance(); 
		c.setTime(date); 
		return c.get(java.util.Calendar.DAY_OF_MONTH); 
	} 

	public static int getHour(java.util.Date date) { 
		TimeZone tz = TimeZone.getTimeZone("GMT+8");
		java.util.Calendar c = java.util.Calendar.getInstance(); 
		c.setTimeZone(tz);
		c.setTime(date); 
		return c.get(java.util.Calendar.HOUR_OF_DAY); 
	} 

	public static int getMinute(java.util.Date date) { 
		java.util.Calendar c = java.util.Calendar.getInstance(); 
		c.setTime(date); 
		return c.get(java.util.Calendar.MINUTE); 
	} 
	
	public static int getYear(java.util.Date date) { 
		java.util.Calendar c = java.util.Calendar.getInstance(); 
		c.setTime(date); 
		return c.get(java.util.Calendar.YEAR); 
	} 
	public static int getSecond(java.util.Date date) { 
		java.util.Calendar c = java.util.Calendar.getInstance(); 
		c.setTime(date); 
		return c.get(java.util.Calendar.SECOND); 
	} 
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(getYear(d)+"-"+getMonth(d)+"-"+getDay(d)+" "+getHour(d)+":"+getMinute(d)+":"+getSecond(d));
		System.out.println(formatDateByFormat(d,"yyyy年MM月dd日HH时mm分ss秒"   ));
	}
}
