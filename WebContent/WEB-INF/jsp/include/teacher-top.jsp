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
                    <a class="brand" href="#">教师模块</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav pull-right">
                            <li class="dropdown">
                                <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown"> <i class="icon-user"></i>欢迎${userType.realName}！<i class="caret"></i>

                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a tabindex="-1" >Profile</a>
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
                                <a href="#">Dashboard</a>
                            </li>
                            <li >
                                <a href="teacher/service/msg" >个人信息</b>
                                </a>
                         
                            </li>
                            <li >
                                <a href="teacher/service/changePasswordPage" >修改密码</b>
                                </a>
                       
                            </li>
                            <li >
                                <a >其他</b>
                                </a>
        
                            </li>
                          
                        </ul>
                    </div>
                    <!--/.nav-collapse -->
                </div>
            </div>