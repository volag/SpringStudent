<%@ page contentType="text/html;charset=utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
   <div class="span3" id="sidebar">
                    <ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
                        <li class="active"><a href="#"><i
							class="icon-chevron-right"></i> Dashboard</a></li>
                        <li>
                            <a href="admin/studentManage"><i class="icon-chevron-right"></i>学生管理</a>
                        </li>
                        <li>
                            <a href="admin/teacherManage"><i class="icon-chevron-right"></i>教师管理</a>
                        </li>
                        <li>
                            <a href="admin/adminManage"><i class="icon-chevron-right"></i>管理员管理</a>
                        </li>
                        <li >
                            <a href="admin/advManage"><i class="icon-chevron-right"></i>意见箱</a>
                        </li>
						<li >
                            <a href="admin/assessResult"><i class="icon-chevron-right"></i>评教结果</a>
                        </li>
						 <li>
                            <a href="#"><span class="badge badge-important pull-right">10</span>管理员</a>
                        </li>
                       
						 <li>
                            <a href="#"><span class="badge badge-info pull-right">220</span>教师</a>
                        </li>
						 <li>
                            <a href="#"><span class="badge badge-success pull-right">1900</span>学生</a>
                        </li>
				
                    </ul>
                </div>