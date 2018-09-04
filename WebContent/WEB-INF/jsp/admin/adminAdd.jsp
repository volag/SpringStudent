<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String sysPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=sysPath + "/"%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生评教系统</title>
<link href="css/bootstrap.min.css?v=1" rel="stylesheet" media="screen">
<link href="css/bootstrap-responsive.min.css?v=1" rel="stylesheet"
	media="screen">
<link href="css/styles.css?v=1" rel="stylesheet" media="screen">
<link href="css/DT_bootstrap.css?v=1" rel="stylesheet" media="screen">
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
					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">填写信息</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<form class="form-horizontal"
									action="admin/service/sumbitAddAdmin" method="post">
									<fieldset>
										<legend></legend>
										<div class="control-group">
											<label class="control-label" for="inputError">姓名：</label>
											<div class="controls">
												<input name="realName"
													type="text" placeholder="realName" >
											</div>
											</div>
											<div class="control-group">
								<label class="control-label" for="inputError">工号：</label>
								<div class="controls">
									<input name="userName"
										type="text" placeholder="userName" >
								</div>
							</div>
											
							<div class="control-group">
								<label class="control-label" for="inputError">性别：</label>
								<div class="controls">
									<select name="sex" class="form-control" id="">
								    <option value="0">男</option>
									<option value="1">女</option>
								     </select>
								</div>
							</div>
							
							
							
							<div class="control-group">
								<label class="control-label" for="inputError">出生年月：</label>
								<div class="controls">
									<input name="birthday"
										type="text" placeholder="birthday" >
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="inputError">联系方式：</label>
								<div class="controls">
									<input name="phoneNum"
										type="text" placeholder="phoneNum" >
								</div>
							</div>

							<div class="control-group">
								<label class="control-label" for="inputError">家庭住址：</label>
								<div class="controls">
									<input type="text" name="address" placeholder="address" >
								</div>
							</div>
							<div class="form-actions">
								<button type="submit" class="btn btn-primary">Save
									changes</button>
								<button type="reset" class="btn">Cancel</button>
							</div>
						
							</fieldset>
						
							</form>
							</div>
							</div>
						
			<!-- /block -->
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
			// Easy pie charts
			$('.chart').easyPieChart({
				animate : 1000
			});
		});
	</script>
</body>

</html>