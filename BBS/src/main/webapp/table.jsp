<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="contentwrapper">
	<div class="main_content">
		<%@include file="top.jsp" %>

		
		<div class="row-fluid">
			<div class="span12">
				<h3 class="heading">快来灌水</h3>

					
					<c:if test="${!empty sessionScope.bbsuser}">
					
						<div class="alert alert-error">
							<a class="close" data-dismiss="alert">×</a> <strong>欢迎你${sessionScope.bbsuser.username}</strong>
							
						</div>
					</c:if>

					<div class="btn-group sepH_b">
						<button data-toggle="dropdown" class="btn dropdown-toggle">
							行数 <span class="caret"></span>
						</button>
						<ul class="dropdown-menu">


							<li><a href="UserControl?action=page&row=5&userid=${uid}">默认5行</a></li>
							<li><a href="UserControl?action=page&row=10&userid=${uid}">每页10行</a></li>
							<li><a href="UserControl?action=page&row=2&userid=${uid}">每页2行</a></li>
						</ul>
					</div>


				


				<table class="table table-bordered table-striped table_vam"
					id="dt_gal">
					<thead>
					
						<tr>

							<th class="table_checkbox">序号</th>
							<th style="width: 50px">发布人</th>
							<th style="width: 100px">主帖标题</th>
							<th style="width: 420px">主帖内容</th>
							<th style="width: 60px">发布日期</th>
							<th style="width: 60px">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:set value="${requestScope.pb}" var="pb"></c:set>
						<c:forEach items="${requestScope.pb.data}" var="article" varStatus="status">
								
								<tr>
									<td>${status.count}</td>
									<td><a href="upload/.jpg"
										
										title="" class="cbox_single thumbnail">

											<img src="user.do?id=${article.user.id}&action=pic"
											alt="" style="height: 50px; width: 50px" />

									</a>
									
									
									
									</td>
									<td>
										
									
									<a
										href=""><b>${article.title}</b></a>
										
									
									
									
									
									
									
									</td>
									<td>${article.content}</td>
									<td>${article.datetime}</td>
									<td>
											
										<!-- 没登陆，游客 uid=0 -->
												
											<!-- 锚点传值 -->
											<a href="" title="灌水" data-toggle="modal"
											id="myp" data-backdrop="static"
											onclick="rshow(${data.id},${uid},${data.user.id});">
												 <i class="icon-eye-open"></i>
											
											</a>

											
										
											<!-- 是本人贴可以删除和修改 -->
											
											<a
												href=""
												title="删除本帖"><i class="icon-trash"></i></a>

										
										
										
									</td>
										
								</tr>
							</c:forEach>
					</tbody>
				</table>



			</div>
		</div>
		
		<c:if test="${pb.maxPage>1}">
			<%@include file="page.jsp"%>
		</c:if>
		
			
		

	</div>


</div>