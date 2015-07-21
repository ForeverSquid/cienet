<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.weikun.vo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.te{
		color:gray ;
	
	}

</style>
<script type="text/javascript">

	function go(){
		document.getElementById("username").value="";		
		
	}
	function ok(){	
		var username=document.getElementById("username").value;
		if(username==""||username=="请输入用户名"){
			alert('必须输入用户名！');			
			return false;
		}
		var pwd=document.getElementById("pwd").value;
		if(pwd==""){
			alert('必须输入密码！');
			
			return false;
		}
		
		var age=document.getElementById("age").value;
		if(age==""){
			alert('必须输入年龄！');
			
			return false;
		}
		var birth=document.getElementById("birth").value;
		if(birth==""){
			alert('必须输入出生日期！');
			
			return false;
		}
		if(!old()){
			alert('年龄错误,必须的范围是[0-129]');
			return false;
		}
		document.all.form1.submit();
	}
	function checkAge(e){
		var key= window.event?e.which:e.keyCode;//97 98
		var c=String.fromCharCode(key);//a b
		
		var t=/\d/;
		
		return t.test(c);

	}
	function old(){
		var age=document.getElementById("age").value;
		var t=/^(1[0-2]\d|\d{1,2})$/;
 		return t.test(age);
		
	}
</script>
</head>
<body>
	
	<%
		User user=(User)request.getAttribute("user");
		if(user==null){//
			
	%>
			<h1><span>增加用户</span></h1>
	<%		
		}else{
	%>
			<h1><span>修改用户</span></h1>
	<%		
			
		}
	
	%>
	<form id="form1" name="form1" method="post" action="opt.jsp">
		用户名：<input type="text" name="username" id="username" tabindex="1"
		value="<%=user==null?"请输入用户名":user.getUsername()%>" class="te" onfocus="go()" />
		<br/>
		<input type="hidden" name="action" value="<%=user==null?"add":"update1"%>">
		<input type="hidden" name="id" value="<%=user==null?"":user.getId()%>">
		密&nbsp;码：<input tabindex="2" type="password" name="pwd" id="pwd" value="<%=user==null?"":user.getPassword()%>" >
		<br/>
		年&nbsp;龄：<input tabindex="2" type="text" style="ime-mode:Disabled;"
		onkeypress="return checkAge(event)"  name="age" id="age" value="<%=user==null?"":user.getAge()%>" >
		<br/>
		出生日期：<input tabindex="2" type="date" name="birth" id="birth" value="<%=user==null?"":user.getBirth()%>" >
		<br/>
		<input type="button"  value="保存" id="btn" onclick="ok()"/>
	</form>
	
</body>
</html>