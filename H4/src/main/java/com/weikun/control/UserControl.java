package com.weikun.control;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserControl extends HttpServlet {
	private HashMap map=new HashMap();
	public static final String FIRST="first";
	public static final String SECOND="second";
	public  UserControl(){
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		map.put(FIRST, config.getInitParameter(FIRST));
		map.put(SECOND, config.getInitParameter(SECOND));
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub		
		System.out.println(req.getQueryString());
		System.out.println(req.getServletPath());
		String action =req.getParameter("action");
		RequestDispatcher dispatcher=null;
		if(action.equals(FIRST)){
			
			dispatcher=req.getRequestDispatcher(map.get(FIRST).toString());//first.jsp
			
		}else if(action.equals(SECOND)){
			dispatcher=req.getRequestDispatcher(map.get(SECOND).toString());//second.jsp
		}
		dispatcher.forward(req, resp);
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
}
