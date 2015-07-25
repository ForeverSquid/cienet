<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.weikun.service.*,com.weikun.vo.*,java.util.*"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>test</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<style type="text/css">
body {
	padding: 20px;
}
</style>
</head>

<body>


	<h2>用户管理</h2>
	<div>
		<a href="add.jsp">增加用户</a>
	</div>
	<table class="table table-striped table-bordered">
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>密码</th>
			<th>年龄</th>
			<th>生日</th>
			<th>操作</th>
		</tr>
		<%
			List <User> list=(List<User>)request.getAttribute("list");
			
			int i=1;
			for(User user :list){
				
			
		%>
		
		<tr>
			<td><%=i %></td>
			<td><%=user.getUsername() %></td>
			<td><%=user.getPassword() %></td>
			<td><%=user.getAge() %></td>
			<td><%=user.getBirth() %></td>
			<td><a href="user.do?id=<%=user.getId()%>&action=del">删除</a><a href="user.do?action=update&id=<%=user.getId()%>">修改</a></td>
		</tr>
		<%
			i++;
			}
		%>
		
	</table>


</body>
</html>
