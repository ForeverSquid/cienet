package com.weikun.Q;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A {
	public static void main(String[] args) {
		Path p1=Paths.get("1.sql");
		System.out.println(p1.getFileName());
		System.out.println(p1.getParent());
		System.out.println(p1.getRoot());
		System.out.println(p1.getNameCount());
		System.out.println(p1.subpath(0, 1));
		
		
		try {
			System.out.println(p1.toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Path p2=Paths.get("/op/po/abc");
		System.out.println(p2.resolve(p1));
		
	}
}
