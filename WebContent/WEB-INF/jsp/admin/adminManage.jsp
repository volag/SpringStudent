<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String sysPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=sysPath+"/" %>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生评教系统</title>
<link href="css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<link href="css/bootstrap-responsive.min.css"
	rel="stylesheet" media="screen">
<link href="css/styles.css" rel="stylesheet" media="screen">
<link href="css/DT_bootstrap.css" rel="stylesheet"
	media="screen">
<script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<jsp:include page="/WEB-INF/jsp/include/admin-top.jsp" />
	</div>
	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/jsp/include/admin-left.jsp" />
			<!--/span-->
			<div class="span9" id="content">
				<div class="row-fluid">
					<div class="alert alert-success">
						<button type="button" class="close" data-dismiss="alert">&times;</button>
						<h4>Success</h4>
						The operation completed successfully
					</div>

					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">管理员管理</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<div class="table-toolbar">
									<div class="btn-group">
										<a href="admin/service/adminAdd"><button class="btn btn-success">
												Add New <i class="icon-plus icon-white"></i>
											</button></a>
									</div>
									<div class="btn-group pull-right">
										<button data-toggle="dropdown" class="btn dropdown-toggle">
											Tools <span class="caret"></span>
										</button>
										<ul class="dropdown-menu"><!-- 
											<li><a href="#">Print</a></li>
											<li><a href="#">Save as PDF</a></li>
											<li><a href="#">Export to Excel</a></li> -->
										</ul>
									</div>
								</div>

								<table cellpadding="0" cellspacing="0" border="0"
									class="table table-striped table-bordered" id="example2">
									<thead>
										<tr>
											<th>序号</th>
											<th>姓名</th>
											<th>性别</th>
											<th>工号</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										 <c:forEach items="${adminList}" var="data" varStatus="status">
										<tr>
											<td>${status.index+1}</td>
											<td>${data.realName}</td>
											<td>${data.sex}</td>
											<td>${data.userName}</td>
										    <td ><a href="admin/service/queryAdminById?id=${data.id}" data-toggle="modal"
												class="btn btn-primary">个人信息</a></td>
										</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<!-- /block -->
				</div>
			</div>
		</div>
	</div>
	<hr>
	<footer>
	<p>&copy; student assessment system 2018
	</footer>
	</div>
	<div id="myAlert" class="modal hide">
		<div class="modal-header">
			<button data-dismiss="modal" class="close" type="button">&times;</button>
			<h3 style="color: red">操作警告！</h3>
		</div>
		<div class="modal-body">
			<p>您是否要删除这条信息？</p>
		</div>
		<div class="modal-footer">
			<a data-dismiss="modal" class="btn btn-primary" href="#">确认</a> <a
				data-dismiss="modal" class="btn" href="#">取消</a>
		</div>
	</div>
	<script src="js/jquery-1.9.1.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.dataTables.min.js"></script>


	<script src="js/scripts.js"></script>
	<script src="js/DT_bootstrap.js"></script>
	<script>
		$(function() {

		});
		if('${msg}'!=''){
		  window.alert('${msg}');
        }
	</script>
</body>
</html>