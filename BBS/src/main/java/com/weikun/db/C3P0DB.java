package com.weikun.db;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0DB {
	private static  DataSource ds;
	private static Connection conn;
	private static ComboPooledDataSource cd;
	static{
		cd=new ComboPooledDataSource("oracle");
		
		
		
	}
	public static Connection getConnection(){
		
		try {
			conn=cd.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
