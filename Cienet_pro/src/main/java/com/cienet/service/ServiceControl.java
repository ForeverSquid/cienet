package com.cienet.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cienet.ebo.Ebo;
import com.cienet.proxy.Proxy;

@WebServlet(name="ServiceControl",urlPatterns="/do")
public class ServiceControl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ServiceControl() {
		super();
	}

	public void destroy() {
		super.destroy(); 

	}

	public void doDelete(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher=null;
		Proxy pr = new Proxy();
		String name = request.getParameter("searchInput");
		List<Ebo> ebo = pr.search(name);
		request.getSession().setAttribute("list", ebo);
		dispatcher=request.getRequestDispatcher("/second.jsp".toString());
		dispatcher.forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher=null;
		Proxy pr = new Proxy();
		String name = request.getParameter("searchInput");
		List<Ebo> ebo = pr.search(name);
		request.getSession().setAttribute("list", ebo);
		dispatcher=request.getRequestDispatcher("/second.jsp".toString());
		dispatcher.forward(request, response);
	}

	public void init() throws ServletException {

	}

}
