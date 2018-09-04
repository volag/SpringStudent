<%@ page contentType="text/html;charset=utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" >学生模块</a>
				<div class="nav-collapse collapse">
					<ul class="nav pull-right">
						<li class="dropdown"><a  role="button"
							class="dropdown-toggle" data-toggle="dropdown"> <i
								class="icon-user"></i> 欢迎${userType.realName}<i class="caret"></i>
						</a>
							<ul class="dropdown-menu">
								<li><a tabindex="-1">Profile</a></li>
								<li class="divider"></li>
								<li><a tabindex="-1" href="logout">注销</a></li>
							</ul></li>
					</ul>
					<ul class="nav">
						<li class="active"><a >Dashboard</a></li>
						<li><a href="student/service/msg" >个人信息
						</a></li>
							<li><a href="student/service/changePasswordPage">修改密码
						</a></li>
						<li><a >其他
						</a></li>

					</ul>
				</div>
			</div>
		</div>