package com.weikun.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weikun.service.CityService;

@WebServlet(name="CityControl",urlPatterns={"/city"})
public class CityControl extends HttpServlet {
	private CityService service =new CityService();
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
		String pro=req.getParameter("pro");
		
		String citys=service.getCitys(pro);
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		
		PrintWriter out=resp.getWriter();
		
		out.println(citys);
		out.flush();
		out.close();
		
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
