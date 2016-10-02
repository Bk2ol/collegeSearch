<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>US College Search</title>
<%@ include file="/WEB-INF/includes/bootstrapJqueryCSS.jsp"%>
<%@ include file="/WEB-INF/includes/general.jsp"%>
<%@ include file="/WEB-INF/includes/schoolDetailCSS.jsp"%>
</head>
<script >
schoolJsonDetail = ${schoolDetail};
</script>
<body>
	<%@ include file="/WEB-INF/views/header.jsp"%>
	<div class="container">
	<div id = "schoolName" class = 'jumbotron'><h1></h1></div>
	 <div class = "tableTitle"><h1>General Information</h1></div>
		<table class="table-hover table table-bordered" id  = "schoolInfoTable">
			<thead>
			</thead>
		</table>
		<div class = "tableTitle"><h1>Admission Test score Statistics</h1></div>
		<table class="table-hover table table-bordered" id = "schoolTestScoreStatistics">
		</table>
		</div>
	<%@ include file="/WEB-INF/views/footer.jsp"%>
	<%@ include file="/WEB-INF/includes/bootstrapJqueryJS.jsp"%>
	<script src="/CollegeSearch/static/js/schoolDetail.js"></script>

</body>
</html>