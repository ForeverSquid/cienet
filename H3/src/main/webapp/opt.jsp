<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.weikun.service.*,com.weikun.vo.*"%>
<%
  String action=request.getParameter("action");

  IUserService service=new UserServiceImpl();
  User user=new User();
  if(action.equals("del")){//删除
	  
	    String id=request.getParameter("id");
		
		user.setId(Integer.parseInt(id));
		if(service.del(user)){
			response.sendRedirect("success.jsp");
		}
	  
  }else if(action.equals("add")){//增加
	  //request.setCharacterEncoding("utf-8");
	  String name=request.getParameter("username");
  	  String name1=new String(name.getBytes("ISO8859-1"),"utf-8");
  	  
	  user.setUsername(name1);
	  user.setAge(Integer.parseInt(request.getParameter("age")));
	  user.setPassword(request.getParameter("pwd"));
	  user.setBirth(request.getParameter("birth"));
	  if(service.add(user)){
		  response.sendRedirect("success.jsp");
	  }
	  
  }else if(action.equals("update")){//查询
	  //1需要把要修改的记录根据主键查询出来，把其值放到增加页面的各个文本框中
	  
	  String id=request.getParameter("id");
	  
	  user=service.queryById(Integer.parseInt(id));
	  request.setAttribute("user", user);
	  
%>
	<jsp:forward page="add.jsp"></jsp:forward>
<%  
	  
	  
  }else if(action.equals("update1")){//纯修改
	  
	  
	  String name=request.getParameter("username");
  	  String name1=new String(name.getBytes("ISO8859-1"),"utf-8");
  	  
	  user.setUsername(name1);
	  user.setAge(Integer.parseInt(request.getParameter("age")));
	  user.setPassword(request.getParameter("pwd"));
	  user.setBirth(request.getParameter("birth"));
	  user.setId(Integer.parseInt(request.getParameter("id")));
	  
	  if(service.update(user)){
		  response.sendRedirect("success.jsp");
		  
	  }
	  
  }
	
%>