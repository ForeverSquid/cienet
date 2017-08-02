package com.cienet.dlo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cienet.ebo.Ebo;
import com.cienet.service.DB;

public class Dlo {

	public List<Ebo> search(String name) {
		// TODO Auto-generated method stub
		String sql="select *  from usertable where name = ?";
		Connection conn=DB.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Ebo> list = new ArrayList<Ebo>();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next()){
				Ebo user=new Ebo();
				user.setAccount(rs.getInt("account"));
				user.setAge(rs.getInt("age"));
				user.setId(rs.getInt("id"));
				user.setPassword(rs.getString("password"));
				user.setUsername(rs.getString("username"));
				user.setSex(rs.getString("sex"));
				list.add(user);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}

			DB.closeConnection();
		}	


		return list;
	}
}
