<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=sysPath + "/"%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生评教系统</title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="css/bootstrap-responsive.min.css" rel="stylesheet"
	media="screen">
<link href="css/styles.css" rel="stylesheet" media="screen">
<link href="css/DT_bootstrap.css" rel="stylesheet" media="screen">
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
							<div class="muted pull-left">设置评教时间</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<form class="form-horizontal" action="admin/service/setAssessTimeSection" method="get" onsubmit="return checkForm()">
									<fieldset>
										<legend>填写信息</legend>

										<div class="control-group">
											<label class="control-label" for="disabledInput">原始评教时间：</label>
											<div class="controls">
												<input class="input-xlarge disabled" id="disabledInput"
													type="text"
													placeholder="${sectionTime.startTime} - ${sectionTime.endTime } "
													disabled="">
											</div>
										</div>

										<div class="control-group warning">
											<label class="control-label" for="inputError">设置开始时间：</label>
											<div class="controls">
												<input type="date" id="startTime" name="startTime"> <span
													class="help-inline"></span>
											</div>
										</div>

										<div class="control-group success">
											<label class="control-label" for="inputError" >设置结束时间：</label>
											<div class="controls">
												<input type="date" id="endTime" name="endTime"> <span
													class="help-inline"><font color="red" id="error"></font></span>
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
		$(function() {});
			if ('${msg}' != '') {
			window.alert('${msg}');
		}
		function checkForm() {
		    var startTime = $("#startTime").val();
			var endTime = $("#endTime").val(); 
			if(startTime>=endTime){
			   $("#error").html("结束时间应在开始时间之后！");
			}
		}
	</script>
</body>
</html>