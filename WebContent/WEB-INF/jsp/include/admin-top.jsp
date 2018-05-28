<%@ page contentType="text/html;charset=utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
<div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                    </a>
                    <a class="brand" >管理员模块</a>
                    <div class="nav-collapse collapse">
                         <ul class="nav pull-right">
                            <li class="dropdown">
                                <a  role="button" class="dropdown-toggle" data-toggle="dropdown"> <i class="icon-user"></i>${userType.realName}管理员<i class="caret"></i>

                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a tabindex="-1" >修改密码</a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a tabindex="-1" href="logout">注销</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                       
                        <ul class="nav">
                            <li class="active">
                                <a >Dashboard</a>
                            </li>
                            <li class="dropdown">
                                <a  class="dropdown-toggle" data-toggle="dropdown">设置<b class="caret"></b>

                                </a>
                                <ul class="dropdown-menu" id="menu1">
              
                                    <li>
                                        <a href="admin/adminManage">管理员设置</a>
                                    </li>
                                    <li>
                                        <a href="admin/assessTimeManage">评教时间设置</a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a >Other Link</a>
                                    </li>
                                    <li>
                                        <a >Other Link</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a  role="button" class="dropdown-toggle" data-toggle="dropdown">内容<i class="caret"></i>

                                </a>
                                <ul class="dropdown-menu">
                                 
                                    <li>
                                        <a tabindex="-1" >News</a>
                                    </li>
                                    <li>
                                        <a tabindex="-1" >Custom Pages</a>
                                    </li>
                                    <li>
                                        <a tabindex="-1" >Calendar</a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a tabindex="-1" >帮助</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a  role="button" class="dropdown-toggle" data-toggle="dropdown">其它</i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>