<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
	String sysPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=sysPath+"/" %>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员模块</title>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="css/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
        <link href="css/styles.css" rel="stylesheet" media="screen">
        <link href="css/DT_bootstrap.css" rel="stylesheet" media="screen">
        <script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
 <body>
        <div class="navbar navbar-fixed-top">
        <jsp:include page="/WEB-INF/jsp/include/admin-top.jsp" />
        </div>
        <div class="container-fluid">
            <div class="row-fluid">
            <jsp:include page="/WEB-INF/jsp/include/admin-left.jsp" />
                <!--/span-->
                <div class="span9" id="content">
                     <div class="row-fluid">
                     <div class="alert alert-success">
						<button type="button" class="close" data-dismiss="alert">&times;</button>
						<h4>Success</h4>
						The operation completed successfully
					</div>
                        <!-- block -->
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">意见信息管理</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                                    
  									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
										<thead>
											<tr>
												<th>编号</th>
												<th>意见人</th>
												<th>教师</th>
												<th >意见信息</th>
												<th >操作</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td ><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td><a href="#myAlert" data-toggle="modal" class="btn btn-danger">detele</a></td>
											
												
											</tr>
												<tr>
												<td>2</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td ><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td ><a href="#myAlert" data-toggle="modal" class="btn btn-danger">detele</a></td>
											</tr>
												<tr>
												<td>3</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td ><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td ><a href="#myAlert" data-toggle="modal" class="btn btn-danger">detele</a></td>
											</tr>
												<tr>
												<td>4</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td style="padding-right:10px;"><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td ><a href="#myAlert" data-toggle="modal" class="btn btn-danger">detele</a></td>
											</tr>
												<tr>
												<td>5</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td style="padding-right:10px;"><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td ><a href="#myAlert" data-toggle="modal" class="btn btn-danger">detele</a></td>
											</tr>
												<tr>
												<td>6</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td style="padding-right:10px;"><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td class="center"><a href="#myAlert" data-toggle="modal" class="btn btn-danger">detele</a></td>
											</tr>
												<tr>
												<td>7</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td style="padding-right:10px;"><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td class="center">删除</td>
											</tr>
												<tr>
												<td>8</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td style="padding-right:10px;"><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td class="center">删除</td>
											</tr>
												<tr>
												<td>9</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td style="padding-right:10px;"><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td class="center">删除</td>
											</tr>
												
												<tr>
												<td>10</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td style="padding-right:10px;"><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td class="center">删除</td>
											</tr>
												
												<tr>
												<td>11</td>
												<td>张三</td>
												<td>刘明老师</td>
												<td style="padding-right:10px;"><textarea class="input-xlarge disabled" id="disabledInput" type="text" placeholder="Disabled input here...Disabled input here...Disabled input here..." disabled=""></textarea></td>
												<td class="center">删除</td>
											</tr>
												<div id="myAlert" class="modal hide">
											<div class="modal-header">
												<button data-dismiss="modal" class="close" type="button">&times;</button>
												<h3 style="color:red">操作警告！</h3>
											</div>
											<div class="modal-body">
												<p>您是否要删除这条信息？</p>
											</div>
											<div class="modal-footer">
												<a data-dismiss="modal" class="btn btn-primary" href="#">确认</a>
												<a data-dismiss="modal" class="btn" href="#">取消</a>
											</div>
										</div>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!-- /block -->
                    </div>
                </div>
            </div>
            </div>
            <hr>
	<footer>
	<p>
		&copy; student assessment system 2018 
	</footer>
	</div>
        <script src="js/jquery-1.9.1.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.dataTables.min.js"></script>


        <script src="js/scripts.js"></script>
        <script src="js/DT_bootstrap.js"></script>
        <script>
        $(function() {
            
        });
        </script>
    </body>
</html>