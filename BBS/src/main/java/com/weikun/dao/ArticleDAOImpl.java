package com.weikun.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.druid.pool.DruidPooledConnection;
import com.weikun.db.C3P0DB;
import com.weikun.db.DruidDB;
import com.weikun.vo.Article;
import com.weikun.vo.BBSUser;
import com.weikun.vo.PageBean;

public class ArticleDAOImpl implements IArticleDAO {
	private Connection conn;
	public ArticleDAOImpl(){
		
		conn=C3P0DB.getConnection();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.weikun.dao.IArticleDAO#queryArticles(int)
	 * curPage:当前页码
	 */
	@Override
	public PageBean queryArticles(int curPage,String usrid) {
		// TODO Auto-generated method stub
		List<Article> list=new ArrayList<Article>();
		String sql="call P_120(?,?,?,?,?,?)";
		CallableStatement cs=null;
		ResultSet rs=null;
		PageBean pb=new PageBean();
		try {
			cs=conn.prepareCall(sql);
			cs.setInt(1, curPage);//当前页
			cs.setInt(2, Integer.parseInt(usrid));
			cs.registerOutParameter(3, java.sql.Types.NUMERIC);//最大行数
			cs.registerOutParameter(4, java.sql.Types.NUMERIC);//最大页数
			cs.registerOutParameter(5, java.sql.Types.NUMERIC);//每页的行数
			cs.registerOutParameter(6, oracle.jdbc.OracleTypes.CURSOR);
			
			
			
			cs.execute();
			pb.setMaxRowCount(cs.getInt(3));//
			pb.setMaxPage(cs.getInt(4));
			pb.setCurPage(curPage);
			
			
			rs=(ResultSet)cs.getObject(6);
			pb.setRowsPerPage(cs.getInt(5));
			
			while(rs.next()){
				Article a=new Article();
				a.setId(rs.getInt("aid"));
				a.setTitle(rs.getString("title"));
				a.setContent(rs.getString("content"));
				a.setRootid(rs.getInt("rootid"));
				Date d=rs.getDate("datetime");
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
						
				a.setDatetime(sdf.format(d));
				BBSUser user=new BBSUser();
				user.setId(rs.getInt("bid"));
				user.setPagenum(rs.getInt("pnum"));
				user.setUsername(rs.getString("username"));
				
				user.setId(rs.getInt("userid"));
				
				a.setUser(user);
				
				list.add(a);
			}
			
			pb.setData(list);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				cs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return pb;
	}

}
