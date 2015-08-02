<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		String s="我的名字是："+request.getParameter("name");
		out.print(s);
		out.print("咱们的服务器时间是:"+new Date());
	
	%>
