package com.weikun.oracle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
public class A {
	@Test
	public void add(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "hr", "yst");
			
			String sql="insert into book(id,bookid,bookname) values(30,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "0099");
			pstmt.setString(2, "Java大全");
			System.out.println(pstmt.executeUpdate()>0?"成功":"失败");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			if(pstmt!=null){
				try {
					pstmt.close();
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
	
	
	@Test
	public void del(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "hr", "yst");
			
			String sql="delete from book where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 30);
		
			System.out.println(pstmt.executeUpdate()>0?"成功":"失败");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			if(pstmt!=null){
				try {
					pstmt.close();
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
	@Test
	public void update(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "hr", "yst");
			
			String sql="update  book set bookname=? where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "JSP大全");
			pstmt.setInt(2, 5);
		
			System.out.println(pstmt.executeUpdate()>0?"成功":"失败");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			if(pstmt!=null){
				try {
					pstmt.close();
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
	@Test
	public void query(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "hr", "yst");
			
			String sql="select * from book where bookname like ?";
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, "J%");
			rs=pstmt.executeQuery();
			while(rs.next()){
				
				System.out.println(rs.getString("bookname"));
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt!=null){
				try {
					pstmt.close();
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
