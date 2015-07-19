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
		request.setAttribute("errpr", "error");
		session.setAttribute("vip", "MKL");
	
	%>
	<form id="form1" action="8.jsp" method="post">
		<input type="text" name="username"><br/>
		<input type="password" name="pwd"><br/>
		男<input type="radio" name="sex" value="male">
		女<input type="radio" name="sex" value="female">
		你喜欢的女星
		
		泰勒<input type="checkbox" name="star" value="tl"/>
		斯嘉丽<input type="checkbox" name="star" value="sjl"/>
		
		<input type="submit" value="提交">
	
	</form>
</body>
</html>