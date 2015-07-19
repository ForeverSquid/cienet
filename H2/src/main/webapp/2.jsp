<%@ page language="java" import="java.sql.*,com.weikun.vo.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ include file="jsp/header.jsp"%>
<jsp:include page="jsp/header.jsp"></jsp:include>
	<table>
		<tr>
			<th>序号</th>
			<th>用户名</th>
			<th>密码</th>
		</tr>
		<jsp:useBean id="a" class="com.weikun.vo.Animal"></jsp:useBean>
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
	


<%@ include file="jsp/footer.jsp"%>
<%=k %>








