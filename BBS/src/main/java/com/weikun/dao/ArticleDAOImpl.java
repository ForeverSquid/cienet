package com.weikun.dao;

import java.io.StringReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
import com.weikun.vo.ReArticle;

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
			String uid=usrid.equals("")?"999":usrid;
			cs.setInt(2, Integer.parseInt(uid));
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

	@Override
	public boolean delArticle(int id) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=null;
		boolean flag=false;
		try {
			String sql="delete from article where id=? or rootid=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, id);
			pstmt.setInt(2, id);
			flag=pstmt.executeUpdate()>0?true:false;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public boolean addArticle(Article article) {
		// TODO Auto-generated method stub
		
		
		PreparedStatement pstmt=null;
		boolean flag=false;
		try {
			String sql="insert into article(id,title,rootid,content,datetime,userid) "
					+ "values(?,?,?,?,sysdate,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, getMaxId());
			
			pstmt.setString(2, article.getTitle());
			pstmt.setInt(3, article.getRootid());
			StringReader reader=new StringReader(article.getContent());
			pstmt.setCharacterStream(4, reader,article.getContent().length());
			
			
			
			pstmt.setInt(5, article.getUser().getId());
			
			flag=pstmt.executeUpdate()>0?true:false;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	private int getMaxId() {
		// TODO Auto-generated method stub
		int count=0;
		
		String sql="{?=call GETMAXID()}";
		CallableStatement cs=null;
		
		
		try {
			cs=conn.prepareCall(sql);		
			cs.registerOutParameter(1, java.sql.Types.NUMERIC);	
			cs.execute();
			count=cs.getInt(1);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				
				cs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return count+1; 
	}
	private String queryTitle(int id) {//查询主贴的title
		
		PreparedStatement pstmt=null;
		String sql="select title from article where id=?";
		ResultSet rs=null;
		String title="";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()){
				title=rs.getString("title");
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
			
			
		
		return title;
	
		
	}
	@Override
	public ReArticle queryCT(int id) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=null;
		List<Article> list=new ArrayList<Article>();
		ResultSet rs=null;
		ReArticle re=new ReArticle();
		try {
			String sql=
           
           "select a.userid userid , "+
                                "b.username username, "+
                                "b.pic pic, "+
                               " b.id bid, "+
                               " a.rootid, "+
                              "  a.title, "+
                              "  a.datetime, "+
                               " a.content, "+
                               " a.id aid "+
                               
                " from article a "+
                " join bbsuser b on(a.userid=b.id) "+
                " where a.rootid=?  "+
               "  order by a.id desc  ";
       
         
   
   
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			
			
			
			rs=pstmt.executeQuery();
			
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
			
				user.setUsername(rs.getString("username"));
				
				user.setId(rs.getInt("userid"));
				
				a.setUser(user);
				
				list.add(a);
				
			}
			re.setTitle(queryTitle(id));
			
			
			re.setList(list);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
		return re;
	}

}
