package com.weikun.E;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class A  {
	public static void main(String[] args) {
		/*SimpleDateFormat sdf=
				new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss D w W E z");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-5"));		
		System.out.println(sdf.format(new Date()));		
		
		//System.out.println(new Date());
		
		System.out.println(sdf.format(System.currentTimeMillis()));//一天  24*3600*1000*/
		
		Calendar c=Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(new A().getNextSunday());
	}
	// 获得当前日期与本周日相差的天数    
    private int getMondayPlus() {    
        Calendar cd = Calendar.getInstance();    
        // 获得今天是一周的第几天，星期日是第一天，星期二是第二天......    
        int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK)-1;         //因为按中国礼拜一作为第一天所以这里减1    
        if (dayOfWeek == 1) {    
            return 0;    
        } else {    
            return 1 - dayOfWeek;    
        }    
    }    
	 public String getNextSunday() {    
         
	        int mondayPlus = this.getMondayPlus();    
	        GregorianCalendar currentDate = new GregorianCalendar();    
	        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7+6);    
	        Date monday = currentDate.getTime();    
	        DateFormat df = DateFormat.getDateInstance();    
	        String preMonday = df.format(monday);    
	        return preMonday;    
	    }    
}
