package com.weikun.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class A {
	@Test
	public void update(){
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/test?useUnicode=true&characterEncoding=utf-8", "root", "root");
			
			String sql="update user set username=? ,password=? where id=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "麦克");	
			pstmt.setString(2, "888");	
			pstmt.setInt(3, 1243);			
				
			
			System.out.println(pstmt.executeUpdate()>0?"true":"false");
			
			
			
			
		} catch (Exception e) {
			// TODO: handl exception
			e.printStackTrace();
		}finally{
			
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Test
	public void del(){
		
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/test?useUnicode=true&characterEncoding=utf-8", "root", "root");
			
			String sql="delete from user where id=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 1248);			
				
			
			System.out.println(pstmt.executeUpdate()>0?"true":"false");
			
			
			
			
		} catch (Exception e) {
			// TODO: handl exception
			e.printStackTrace();
		}finally{
			
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void add(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/test?useUnicode=true&characterEncoding=utf-8", "root", "root");
			
			String sql="insert into user(username,password) values(?,?)";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "李威");
			
			pstmt.setString(2, "999");			
			
			System.out.println(pstmt.executeUpdate()>0?"true":"false");
			
			
			
			
		} catch (Exception e) {
			// TODO: handl exception
			e.printStackTrace();
		}finally{
			
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void query(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver");//1加内存
			//2连接驱动
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/test?useUnicode=true&characterEncoding=utf-8", "root", "root");
			//3执行sql
			String sql="select * from  user";
			
			pstmt=conn.prepareStatement(sql);
			
			rs=pstmt.executeQuery();//4遍历结果集
			
			while(rs.next()){
				
				System.out.println(rs.getString("username")+"--"+rs.getInt("id"));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();//5关闭
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//5关闭
		}
		
		
	}
	
	
}
