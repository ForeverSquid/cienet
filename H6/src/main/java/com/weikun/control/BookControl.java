package com.weikun.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weikun.service.BookService;
import com.weikun.vo.Book;

/**
 * Servlet implementation class BookControl
 */
@WebServlet(name="BookControl",urlPatterns={"/book"})
public class BookControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String,Book> map=new HashMap<String,Book>();
	private BookService service=new BookService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookControl() {
        super();
        // TODO Auto-generated constructor stub
        
        map.put("1", new Book(1,20,"JAVA","images/photo4.jpg"));
        map.put("2", new Book(2,30,"JSP","images/photo5.jpg"));
        map.put("3", new Book(3,40,"C++","images/photo6.jpg"));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub'
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String index=request.getParameter("index");//书的索引号
		Book b=map.get(index);
		
		response.setContentType("text/xml");
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		
		out.print(service.getBook(b));
		
		out.flush();
		out.close();
		
		
	}

}
