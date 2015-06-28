package com.weikun.Q;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class G {
	public static void main(String[] args) {
		callableRead();
	}
	public static void callableRead(){
		ByteBuffer buffer=ByteBuffer.allocate(1024*1024);
		try {
			AsynchronousFileChannel fs=AsynchronousFileChannel.open(Paths.get("d://video//NIO.wmv"), StandardOpenOption.READ);
			
			
			fs.read(buffer, 0, null,  new CompletionHandler<Integer,Object>() {

				@Override
				public void completed(Integer result, Object attachment) {
					// TODO Auto-generated method stub
					System.out.println("完毕");;
				}

				@Override
				public void failed(Throwable exc, Object attachment) {
					// TODO Auto-generated method stub
					
				}

			
			});
			System.out.println("语句结束了！");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			
		}
	}
	public static void futureRead(){
		ByteBuffer buffer=ByteBuffer.allocate(1024*1024*500);
		try {
			
			AsynchronousFileChannel fc=AsynchronousFileChannel.open(Paths.get("d://video//NIO.wmv"), StandardOpenOption.READ);
			Future fu=fc.read(buffer, 0);
			
			while(!fu.isDone()){//异步开关
				for(int i=0;i<100;i++){
					System.out.println("很帅"+i);
				}
			}
			
			System.out.println(fu.get());//我们从流中读取了多少字节
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			
		}
	}
}
