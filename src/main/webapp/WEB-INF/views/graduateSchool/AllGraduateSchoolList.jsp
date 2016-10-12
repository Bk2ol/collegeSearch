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
	<center><h1><strong>2016 Graduate School List</strong></h1></center>
	<table id="graduateSchoolTable"  class="table table-striped table-bordered table-hover" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>school</th>
					<th>major</th>
					<th>degree</th>
					<th>rank</th>
					<th>Test</th>
					<th>Language Test</th>
					<th>deadline</th>
					<th>phone</th>
					<th>email</th>
					<th>admissionWebpage</th>
				</tr>
			</thead>
			<tbody>

			</tbody>
			<tfoot>
				<tr>
					<th>school</th>
					<th>major</th>
					<th>degree</th>
					<th>rank</th>
					<th>Test</th>
					<th>Language Test</th>
					<th>deadline</th>
					<th>phone</th>
					<th>email</th>
					<th>admissionWebpage</th>
				</tr>
			</tfoot>
		</table>
	</div>
	<%@ include file="/WEB-INF/views/footer.jsp"%>
	<%@ include file="/WEB-INF/includes/bootstrapJqueryJS.jsp"%>
	<%@ include file="/WEB-INF/includes/generalJS.jsp"%>
	<script src="/CollegeSearch/static/js/DataTables/media/js/jquery.dataTables.min.js"></script>
	<script src="/CollegeSearch/static/js/DataTables/media/js/dataTables.bootstrap.min.js"></script>
	<script src="/CollegeSearch/static/js/bootstrap-notify.min.js"></script>
	<script src ="/CollegeSearch/static/js/allGraduateSchoolJS.js"></script>
</body>
</html>
	
