<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		response.sendRedirect("http://www.baidu.com");
	%>
	<script type="text/javascript">
		window.location='http://www.baidu.com';
	
	</script>
	<a href="http://www.baidu.com">baidu</a>
</body>
</html>