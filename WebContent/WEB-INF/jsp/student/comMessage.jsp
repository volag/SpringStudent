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
<link href="css/bootstrap.min.css?v=1" rel="stylesheet"
	media="screen">
<link href="css/bootstrap-responsive.min.css?v=1"
	rel="stylesheet" media="screen">
<link href="css/styles.css?v=1" rel="stylesheet" media="screen">
<link href="css/DT_bootstrap.css?v=1" rel="stylesheet"
	media="screen">
<script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>

	<div class="navbar navbar-fixed-top">
		<jsp:include page="/WEB-INF/jsp/include/student-top.jsp" />
	</div>

	<div class="container-fluid">

		<div class="row-fluid">
			<jsp:include page="/WEB-INF/jsp/include/student-left.jsp" />

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
							<div class="muted pull-left">评教列表</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<table cellpadding="0" cellspacing="0" border="0"
									class="table table-striped table-bordered" id="example">
									<thead>
										<tr>
											<th>编号</th>
											<th>课程名</th>
											<th class="sorting">授课老师</th>
											<th>操作</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>高等数学</td>
											<td>张三</td>
											<td><a href="studentAssess" data-toggle="modal"
												class="btn btn-primary">评教</a>
												<a href="studentAssess" data-toggle="modal"
												class="btn btn-primary">查看</a></td>
										</tr>
										<tr>
											<td>2</td>
											<td>王二</td>
											<td>Thornton</td>
											<td><a href="#myAlert" data-toggle="modal"
												class="btn btn-primary">评教</a>
												<a href="studentAssess" data-toggle="modal"
												class="btn btn-primary">查看</a></td>
										</tr>
										<tr>
											<td>3</td>
											<td>计算机组成原理</td>
											<td>赵六</td>
											<td><a href="#myAlert" data-toggle="modal"
												class="btn btn-primary">评教</a>
												<a href="studentAssess" data-toggle="modal"
												class="btn btn-primary">查看</a></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	<hr>
	<footer>
	<p>
		&copy; student assessment system 2018 
	</footer>
	</div>
	<script src="js/jquery-1.9.1.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.dataTables.min.js"></script>


	<script src="js/scripts.js"></script>
	<script src="js/DT_bootstrap.js"></script>
	<script>
		$(function() {
			  // Easy pie charts
            $('.chart').easyPieChart({animate: 1000});
		});
	</script>
</body>

</html>