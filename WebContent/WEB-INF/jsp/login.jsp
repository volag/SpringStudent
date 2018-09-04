<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link href="css/login.css?v=2" rel="stylesheet">
<style type="text/css">
body{
	background: #494A5F;
	color: #D5D6E2;
	font-weight: 500;
	font-size: 1.05em;
	font-family: "Microsoft YaHei","Segoe UI", "Lucida Grande", Helvetica, Arial,sans-serif;
}
.htmleaf-header{
	padding: 1em 190px 1em;
	letter-spacing: -1px;
	text-align: center;
	background: #66677c;
}
.htmleaf-header h1 {
	color: #D5D6E2;
	font-weight: 600;
	font-size: 3em;
	line-height: 1;
	margin-bottom: 0;
}
</style>
<link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css">
<title>学生评教系统</title>
</head>
<body>
	<div class="htmleaf-container">
		<div class="htmleaf-header">
		<h1>学生评教系统</h1>
		<div class="htmleaf-links"></div>
		</div>
		<div class="demo form-bg" style="padding: 20px 0;">
			<div class="container">
				<div class="row">
					<div class="col-md-offset-3 col-md-6">
						<form class="form-horizontal" action="login" method="post" onsubmit="return checkForm()">
							<span class="heading">用户登录</span>
							<div class="form-group">
								<input type="text" class="form-control" name="userName"
									id="userName" value=""  placeholder="用户名"> <i
									class="fa fa-user"></i>
							</div>
							<div class="form-group help">
								<input type="password" class="form-control" name="password"
									id="password" value="" placeholder="密　码"> <i
									class="fa fa-lock"></i> <a href="#"
									class="fa fa-question-circle"></a>
							</div>
							<div class="form-group">
								<select name="userType" class="form-control" id="">
								    <option value="student">学生</option>
									<option value="teacher">教师</option>
									<option value="admin">管理员</option>
								</select>
							</div>
							<div class="form-group">
								<div class="main-checkbox">
									<input type="checkbox" value="None" id="checkbox1" name="check" />
									<label for="checkbox1"></label>
								</div>
							<!-- 	<span class="text">Remember me</span> -->
								<span><font color="red" id="error"></font></span>
								<input type="submit" class="btn btn-default" value="登录">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
<script src="js/jquery-1.9.1.js"></script>
<script type="text/javascript">
function checkForm(){
    var userName=$("#userName").val();
	var password=$("#password").val();
	if(userName==null||userName==""){
		$("#error").html("用户名不能为空！");
		return false;
	}
	if(userName.length < 6 || userName.length>8){
		$("#error").html("用户名长度为6-8位！");
		return false;
	}
	
	if(password==null||password==""){
		$("#error").html("密码不能为空！");
		return false;
	}
	
	if(password.length < 6||password.length>8){
		$("#error").html("密码长度为6-8位！");
		return false;
	} 
	return true;
}
if('${error}'!=''){
	$("#error").html('用户名或者密码错误！');
}
</script>
</html>