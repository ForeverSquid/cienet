<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form action="action.do" method="post">
		post请求：<br>
		请输入你要查询的名字：<input type="text" name="searchInput"/><br>
		<input type="submit" value="查询">
	</form>
	<br>----------------------------------------------------------------------
	<form action="action.do" method="get">
		get请求：<br>
		请输入你要查询的名字：<input type="text" name="searchInput"/><br>
		<input type="submit" value="查询">
	</form>
</body>
</html>
