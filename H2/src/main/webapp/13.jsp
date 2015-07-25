<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<jsp:include page="14.jsp"></jsp:include>
	<table>
		<tr>
			<td></td>
		</tr>
	
	</table>
	<%=
		pageContext.getAttribute("p1")
		
	%>
	<%=
		pageContext.getRequest().getAttribute("r1")
		
	%>
	<%
		pageContext.getServletContext().setAttribute("a1","application1");
	
		
	
	%>
	<a href="15.jsp">15.jsp</a>
</body>
</html>