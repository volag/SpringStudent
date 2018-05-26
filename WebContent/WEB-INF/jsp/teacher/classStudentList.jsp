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
<title>教师评教</title>
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
		<jsp:include page="/WEB-INF/jsp/include/teacher-top.jsp" />
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/jsp/include/teacher-left.jsp" />
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
							<div class="muted pull-left">XX班级学生列表</div>
						</div>
						<div class="block-content collapse in">

							<div class="span12">

								<table cellpadding="0" cellspacing="0" border="0"
									class="table table-striped table-bordered" id="example">
									<thead>
										<tr>
											<th>编号</th>
											<th>姓名</th>
											<th>性别</th>
											<th>学号</th>

										</tr>
									</thead>
									<tbody>
										<tr >
											<td>1</td>
											<td>
												<a style="color: red" href="">张三</a>
											</td>
											<td>男</td>
											<td class="center">15201101</td>
										</tr>
										<tr class="odd gradeX">
											<td>2</td>
											<td><a style="color: red" href="">王二</a></td>
											<td>男</td>
											<td class="center">15201102</td>

										</tr>
										<tr >
											<td>3</td>
											<td><a style="color: red" href="">赵六</a></td>
											<td>男</td>
											<td class="center">15201103</td>

										</tr>
										<tr>
											<td>4</td>
											<td><a style="color: red" href="">王五</a></td>
											<td>男</td>
											<td class="center">15201104</td>

										</tr>
										<tr >
											<td>5</td>
											<td><a style="color: red" href="">汉为</a></td>
											<td>男</td>
											<td class="center">15201105</td>

										</tr>
										<tr >
											<td>6</td>
											<td><a style="color: red" href="">刘是</a></td>
											<td>男</td>
											<td class="center">15201106</td>

										</tr>
										<tr >
											<td>7</td>
											<td><a style="color: red" href="">李玩</a></td>
											<td>男</td>
											<td class="center">15201107</td>

										</tr>
										<tr >
											<td>8</td>
											<td><a style="color: red" href="">小明</a></td>
											<td>男</td>
											<td class="center">15201108</td>

										</tr>
										<tr >
											<td>9</td>
											<td><a style="color: red" href="">小王</a></td>
											<td>男</td>
											<td class="center">15201109</td>

										</tr>
										<tr >
											<td>10</td>
											<td><a style="color: red" href="">小吴</a></td>
											<td>男</td>
											<td class="center">15201110</td>

										</tr>
										<tr>
											<td>11</td>
											<td><a style="color: red" href="">小李</a></td>
											<td>男</td>
											<td class="center">15201111</td>

										</tr>
										<tr >
											<td>12</td>
											<td><a style="color: red" href="">小二</a></td>
											<td>男</td>
											<td class="center">15201112</td>

										</tr>
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
	<script src="js/jquery-1.9.1.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.dataTables.min.js"></script>


	<script src="js/scripts.js"></script>
	<script src="js/DT_bootstrap.js"></script>
	<script>
		$(function() {

		});
	</script>
</body>

</html>