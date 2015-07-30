<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%

	session.invalidate();
%>

<c:import url="article.do?curpage=1&usrid=${usrid}&action=page"></c:import>