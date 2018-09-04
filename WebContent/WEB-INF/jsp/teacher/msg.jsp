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
<title>教师模块</title>
<meta name="keywords" content="侧边导航菜单(可分组折叠)">
<meta name="description" content="侧边导航菜单(可分组折叠)" />
<meta name="HandheldFriendly" content="True" />
<link href="css/bootstrap.min.css?v=1" rel="stylesheet"
	media="screen">
<link href="css/bootstrap-responsive.min.css?v=1"
	rel="stylesheet" media="screen">
<link href="css/styles.css?v=1" rel="stylesheet" media="screen">
<link href="css/DT_bootstrap.css?v=1" rel="stylesheet"
	media="screen">
<script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
<style>
.setting-wrap .wrap-list {
	border-bottom: solid 1px #e3e3e3;
	padding: 0 20px 0 40px;
}

.setting-wrap .list-header {
	cursor: pointer;
	height: 60px;
	line-height: 60px;
}

.setting-wrap .user-info {
	padding: 15px 20px;
}

.setting-wrap .list-main {
	display: none;
	position: relative;
	padding: 15px 20px 40px 60px;
	border-top: 1px dashed #e7e7e7;
}

.set-main {
	position: relative;
	padding: 15px 20px;
}

.setting-wrap .user-info .set-box {
	font-size: 14px;
}

.set-main .set-box {
	padding-bottom: 20px;
}

.setting-wrap .user-info .box-title, .setting-wrap .user-info .nav-list
	{
	vertical-align: initial;
}

.set-main .set-box .box-title {
	width: 60px;
	text-align: right;
	font-size: 14px;
}

.set-main .set-box .box-title, .set-main .set-nav .nav-list {
	vertical-align: middle;
	margin-right: 30px;
	display: inline-block;
}
</style>
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
						<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">个人信息</div>
						</div>
						<div class="block-content collapse in">

							<div class="setting-wrap">
								<div class="wrap-list">
									<div class="list-main set-main user-info"
										style="display: block;">
										<div class="set-box">
											<label class="box-title">姓名：</label>
											<input type="text" name="nickname" value="${userType.realName}">
										</div>
										
										<div class="set-box">
											<label class="box-title">工号：</label>
											<input type="text" name="nickname" value="${userType.userName }">
										</div>
										
										
											<div class="set-box">
											<label class="box-title">性别：</label>
											<input type="text" name="nickname" id="sex" value="">
										</div>
										
											<div class="set-box">
											<label class="box-title">生日：</label>
											<input type="text" name="nickname" value="${userType.birthday }">
										</div>
										
											<div class="set-box">
											<label class="box-title">电话：</label>
											<input type="text" name="nickname" value="${userType.phoneNum }">
										</div>
										
											<div class="set-box">
											<label class="box-title">地址：</label>
											<input type="text" name="nickname" value="${userType.address }">
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<hr>
	<footer>
	<p>&copy; student assessment system 2018
	</footer>
	<script src="js/jquery-1.9.1.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.dataTables.min.js"></script>


	<script src="js/scripts.js"></script>
	<script src="js/DT_bootstrap.js"></script>
	<script>
		$(function() {

		});
		if(${userType.sex}==0){
		  $("#sex").val("男");
		}
		if(${userType.sex}==1){
		  $("#sex").val("女");
		}
	</script>
</body>

</html>