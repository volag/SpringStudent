<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String sysPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=sysPath + "/"%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员模块</title>
<link href="css/bootstrap.min.css?v=1" rel="stylesheet" media="screen">
<link href="css/bootstrap-responsive.min.css?v=1" rel="stylesheet"
	media="screen">
<link href="css/styles.css?v=1" rel="stylesheet" media="screen">
<link href="css/DT_bootstrap.css?v=1" rel="stylesheet" media="screen">
<link href="css/datepicker.css?v=1" rel="stylesheet" media="screen">
<link href="css/uniform.default.css?v=1" rel="stylesheet" media="screen">
<link href="css/chosen.min.css?v=1" rel="stylesheet" media="screen">
<link href="css/bootstrap-wysihtml5.css?v=1" rel="stylesheet"
	media="screen">
<script src="js/modernizr-2.6.2-respond-1.1.0.min.js?v=1"></script>
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
							<div class="muted pull-left">Form Validation</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<!-- BEGIN FORM-->
								<form action="#" id="form_sample_1" class="form-horizontal">
									<fieldset>
										<div class="alert alert-error hide">
											<button class="close" data-dismiss="alert"></button>
											You have some form errors. Please check below.
										</div>
										<div class="alert alert-success hide">
											<button class="close" data-dismiss="alert"></button>
											Your form validation is successful!
										</div>
										<div class="control-group">
											<label class="control-label">Name<span
												class="required">*</span></label>
											<div class="controls">
												<input type="text" name="name" data-required="1"
													class="span6 m-wrap" />
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">Email<span
												class="required">*</span></label>
											<div class="controls">
												<input name="email" type="text" class="span6 m-wrap" />
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">URL<span
												class="required">*</span></label>
											<div class="controls">
												<input name="url" type="text" class="span6 m-wrap" /> <span
													class="help-block">e.g: http://www.demo.com or
													http://demo.com</span>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">Number<span
												class="required">*</span></label>
											<div class="controls">
												<input name="number" type="text" class="span6 m-wrap" />
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">Digits<span
												class="required">*</span></label>
											<div class="controls">
												<input name="digits" type="text" class="span6 m-wrap" />
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">Credit Card<span
												class="required">*</span></label>
											<div class="controls">
												<input name="creditcard" type="text" class="span6 m-wrap" />
												<span class="help-block">e.g: 5500 0000 0000 0004</span>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">Occupation&nbsp;&nbsp;</label>
											<div class="controls">
												<input name="occupation" type="text" class="span6 m-wrap" />
												<span class="help-block">optional field</span>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label">Category<span
												class="required">*</span></label>
											<div class="controls">
												<select class="span6 m-wrap" name="category">
													<option value="">Select...</option>
													<option value="Category 1">Category 1</option>
													<option value="Category 2">Category 2</option>
													<option value="Category 3">Category 5</option>
													<option value="Category 4">Category 4</option>
												</select>
											</div>
										</div>
										<div class="form-actions">
											<button type="submit" class="btn btn-primary">Validate</button>
											<button type="button" class="btn">Cancel</button>
										</div>
									</fieldset>
								</form>
								<!-- END FORM-->
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
			
		});
	</script>
</body>
</html>