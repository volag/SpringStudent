<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String sysPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=sysPath + "/"%>">
<title>学生评教系统</title>
  <link rel="shortcut icon" href="images/favicon.ico">
<link href="css/bootstrap.min.css?v=2" rel="stylesheet" media="screen">
<link href="css/bootstrap-responsive.min.css?v=1" rel="stylesheet"
	media="screen">
<link href="css/styles.css?v=1" rel="stylesheet" media="screen">
<link href="css/DT_bootstrap.css?v=1" rel="stylesheet" media="screen">
<script src="js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
<script src="js/jquery-1.9.1.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.dataTables.min.js"></script>
	<script src="js/scripts.js"></script>
	<script src="js/DT_bootstrap.js"></script>
<style>
.radio2 {
	display: inline-block;
	position: relative;
	line-height: 18px;
	margin-right: 10px;
	cursor: pointer;
	width: 110px;
}
</style>
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
					<div class="alert alert-success">
						<button type="button" class="close" data-dismiss="alert">&times;</button>
						<h4>Success</h4>
						The operation completed successfully
					</div>
					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">王明老师评教</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<form class="form-horizontal" action="student/service/assessSubmit"
								 method="post">

									<input type="hidden" name="assessId" value="${assessId}">
									<c:forEach items="${questions}" var="data" varStatus="status">

										<input type="hidden" name="answerId" value="${data.answerId}">

										<p>${status.index+1}.${data.questionContext}</p>
										<div class="radio">
											<label for="a${status.index+1}" class="radio2"> 
												<span>A</span>
												<input id="a${status.index+1}"  type="radio" name="answer${status.index+1}" value="A">优秀
											</label> 
											<label for="b${status.index+1}" class="radio2">
												 <span>B</span><input id="b${status.index+1}" type="radio" name="answer${status.index+1}" value="B">良好
											</label>
											 <label for="c${status.index+1}" class="radio2"> <span>C</span><input
												id="c${status.index+1}" type="radio" name="answer${status.index+1}" value="C">一般
											</label>
											 <label for="d${status.index+1}" class="radio2"> <span>D</span><input
												id="d${status.index+1}" type="radio" name="answer${status.index+1}" value="D">不好
											</label>
											
											<script type="text/javascript">
												$(function(){
													$("#"+"${data.answer}".toLowerCase() + "${status.index+1}").attr("checked","checked");
												});
											</script>
										</div>


									</c:forEach>

									<div class="control-group">
										<label class="control-label" for="textarea2">意见内容 </label>
										<div class="controls">
											<textarea class="input-xlarge textarea"
												 name="advice" readonly
												style="width: 300px; height: 60px" >${advice}</textarea>
										</div>
									</div>
									
								</form>
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

</body>

</html>