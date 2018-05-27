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
<link href="css/login.css?v=1" rel="stylesheet">

<link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css">
<title>学生评教系统</title>
</head>
<body>
	<div class="htmleaf-container">
		<header class="htmleaf-header">
		<h1>学生评教系统</h1>
		<div class="htmleaf-links"></div>
		</header>
		<div class="demo form-bg" style="padding: 20px 0;">
			<div class="container">
				<div class="row">
					<div class="col-md-offset-3 col-md-6">
						<form class="form-horizontal" action="login" method="post">
							<span class="heading">用户登录</span>
							<div class="form-group">
								<input type="text" class="form-control" name="userName"
									id="inputEmail3" value="15201101" placeholder="用户名"> <i
									class="fa fa-user"></i>
							</div>
							<div class="form-group help">
								<input type="password" class="form-control" name="password"
									id="inputPassword3" value="111111" placeholder="密　码"> <i
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
								<span class="text">Remember me</span>
								<input type="submit" class="btn btn-default" value="登录">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>