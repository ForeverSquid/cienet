package com.weikun.M;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {
	private int imgCount;//ͼƬ������
	private int imgCur;//��ǰͼƬ��
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
			System.out.println("���س���"+imgCur+"%");
		}else{
			timer.cancel();
			System.out.println("����ʼ�ˣ�");
		}
		
		
		
	}

}
