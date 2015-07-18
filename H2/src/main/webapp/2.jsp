<%@ page language="java" import="java.sql.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>密码</th>
		</tr>
	<%	
		Class.forName("org.gjt.mm.mysql.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/test?useUnicode=true&characterEncoding=UTF-8", "root", "root");
		
		String sql="select * from user";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		int i=1;
		while(rs.next()){
			
	%>
		<tr>
			<td><%=i %></td>
			<td><%=rs.getString("username") %></td>
			<td><%=rs.getString("password") %></td>
		</tr>
	
	<%		
			i++;
		}
		rs.close();
		pstmt.close();
		conn.close();
	%>
	</table>
	
</body>
</html>