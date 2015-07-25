package com.weikun.oracle;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

import org.junit.Test;

public class B {
	@Test
	public void function(){
		
		Connection conn=null;
		CallableStatement  cs=null;
		ResultSet rs=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "hr", "yst");
			String sql=" {?=call f_35(?)}  ";			
			cs=conn.prepareCall(sql);
			cs.registerOutParameter(1, OracleTypes.CURSOR);
			cs.setString(2, "J%");
			
			cs.executeUpdate();
			
			rs=(ResultSet)cs.getObject(1);
			
			while(rs.next()){
				System.out.println(rs.getString("bookname"));
			}
			
			
		}catch (Exception e) {
			// TODO: handl exception
			e.printStackTrace();
		}finally{
			
			try {
				rs.close();
				cs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	@Test
	public void procedure(){
		
		Connection conn=null;
		CallableStatement  cs=null;
		ResultSet rs=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "hr", "yst");
			String sql=" call p_35(?,?)  ";			
			cs=conn.prepareCall(sql);
			cs.setString(1, "J%");
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.executeUpdate();
			
			rs=(ResultSet)cs.getObject(2);
			
			while(rs.next()){
				System.out.println(rs.getString("bookname"));
			}
			
			
		}catch (Exception e) {
			// TODO: handl exception
			e.printStackTrace();
		}finally{
			
			try {
				rs.close();
				cs.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
