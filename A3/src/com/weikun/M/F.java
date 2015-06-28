/**
 * 
 */
package com.weikun.M;
import java.util.*;
/**
 * @author Administrator
 *
 */
public class F {
	private Timer timer=new Timer();
	public void start(){
		MyTask my=new MyTask();
		my.setImgCount(100);
		my.setTimer(timer);
		
		timer.schedule(my,0, 100);
	}
	public static void main(String[] args) {
		
		new F().start();
		
	}
}
