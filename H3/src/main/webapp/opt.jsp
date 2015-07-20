<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.weikun.service.*,com.weikun.vo.*"%>
<%
	String id=request.getParameter("id");
	IUserService service=new UserServiceImpl();
	User user=new User();
	user.setId(Integer.parseInt(id));
	if(service.del(user)){
		response.sendRedirect("success.jsp");
	}
%>