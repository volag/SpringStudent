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
                                <div class="muted pull-left">详细信息</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                                    
  									<table cellpadding="0" cellspacing="0" border="0" class="table table-striped table-bordered" id="example">
										<thead>
											<tr>
												<th>序号</th>
												<th>学生姓名</th>
												<th>学号</th>
												<th>评教分数</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											<tr>
											    <td>1</td>
												<td>刘明</td>
												<td>15201101</td>
												<td>95</td>
											<td ><a href="admin/msg" data-toggle="modal"
												class="btn btn-primary">评教详情</a></td>
												</tr>
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