<%@ page contentType="text/html;charset=utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
<div class="span3" id="sidebar">
                    <ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
					    <li class="active">
                            <a ><i class="icon-chevron-right"></i> Dashboard</a>
                        </li>
                      
                        <li>
                            <a href="teacher/main"><i class="icon-chevron-right"></i> 评教结果</a>
                        </li>
                        <li>
                            <a href="teacher/service/assessAdvice"><i class="icon-chevron-right"></i> <span class="badge badge-important pull-right"></span>意见箱</a>
                        </li>
                    </ul>
                </div>