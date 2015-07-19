<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:useBean id="animal" class="com.weikun.vo.Animal">
	
		<jsp:setProperty property="*" name="animal" />
	
	</jsp:useBean>
	
	<jsp:getProperty property="name" name="animal"/>
	<jsp:getProperty property="sex" name="animal"/>
	<jsp:getProperty property="old" name="animal"/>
</body>
</html>