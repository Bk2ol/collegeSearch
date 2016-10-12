<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>US College Search</title>
<%@ include file="/WEB-INF/includes/bootstrapJqueryCSS.jsp"%>
<%@ include file="/WEB-INF/includes/generalCSS.jsp"%>
<%@ include file="/WEB-INF/includes/schoolSearchCSS.jsp"%>
</head>

<body>
	<%@ include file="/WEB-INF/views/header.jsp"%>
	<div class="container mainContent">
	<center><h1><strong>2016 Undergraduate School List</strong></h1></center>
	<table id="schoolTable" class="table table-striped table-bordered" cellspacing="0" width="100%">
			<thead>
				<th>school</th>
				<th>Rank</th>
				<th>Total Cost</th>
				<th>Average GPA</th>
				<th>SAT1/ACT (25th-75th%)</th>
				<th>TOEFL Score (Min/Avg)</th>
				<th>Application Deadline</th>
				<th>Location</th>
 				<th>acceptRate (%)</th>
				<th>Type</th>
				<th>setting</th>
				<th>category</th>
				<th>size</th>
			</thead> 
			<tbody>

			</tbody>
			<tfoot>
				<th>school</th>
				<th>Rank</th>
				<th>Total Cost</th>
				<th>Accept Rate</th>
				<th>SAT1/ACT (25th-75th%)</th>
				<th>TOEFL Score (Min/Avg)</th>
				<th>Application Deadline</th>
				<th>Location</th>
				<th>acceptRate (%)</th>
				<th>Type</th>
				<th>setting</th>
				<th>category</th>
				<th>size</th>
			</tfoot>
		</table>
		</div>
	<%@ include file="/WEB-INF/views/footer.jsp"%>
	<%@ include file="/WEB-INF/includes/bootstrapJqueryJS.jsp"%>
	<%@ include file="/WEB-INF/includes/generalJS.jsp"%>
	
<script src="/CollegeSearch/static/js/DataTables/media/js/jquery.dataTables.min.js"></script>
<script src="/CollegeSearch/static/js/DataTables/media/js/dataTables.bootstrap.min.js"></script>
<script src ="/CollegeSearch/static/js/allSchoolJS.js"></script>
<script src="/CollegeSearch/static/js/bootstrap-notify.min.js"></script>
</body>
</html>