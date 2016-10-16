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
	<div class="container mainContent" id='checkHightForLineUp'>
		<form>
			<div class="col-xs-12 col-sm-12 col-md-12 form-group">
				<h4>Enter Your Scores</h4>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-2 form-group">
				<strong>GPA :</strong> <input type="text"
					class="form-control form-inline" style="margin: 0" id="GPA">
			</div>
			<div class="col-xs-8 col-sm-4 col-md-3 form-group"
				id="heightStandard">
				<strong>English Test</strong> <input class="form-control"
					id="ms-LanguageTest">
			</div>
			<div class="col-xs-4 col-sm-2 col-md-1 form-group">
				<strong id='englishTestLabel'>Score</strong> <input type="text"
					class="form-control" id="LanguageScore">
			</div>
			<div class="col-xs-12 col-sm-6 col-md-3 form-group">
				<strong>Test</strong> <input class="form-control" id="ms-Test">
			</div>
			<div class="col-xs-4 col-sm-2 col-md-1 form-group">
				<strong>Reading</strong> <input type="text"
					class="form-control form-inline" style="margin: 0" id="Reading">
			</div>
			<div class="col-xs-4 col-sm-2 col-md-1 form-group">
				<strong>Math</strong> <input type="text"
					class="form-control form-inline" style="margin: 0" id="Math">
			</div>
			<div class="col-xs-4 col-sm-2 col-md-1 form-group">
				<strong>Essay</strong> <input type="text"
					class="form-control form-inline" style="margin: 0" id="Essay">
			</div>

			<div class="col-xs-12 col-md-6 form-group">
				<strong>SAT II</strong> <input class="form-control" id="ms-SatII">
			</div>
			<div class="col-xs-12 col-sm-12 col-md-12 form-group">
				<h4>Select Your Preferences</h4>
			</div>
			<div class="col-xs-6 col-sm-3 col-md-2 form-group"
				id="heightForBottomRank">
				<strong>Rank :</strong> <input type="text"
					class="form-control form-inline" style="margin: 0" id="bottomRank">
			</div>
			<div class="col-xs-6 col-sm-3 col-md-2 form-group"
				id="heightForTopRank">
				</br> <input type="text" class="form-control" style="margin: 0"
					id="topRank">
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 form-group">
				<strong>Total Cost</strong> <input class="form-control" id="ms-Cost">
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 form-group">
				<strong>Acceptance Rate(%)</strong> <input class="form-control"
					id="ms-AcceptRate">
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 form-group">
				<strong>Type</strong> <input class="form-control" id="ms-Type">
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 form-group">
				<strong>Setting</strong> <input class="form-control" id="ms-Setting">
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 form-group">
				<strong>Size</strong> <input class="form-control" id="ms-Size">
			</div>
			<div class="col-xs-12 col-md-7 form-group">
				<strong>Location</strong> <input class="form-control" id="ms-State">
			</div>
			<div class="col-xs-12 col-md-3 form-group">
				<strong>Category</strong> <input class="form-control" id="ms-Category">
			</div>

			<div class="col-xs-6 col-md-2 pull-right form-group">
				</br>
				<button type="button" class="btn btn-primary form-control"
					id="getCriteria">Search</button>
			</div>
		</form>
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
	<%@ include file="/WEB-INF/includes/schoolSearchJS.jsp"%>
	<%@ include file="/WEB-INF/includes/generalJS.jsp"%>

</body>
</html>