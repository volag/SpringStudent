<%@ page contentType="text/html;charset=utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
   <div class="span3" id="sidebar">
                    <ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
                        <li class="active"><a ><i
							class="icon-chevron-right"></i> Dashboard</a></li>
							<li >
                            <a href="admin/service/assessResult"><i class="icon-chevron-right"></i>评教结果</a>
                        </li>
                        <li >
                            <a href="admin/service/advManage"><i class="icon-chevron-right"></i>意见箱</a>
                        </li>
						
                        <li >
                            <a href="admin/service/queryStudent"><i class="icon-chevron-right"></i>学生管理</a>
                        </li>
                        <li >
                            <a href="admin/service/queryTeacher"><i class="icon-chevron-right"></i>教师管理</a>
                        </li>
                          <li >
                            <a href="admin/service/queryAllLog"><i class="icon-chevron-right"></i>日志管理</a>
                        </li>
                      
						 <li>
                        </li>
                    </ul>
                </div>