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
<link href="css/styles.css?v=1" rel="stylesheet"
	media="screen">
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
							<div class="muted pull-left">修改密码</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
							
						     <form class="form-horizontal" action="student/service/changePassword" method="post" onsubmit="return checkForm()">
						     
						            <fieldset>
                                        <legend>填写信息</legend>
                                         <div class="control-group">
                                         <label class="control-label" for="inputError"></label>
                                        <span class="help-inline"><font color="red" id="error"></font></span>
                                        </div>
                                          <div class="control-group">
                                          
											<label class="control-label" for="inputError">原密码：</label>
											<div class="controls">
												<input id="oldPassword" type="text" name="oldPassword">
												<span class="help-inline"><font color="red" id="error"></font></span>
											</div>
										</div>

										<div class="control-group warning">
											<label class="control-label" for="inputError">新密码：</label>
											<div class="controls">
												<input type="text" id="newPassword" name="newPassword">
												<span class="help-inline"><font color="red" id="error2"></font></span>
											</div>
										</div>

										<div class="control-group success">
											<label class="control-label" for="inputError">确认密码：</label>
											<div class="controls">
												<input type="text" id="newPassword1"> <span
													class="help-inline"><font color="red" id="error3"></font></span>
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
		if('${msg}'!=''){
		  window.alert('${msg}');
        } 
        function checkForm() {
			var oldPassword = $("#oldPassword").val();
			var newPassword = $("#newPassword").val();
			var newPassword1 = $("#newPassword1").val();
			 if (oldPassword == null || oldPassword == "") {
				$("#error").html("原密码不能为空！");
				return false;
			}
			if (oldPassword.length < 6 || oldPassword.length > 8) {
				$("#error").html("密码长度为6-8位！");
				return false;
			}
	
			if (newPassword == null || newPassword == "") {
				$("#error").html("新密码不能为空！");
				return false;
			}
	
			if (newPassword.length < 6 || newPassword.length > 8) {
				$("#error").html("新密码长度为6-8位！");
				return false;
			}
			if (newPassword1 == null || newPassword1 == "") {
				$("#error").html("确认密码不能为空！");
				return false;
			}
	
			if (newPassword1.length < 6 || newPassword1.length > 8) {
				$("#error").html("确认密码长度为6-8位！");
				return false;
			} 
			if(newPassword != newPassword1 ){
			    $("#error").html("两次输入的密码不相同！");
				return false;
			}
			return true;
		}
	</script>
</body>

</html>