<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String sysPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=sysPath+"/" %>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>教师评教</title>
<link href="css/bootstrap.min.css?v=1" rel="stylesheet"
	media="screen">
<link href="css/bootstrap-responsive.min.css?v=1"
	rel="stylesheet" media="screen">
<link href="css/styles.css?v=1" rel="stylesheet" media="screen">
<link href="css/DT_bootstrap.css?v=1" rel="stylesheet"
	media="screen">
<script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>

<body>
	<div class="navbar navbar-fixed-top">
		<jsp:include page="/WEB-INF/jsp/include/teacher-top.jsp" />
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<jsp:include page="/WEB-INF/jsp/include/teacher-left.jsp" />
			<!--/span-->
			<div class="span9" id="content">
				   <div class="row-fluid">
                        <!-- block -->
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">评教结果</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
  									<table class="table table-bordered">
						              <thead>
						                <tr>
						                  <th>序号</th>
						                  <th>分值</th>
						                  <th>等级</th>
						                  <th>人数</th>
						                </tr>
						              </thead>
						              <tbody>
						                <tr>
						                  <td>1</td>
						                  <td>90分以上</td>
						                  <td>A</td>
						                  <td>20</td>
						                </tr>
						                <tr>
						                  <td>2</td>
						                  <td>80分-90分</td>
						                  <td>B</td>
						                  <td>15</td>
						                </tr>
						                <tr>
						                  <td>3</td>
						                  <td>60-80</td>
						                  <td>C</td>
						                  <td>10</td>
						                </tr>
						                  <tr>
						                  <td>4</td>
						                  <td>小于60</td>
						                  <td>D</td>
						                  <td>3</td>
						                </tr>
						                 <tr>
						                  <td>总计</td>
						                  <td>85</td>
						                  <td>B</td>
						                  <td>48</td>
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
	<p>&copy; student assessment system 2018
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