package com.weikun.Q;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class E {
	
	public static void main(String[] args) {
		watchDirectionary();
	}
	public static void watchDirectionary(){
		
		try {
			WatchService ws=FileSystems.getDefault().newWatchService();
			
			Path path=Paths.get("c://");
			
			WatchKey key=path.register(ws, StandardWatchEventKinds.ENTRY_MODIFY);
			boolean flag=false;
			
			while(!flag){
				
				key=ws.take();
				
				for(WatchEvent we: key.pollEvents()){
					
					if(we.kind()==StandardWatchEventKinds.ENTRY_MODIFY){
						System.out.println("发生改变了!");
					}
					
				}
				
				key.reset();
				
				flag=true;
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//机那里监听服务
		
		
	}
}
