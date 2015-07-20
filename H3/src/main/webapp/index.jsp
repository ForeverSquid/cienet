<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function ok(){
		var username=document.getElementById("username").value;
		if(username==""){
			alert('必须输入用户名！');
			
			return false;
		}
		var pwd=document.getElementById("pwd").value;
		if(pwd==""){
			alert('必须输入密码！');
			
			return false;
		}
		
		document.all.form1.submit();//form1提交
	}


</script>
</head>
<body>
	<form id="form1" name="form1" action="check.jsp" method="post">
		<span>用户名：</span><input type="text" name="username" id="username"/><br/>
		<span>密码：</span><input type="text" name="pwd" id="pwd"/><br/>
		<input type="button" value="提交" onclick="ok()">
	
	</form>
</body>
</html>