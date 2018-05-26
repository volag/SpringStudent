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
							<div class="muted pull-left">Form Example</div>
						</div>
						<div class="block-content collapse in">
							<div class="span12">
								<form class="form-horizontal">
									<fieldset>
										<legend>Form Components</legend>
										<div class="control-group">
											<label class="control-label" for="typeahead">Text
												input </label>
											<div class="controls">
												<input type="text" class="span6" id="typeahead"
													data-provide="typeahead" data-items="4"
													data-source='["Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Dakota","North Carolina","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"]'>
												<p class="help-block">Start typing to activate auto
													complete!</p>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="date01">Date input</label>
											<div class="controls">
												<input type="text" class="input-xlarge datepicker"
													id="date01" value="02/16/12">
												<p class="help-block">In addition to freeform text, any
													HTML5 text-based input appears like so.</p>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="optionsCheckbox">Checkbox</label>
											<div class="controls">
												<label class="uniform"> <input class="uniform_on"
													type="checkbox" id="optionsCheckbox" value="option1">
													Option one is this and that&mdash;be sure to include why
													it's great
												</label>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="select01">Select
												list</label>
											<div class="controls">
												<select id="select01" class="chzn-select">
													<option>something</option>
													<option>2</option>
													<option>3</option>
													<option>4</option>
													<option>5</option>
												</select>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="multiSelect">Multicon-select</label>
											<div class="controls">
												<select multiple="multiple" id="multiSelect"
													class="chzn-select span4">
													<option>Alabama</option>
													<option>Alaska</option>
													<option>Arizona</option>
													<option>Arkansas</option>
													<option>California</option>
													<option>Colorado</option>
													<option>Connecticut</option>
													<option>Delaware</option>
													<option>District Of Columbia</option>
													<option>Florida</option>
													<option>Georgia</option>
													<option>Hawaii</option>
													<option>Idaho</option>
													<option>Illinois</option>
													<option>Indiana</option>
													<option>Iowa</option>
													<option>Kansas</option>
													<option>Kentucky</option>
													<option>Louisiana</option>
													<option>Maine</option>
													<option>Maryland</option>
													<option>Massachusetts</option>
													<option>Michigan</option>
													<option>Minnesota</option>
													<option>Mississippi</option>
													<option>Missouri</option>
													<option>Montana</option>
													<option>Nebraska</option>
													<option>Nevada</option>
													<option>New Hampshire</option>
													<option>New Jersey</option>
													<option>New Mexico</option>
													<option>New York</option>
													<option>North Carolina</option>
													<option>North Dakota</option>
													<option>Ohio</option>
													<option>Oklahoma</option>
													<option>Oregon</option>
													<option>Pennsylvania</option>
													<option>Rhode Island</option>
													<option>South Carolina</option>
													<option>South Dakota</option>
													<option>Tennessee</option>
													<option>Texas</option>
													<option>Utah</option>
													<option>Vermont</option>
													<option>Virginia</option>
													<option>Washington</option>
													<option>West Virginia</option>
													<option>Wisconsin</option>
													<option>Wyoming</option>
												</select>
												<p class="help-block">Start typing to activate auto
													complete!</p>
											</div>

										</div>
										<div class="control-group">
											<label class="control-label" for="fileInput">File
												input</label>
											<div class="controls">
												<input class="input-file uniform_on" id="fileInput"
													type="file">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="textarea2">Textarea
												WYSIWYG</label>
											<div class="controls">
												<textarea class="input-xlarge textarea"
													placeholder="Enter text ..."
													style="width: 810px; height: 200px"></textarea>
											</div>
										</div>
										<div class="form-actions">
											<button type="submit" class="btn btn-primary">Save
												changes</button>
											<button type="reset" class="btn">Cancel</button>
										</div>
									</fieldset>
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