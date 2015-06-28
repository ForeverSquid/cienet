package com.weikun.M;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	private int imgCount;//图片总数量
	private int imgCur;//当前图片号
	private Timer timer;
	
	public void setImgCount(int imgCount) {
		this.imgCount = imgCount;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(++imgCur<=imgCount){
			System.out.println("加载程序"+imgCur+"%");
		}else{
			timer.cancel();
			System.out.println("程序开始了！");
		}
		
		
		
	}

}
