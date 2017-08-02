<%@ page language="java" import="java.util.*,com.cienet.ebo.Ebo" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'second.jsp' starting page</title>

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
	<%
		List<Ebo> list = (List<Ebo>)session.getAttribute("list");
	%>
	<%
		for(int i = 0 ;i <list.size();i++){
	%>
		您搜索的人的信息如下<br>
		id:<%=list.get(i).getId() %><br>
		姓名：<%=list.get(i).getUsername() %><br>
		性别：<%=list.get(i).getSex() %><br>
		年龄：<%=list.get(i).getAge() %><br>
		账号：<%=list.get(i).getAccount() %><br>
	<%		
		}
	%>
</body>
</html>
