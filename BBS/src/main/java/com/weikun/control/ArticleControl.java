package com.weikun.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weikun.service.ArticleServiceImpl;
import com.weikun.service.IArticleService;
import com.weikun.vo.Article;
import com.weikun.vo.BBSUser;
import com.weikun.vo.PageBean;

/**
 * Servlet implementation class ArticleControl
 */
@WebServlet(name="ArticleControl",urlPatterns={"/article.do"})
public class ArticleControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IArticleService service=new ArticleServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		String action=request.getParameter("action");
		RequestDispatcher dispatcher=null;
		if(action.equals("page")){
			
			int curPage=Integer.parseInt(request.getParameter("curpage"));
			String userid=request.getParameter("usrid");
			PageBean pb=service.queryArticles(curPage,userid);
			
			
			request.setAttribute("pb", pb);
			try {
				dispatcher=request.getRequestDispatcher("show.jsp");
				dispatcher.forward(request, response);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}else if(action.equals("delz")){//删除主贴
			int id=Integer.parseInt(request.getParameter("id"));//主贴id
			if(service.delArticle(id)){
				//article.do?curpage=1&usrid=${usrid}&action=page
				try {
					BBSUser user=(BBSUser)request.getSession().getAttribute("bbsuser");
							
					dispatcher=request.getRequestDispatcher("article.do?curpage=1&usrid="+user.getId()+"&action=page");
					dispatcher.forward(request, response);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}else if(action.equals("addz")){//增加主贴
			Article a=new Article();			
			String title=request.getParameter("title");
			String content=request.getParameter("content");
			a.setTitle(title);
			a.setContent(content);
			a.setRootid(0);
			BBSUser user=(BBSUser)request.getSession().getAttribute("bbsuser");
			a.setUser(user);
			if(service.addArticle(a)){
				try {
					
							
					dispatcher=request.getRequestDispatcher("article.do?curpage=1&usrid="+user.getId()+"&action=page");
					dispatcher.forward(request, response);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		
		}
		
	}

}
