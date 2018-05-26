<%@ page contentType="text/html;charset=utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
<div class="span3" id="sidebar">
                    <ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
					    <li class="active">
                            <a href="#"><i class="icon-chevron-right"></i> Dashboard</a>
                        </li>
                        <li>
                            <a href="teacher/classStudentList"><i class="icon-chevron-right"></i> XX班级学生</a>
                        </li>
                        <li>
                            <a href="teacher/assessResultList"><i class="icon-chevron-right"></i> 评教结果</a>
                        </li>
                        <li>
                            <a href="teacher/adviceList"><i class="icon-chevron-right"></i> <span class="badge badge-important pull-right">83</span>意见箱</a>
                        </li>
                    </ul>
                </div>