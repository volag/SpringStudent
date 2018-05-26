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
<title>学生评教</title>
<link href="css/bootstrap.min.css?v=1" rel="stylesheet"
	media="screen">
<link href="css/bootstrap-responsive.min.css?v=1"
	rel="stylesheet" media="screen">
<link href="css/styles.css?v=1" rel="stylesheet"
	media="screen">
<link href="css/DT_bootstrap.css?v=1" rel="stylesheet"
	media="screen">
<script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>

	<div class="navbar navbar-fixed-top">
		<jsp:include page="/WEB-INF/jsp/include/student-top.jsp" />
	</div>

	<div class="container-fluid">

		<div class="row-fluid">
			<jsp:include page="/WEB-INF/jsp/include/student-left.jsp" />

			<div class="span9" id="content">

				<div class="row-fluid">
					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">王明老师评教</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
							<form class="form-horizontal">
							    <p>1.你对这个老师的上课评价！</p>
								<div class="radio">
									<label><span>A</span> <input type="radio">优秀
									</label>
								</div>
								<div class="radio">
									<label> <span>B</span><input type="radio">良好
									</label>
								</div>
								<div class="radio ">
									<label> <span>C</span><input type="radio" >一般
									</label>
								</div>
								<div class="radio ">
									<label> <span>D</span><input type="radio" >不好
									</label>
								</div>
								
								<p>2.请你对这个老师的作业批改情况！</p>
								<div class="radio">
									<label><span>A</span> <input type="radio">优秀
									</label>
								</div>
								<div class="radio">
									<label> <span>B</span><input type="radio">良好
									</label>
								</div>
								<div class="radio ">
									<label> <span>C</span><input type="radio" >一般
									</label>
								</div>
								<div class="radio ">
									<label> <span>D</span><input type="radio" >不好
									</label>
								</div>
								
								<p>3.请你对这个老师的师德评价！</p>
								<div class="radio">
									<label><span>A</span> <input type="radio">优秀
									</label>
								</div>
								<div class="radio">
									<label> <span>B</span><input type="radio">良好
									</label>
								</div>
								<div class="radio ">
									<label> <span>C</span><input type="radio" >一般
									</label>
								</div>
								<div class="radio ">
									<label> <span>D</span><input type="radio" >不好
									</label>
								</div>
								<div class="control-group">
											<label class="control-label" for="textarea2">Textarea
												WYSIWYG</label>
											<div class="controls">
												<textarea class="input-xlarge textarea"
													placeholder="Enter text ..."
													style="width: 300px; height: 60px"></textarea>
											</div>
										</div>
								<div class="form-actions">
											<button type="submit" class="btn btn-primary">Save
												changes</button>
											<button type="reset" class="btn">Cancel</button>
										</div>
								</form>
							</div>
						</div>
					</div>
					<!-- /block -->
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
			// Easy pie charts
			$('.chart').easyPieChart({
				animate : 1000
			});
		});
	</script>
</body>

</html>