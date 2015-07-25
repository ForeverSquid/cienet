package com.weikun.control;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weikun.service.IUserService;
import com.weikun.service.UserServiceImpl;
import com.weikun.vo.BBSUser;

@WebServlet(name="UserControl",urlPatterns={"/user.do"},
initParams={@WebInitParam(name="success",value="/")})
public class UserControl extends HttpServlet {
	private IUserService service=new UserServiceImpl();
	private HashMap map=new HashMap();
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
		String action=req.getParameter("action");//分割是注册还是登录
		RequestDispatcher dispatcher=null;
		BBSUser user=new BBSUser();
		if(action.equals("login")){
			
			user.setUsername(req.getParameter("username"));
			user.setPassword(req.getParameter("password"));
			user=service.login(user);
			if(user!=null){
				//操作cookie
				
				if(req.getParameter("sun")!=null){//勾上
					Cookie uc=new Cookie("http://bbs/username",user.getUsername());
					Cookie up=new Cookie("http://bbs/password",user.getPassword());
					
					resp.addCookie(uc);
					resp.addCookie(up);
				}
				
				//把用户名保存到
				req.getSession().setAttribute("bbsuser", user);
				
				//转向到主页
				dispatcher=req.getRequestDispatcher(map.get("success").toString());
				dispatcher.forward(req, resp);
				
			}
		}else if(action.equals("register")){//注册，
			
			
			
		}else if(action.equals("pic")){//显示头像
			int id=Integer.parseInt(req.getParameter("id"));
			InputStream is=service.getPic(id);
			ServletOutputStream sos=resp.getOutputStream();
			
			byte[] buffer=new byte[1024];
			int n=-1;
			
			while((n=is.read(buffer))!=-1){
				
				sos.write(buffer, 0, n);
			}
			is.close();
			sos.flush();
			sos.close();
			
			
		}
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		map.put("success", config.getInitParameter("success"));
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
}
