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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>学生评教系统</title>
<link href="css/bootstrap.min.css?v=1" rel="stylesheet" media="screen">
<link href="css/bootstrap-responsive.min.css?v=1" rel="stylesheet"
	media="screen">
<link href="css/styles.css?v=1" rel="stylesheet" media="screen">
<link href="css/DT_bootstrap.css?v=1" rel="stylesheet" media="screen">
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
						<!-- <div class="navbar navbar-inner block-header">
							<div class="muted pull-left">王明老师评教</div>
						</div> -->
						<div class="block-content collapse in">
							<div class="span12">
							   <fieldset>
                                        <legend>评教</legend>
								<form class="form-horizontal" action="student/service/assessSubmit"
								 method="post" onsubmit="return checkForm()">

									<input type="hidden" name="assessId" value="${assessId}">
									<c:forEach items="${questions}" var="data" varStatus="status">

										<input type="hidden" name="answerId" value="${data.answerId}">

										<p>${data.questionContext}</p>
										<div class="radio">
											<label for="a${status.index+1}" class="radio2"> <span>A</span><input
												id="a${status.index+1}" type="radio" name="answer${status.index+1}" value="A">优秀
											</label> 
											<label for="b${status.index+1}" class="radio2"> <span>B</span><input
												id="b${status.index+1}" type="radio" name="answer${status.index+1}" value="B">良好
											</label>
											 <label for="c${status.index+1}" class="radio2"> <span>C</span><input
												id="c${status.index+1}" type="radio" name="answer${status.index+1}" value="C">一般
											</label>
											 <label for="d${status.index+1}" class="radio2"> <span>D</span><input
												id="d${status.index+1}" type="radio" name="answer${status.index+1}" value="D">不好
											</label>
										</div>


									</c:forEach>

									<div class="control-group">
										<label class="control-label" for="textarea2">意见内容 </label>
										<div class="controls">
											<textarea class="input-xlarge textarea"
												placeholder="Enter text ..." name="advice" id="advice"
												style="width: 300px; height: 60px"></textarea>
										</div>
									</div>
									<div class="form-actions">
										<button type="submit" class="btn btn-primary">提交</button>
										<button type="reset" class="btn">取消</button>
									</div>
									
								</form>
								</fieldset>
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
			$('.chart').easyPieChart({
				animate : 1000
			});
		});
		if('${msg}'!=''){
           window.alert('${msg}');
         }
         function checkForm() {
			var advice = $("#advice").val();
			if(advice==null||advice==''){
			   window.alert("意见信息不能为空！");
			}
			}
	</script>
</body>

</html>