<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>中文</h1>
	<%
		out.println(request.getMethod());
		out.println(request.getQueryString());
		
	%>
		<%
			out.println(request.getParameter("old"));
			
			out.println(java.net.URLDecoder.decode(request.getParameter("name"), "utf-8"));
		%>
</body>
</html>