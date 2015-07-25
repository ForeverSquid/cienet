package com.weikun.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseControl
 */
public class BaseControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		//2
	}
    public BaseControl() {
        // TODO Auto-generated constructor stub
    	//1
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//3
		this.doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//3
		
		response.setContentType("text/html");
		
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out=response.getWriter();
		
		
		out.print("<h1><b><font color='red'>我爱你！</font></b></h1>");
		
		out.flush();
		out.close();
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		//4
	}

}
