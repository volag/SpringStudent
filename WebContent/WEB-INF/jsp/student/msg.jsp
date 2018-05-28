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

			<!--/span-->
			<div class="span9" id="content">
				<div class="row-fluid">
					<!-- block -->
					<div class="block">
						<div class="navbar navbar-inner block-header">
							<div class="muted pull-left">个人信息</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<form class="form-horizontal">
									<fieldset>
										<legend></legend>
										
										  <div class="control-group">
                                          <label class="control-label" for="disabledInput">学号：</label>
                                          <div class="controls">
                                            <input class="input-xlarge disabled" id="disabledInput" type="text" placeholder="15201124" disabled="">
                                          </div>
                                        </div>
                                        
                                          <div class="control-group">
                                          <label class="control-label" for="disabledInput">姓名：</label>
                                          <div class="controls">
                                            <input class="input-xlarge disabled" id="disabledInput" type="text" placeholder="15201124" disabled="">
                                          </div>
                                        </div>
                                        
                                          <div class="control-group">
                                          <label class="control-label" for="disabledInput">性别：</label>
                                          <div class="controls">
                                            <input class="input-xlarge disabled" id="disabledInput" type="text" placeholder="男" disabled="">
                                          </div>
                                        </div>
                                        
                                        
                                      <div class="control-group">
                                          <label class="control-label" for="disabledInput">班级：</label>
                                          <div class="controls">
                                            <input class="input-xlarge disabled" id="disabledInput" type="text" placeholder="152011" disabled="">
                                          </div>
                                        </div>
                                        
                                          <div class="control-group">
                                          <label class="control-label" for="disabledInput">出生年月：</label>
                                          <div class="controls">
                                            <input class="input-xlarge disabled" id="disabledInput" type="text" placeholder="1997-03-30" disabled="">
                                          </div>
                                        </div>
                                          
                                          <div class="control-group">
                                          <label class="control-label" for="disabledInput">联系方式：</label>
                                          <div class="controls">
                                            <input class="input-xlarge disabled" id="disabledInput" type="text" placeholder="15779551676" disabled="">
                                          </div>
                                        </div>
                                        
                                          <div class="control-group">
                                          <label class="control-label" for="disabledInput">家庭住址：</label>
                                          <div class="controls">
                                            <input class="input-xlarge disabled" id="disabledInput" type="text" placeholder="江西省南昌市新建县" disabled="">
                                          </div>
                                        </div>
                                         
                                      
									<!-- 	<div class="control-group">
											<label class="control-label" for="typeahead">学号：</label>
											<div class="controls">
												<input type="text" class="span6" id="typeahead"
													data-provide="typeahead" data-items="4"
													data-source='["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]'>
												<p class="help-block">Start typing to activate auto
													complete!</p>
											</div>
										</div> -->
										<!-- <div class="control-group">
											<label class="control-label" for="date01">姓名：</label>
											<div class="controls">
												<input type="text" class="input-xlarge datepicker"
													id="date01" value="02/16/12">
												<p class="help-block">In addition to freeform text, any
													HTML5 text-based input appears like so.</p>
											</div>
										</div> -->
										<!-- <div class="control-group">
											<label class="control-label" for="optionsCheckbox">Checkbox</label>
											<div class="controls">
												<label class="uniform"> <input class="uniform_on"
													type="checkbox" id="optionsCheckbox" value="option1">
													Option one is this and that&mdash;be sure to include why
													it's great
												</label>
											</div>
										</div> -->
							
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