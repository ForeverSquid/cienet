<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.weikun.service.*,com.weikun.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<%
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		User user=new User();
		user.setUsername(username);
		user.setPassword(pwd);
		IUserService service=new UserServiceImpl();
		
		if(service.login(user)){//登录成功
			
			response.sendRedirect("success.jsp");
			
		}else{//登录失败			
			response.sendRedirect("index.jsp");
		}
	
	%>
	
	
	
	
	
</body>
</html>