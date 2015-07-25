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
		int count=0;
		if(application.getAttribute("x")==null){//没有x这个值
			//原始值
			application.setAttribute("x",Integer.parseInt(application.getInitParameter("count")) );
			
		}else{
			count=Integer.parseInt(application.getAttribute("x").toString());			
			count++;
			application.setAttribute("x",count);
		}
		
		String sc=String.valueOf(count) ;
		char [] cs=sc.toCharArray();
	%>
		你是第
	<%	
		for(char c :cs){
	%>
		<img alt="" src="images/<%=c %>.gif">
    <%
			
		}
		
	%>
	 位访客！
</body>
</html>