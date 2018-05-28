<%@ page contentType="text/html;charset=utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
   <div class="span3" id="sidebar">
                    <ul class="nav nav-list bs-docs-sidenav nav-collapse collapse">
                        <li class="active"><a ><i
							class="icon-chevron-right"></i> Dashboard</a></li>
							<li >
                            <a href="admin/assessResult"><i class="icon-chevron-right"></i>评教结果</a>
                        </li>
                        <li >
                            <a href="admin/advManage"><i class="icon-chevron-right"></i>意见箱</a>
                        </li>
						
                        <li >
                            <a href="admin/studentManage"><i class="icon-chevron-right"></i>学生管理</a>
                        </li>
                        <li >
                            <a href="admin/teacherManage"><i class="icon-chevron-right"></i>教师管理</a>
                        </li>
                          <li >
                            <a href="admin/logManage"><i class="icon-chevron-right"></i>日志管理</a>
                        </li>
                      
						 <li>
                            <a ><span class="badge badge-info pull-right">220</span>教师</a>
                        </li>
						 <li>
                            <a ><span class="badge badge-success pull-right">1900</span>学生</a>
                        </li>
				        <li>
                            <a ><span class="badge badge-important pull-right">100</span>日志</a>
                        </li>
                       
						 <li>
                            <a ><span class="badge badge-info pull-right">220</span>评教</a>
                        </li>
						 <li>
                            <a ><span class="badge badge-success pull-right">1900</span>意见箱</a>
                        </li>
                    </ul>
                </div>