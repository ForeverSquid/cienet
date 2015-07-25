package com.weikun.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weikun.service.*;
import com.weikun.vo.User;


@WebServlet(name="UserControl",urlPatterns={"/user.do"})
public class UserControl extends HttpServlet {//Annoation
	private IUserService service=new UserServiceImpl();
	private User user=new User();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
	public List<User> queryUsers(){

		return service.query();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=req.getParameter("action");
		RequestDispatcher dispatcher=null;
		if(action.equals("del")){//删除

			String id=req.getParameter("id");

			user.setId(Integer.parseInt(id));
			if(service.del(user)){

				List<User> list=queryUsers();
				req.setAttribute("list", list);
				//
				dispatcher=req.getRequestDispatcher("success.jsp");
				dispatcher.forward(req, resp);

			}

		}else if(action.equals("add")){//增加
			//request.setCharacterEncoding("utf-8");
			String name=req.getParameter("username");
			String sex=req.getParameter("sex");
			System.out.println(sex);
			String name1=new String(name.getBytes("ISO8859-1"),"utf-8");

			user.setUsername(name1);
			user.setAge(Integer.parseInt(req.getParameter("age")));
			user.setPassword(req.getParameter("pwd"));
			user.setBirth(req.getParameter("birth"));
			if(service.add(user)){
				List<User> list=queryUsers();
				req.setAttribute("list", list);
				//
				dispatcher=req.getRequestDispatcher("success.jsp");
				dispatcher.forward(req, resp);
			}

		}else if(action.equals("update")){//查询
			//1需要把要修改的记录根据主键查询出来，把其值放到增加页面的各个文本框中			  
			String id=req.getParameter("id");			  
			user=service.queryById(Integer.parseInt(id));
			req.setAttribute("user", user);


			dispatcher=req.getRequestDispatcher("add.jsp");
			dispatcher.forward(req, resp);
		}else if(action.equals("update1")){//纯修改


			String name=req.getParameter("username");
			String name1=new String(name.getBytes("ISO8859-1"),"utf-8");

			user.setUsername(name1);
			user.setAge(Integer.parseInt(req.getParameter("age")));
			user.setPassword(req.getParameter("pwd"));
			user.setBirth(req.getParameter("birth"));
			user.setId(Integer.parseInt(req.getParameter("id")));

			if(service.update(user)){
				List<User> list=queryUsers();
				req.setAttribute("list", list);
				//
				dispatcher=req.getRequestDispatcher("success.jsp");
				dispatcher.forward(req, resp);

			}

		}else if(action.equals("login")){
			String username=req.getParameter("username");
			String pwd=req.getParameter("pwd");
			User user=new User();
			user.setUsername(username);
			user.setPassword(pwd);
			IUserService service=new UserServiceImpl();

			if(service.login(user)){//登录成功
				List<User> list=queryUsers();
				req.setAttribute("list", list);
				//
				dispatcher=req.getRequestDispatcher("success.jsp");
				dispatcher.forward(req, resp);

			}else{//登录失败			
				resp.sendRedirect("index.jsp");
			}
		}



	}
}
