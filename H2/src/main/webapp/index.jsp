<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	
	<%!
		public static final String name="MIKE";
		public int go(){
		
			return 1+2;
		}
	
	%>
	
	<%
		
		for(int i=0;i<10;i++){
			if(i%2==0){	
	%>
				<font color='red'>HelloWorld!</font><%=go() %><br/>	
	<% 		}else{
	%>
	
				<font color='blue'>HelloWorld!</font><%=i %><%=name %><br/>	
	<%		}
		}
	
	%>
	
	
	
	
</body>
</html>