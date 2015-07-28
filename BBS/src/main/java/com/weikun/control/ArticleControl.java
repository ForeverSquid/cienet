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
		int curPage=Integer.parseInt(request.getParameter("curpage"));
		String userid=request.getParameter("usrid");
		PageBean pb=service.queryArticles(curPage,userid);
		
		RequestDispatcher dispatcher=null;
		request.setAttribute("pb", pb);
		try {
			dispatcher=request.getRequestDispatcher("show.jsp");
			dispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
