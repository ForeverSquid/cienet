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
		RequestDispatcher dispatcher=null;
		BBSUser user=new BBSUser();
		String ct=req.getContentType();
		//null 没分号 有分号
		if(ct!=null&&ct.indexOf(";")!=-1){
			String value=ct.substring(0,ct.indexOf(";"));
			if(value.trim().equals("multipart/form-data")){//以文件上传的形式提交，因此一定是注册
				
					
				user=service.uploadPic(req);
					
				if(service.register(user)){
					dispatcher=req.getRequestDispatcher(map.get("success").toString());
					dispatcher.forward(req, resp);
				}
					
					
				return ;
			}
			
		}
		
		
		String action=req.getParameter("action");//分割是注册还是登录
		
	
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
				req.setAttribute("msg", "欢迎你：");
				dispatcher.forward(req, resp);
				
			}else{//登录失败
				
				req.getSession().removeAttribute("bbsuser");
				dispatcher=req.getRequestDispatcher(map.get("success").toString());
				req.setAttribute("msg", "你是非法用户！");
				
				
				dispatcher.forward(req, resp);
				
			}
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
