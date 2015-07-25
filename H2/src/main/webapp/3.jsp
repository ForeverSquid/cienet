<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.weikun.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Animal a=new Animal();
		a.setName("狗");
	%>
	
	<%=a.getName()
	
	%>
	
	<jsp:useBean id="a1" class="com.weikun.vo.Animal"></jsp:useBean>
	<jsp:setProperty property="name" value="猫" name="a1"/>
	<jsp:getProperty property="name" name="a1"/>
	
</body>
</html>