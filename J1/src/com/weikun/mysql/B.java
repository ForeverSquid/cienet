package com.weikun.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class B {
	
	@Test
	public void pro(){
		
		Connection conn=null;
		CallableStatement cs=null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/test?useUnicode=true&characterEncoding=utf-8", "root", "root");
			String sql=" call p_19(?)";
			cs=conn.prepareCall(sql);			
			cs.setString(1, "Œ‰%");
			boolean flag=cs.execute();
			
			while(flag){
				
				ResultSet rs=cs.getResultSet();
				
				while(rs.next()){
					System.out.println(rs.getString("username")+rs.getString("password"));
					
					
				}
				
				
				flag=cs.getMoreResults();
				
			}
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			if(cs!=null){
				try {
					cs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn!=null){
				try {
					
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
	}
		
	
}
