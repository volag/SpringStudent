<%@ page contentType="text/html;charset=utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
<div class="span3" id="sidebar">
				<ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
					<li class="active"><a href="student/ClassList"><i
							class="icon-chevron-right"></i> Dashboard</a></li>
					<li><a href="student/ClassList?type=0"><i class="icon-chevron-right"></i> 基础课评教</a></li>
					<li><a href="student/ClassList?type=1"><i class="icon-chevron-right"></i> 选修课评教</a></li>
					<li><a href="student/ClassList?type=2"><i class="icon-chevron-right"></i> 实验课评教</a></li>
				</ul>
			</div>