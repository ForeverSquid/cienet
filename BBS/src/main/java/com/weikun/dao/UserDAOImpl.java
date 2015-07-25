/**
 * 
 */
package com.weikun.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.weikun.db.DBCPDB;
import com.weikun.vo.BBSUser;

/**
 * @author Administrator
 *
 */
public class UserDAOImpl implements IUserDAO {
	private Connection conn;
	public UserDAOImpl(){
		
		conn=DBCPDB.getConnection();
	}

	/* (non-Javadoc)
	 * @see com.weikun.dao.IUserDAO#login(com.weikun.vo.BBSUser)
	 */
	@Override
	public BBSUser login(BBSUser user) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		BBSUser user1=null;
		try {
			String sql="select * from bbsuser where username=? and password=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			
			rs=pstmt.executeQuery();
			if(rs.next()){
				user1=new BBSUser();
				user1.setUsername(rs.getString("username"));
				user1.setId(rs.getInt("id"));
				user1.setPassword(rs.getString("password"));
				user1.setPagenum(rs.getInt("pagenum"));
			}
			
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
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return user1;
	}

	@Override
	public InputStream getPic(int id) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		InputStream is=null;
		try {
			String sql="select pic from bbsuser where id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
		
			
			rs=pstmt.executeQuery();
			
			
			if(rs.next()){
				is=rs.getBinaryStream("pic");
				
				
			}
			
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
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return is;
		
	}

	@Override
	public boolean register(BBSUser user) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=null;
		boolean flag=false;
		
		try {
			String sql="insert into bbsuser(id,username,password,pagenum) values(?,?,?,5)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, getMaxId());
			pstmt.setString(2, user.getUsername());
			pstmt.setString(3, user.getPassword());
			
			
			flag=pstmt.executeUpdate()>0?true:false;
			
			
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
			
		}
		
		return flag;
	}

	private int getMaxId() {
		// TODO Auto-generated method stub
		
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		int id=0;
		try {
			String sql="select max(id) id from bbsuser ";
			pstmt=conn.prepareStatement(sql);
			
			
			rs=pstmt.executeQuery();
			if(rs.next()){
				id=rs.getInt("id");
			}
			
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
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return ++id;
		
		
	}

}
