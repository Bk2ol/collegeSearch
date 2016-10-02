<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>US College Search</title>
<%@ include file="/WEB-INF/includes/bootstrapJqueryCSS.jsp"%>
<%@ include file="/WEB-INF/includes/general.jsp"%>
<%@ include file="/WEB-INF/includes/graduateSchoolSearchCSS.jsp"%>
</head>

<body>
	<%@ include file="/WEB-INF/views/header.jsp"%>
	<div class="container mainContent" id='checkHightForLineUp'>
		<form>
			<div class="col-xs-12 col-sm-6 col-md-4 form-group">
				<strong>Major :</strong> <input class="form-control" id="ms-major">
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 form-group">
				<strong>Degree :</strong> <input class="form-control" id="ms-degree">
			</div>
			<div class="col-xs-6 col-sm-3 col-md-2 form-group">
				<strong>Rank :</strong> <input type="text"
					class="form-control form-inline" style="margin: 0" id="bottomRank">
			</div>
			<div class="col-xs-6 col-sm-3 col-md-2 form-group">
				</br> <input type="text" class="form-control" id="topRank">
			</div>
			<div class="col-xs-8 col-sm-4 col-md-3 form-group"
				id="checkHightForLineUp1">
				<strong>English Test</strong> <input class="form-control"
					id="ms-LanguageTest">
			</div>
			<div class="col-xs-4 col-sm-2 col-md-1 form-group">
				<strong id='englishTestLabel'>Score</strong> <input type="text"
					class="form-control" id="LanguageScore">
			</div>
			<div class="col-xs-8 col-sm-4 col-md-3 form-group">
				<strong>Test</strong> <input class="form-control" id="ms-Test">
			</div>
			<div class="col-xs-4 col-sm-2 col-md-1 form-group">
				<strong id='testLabel'>Score</strong> <input type="text"
					class="form-control" id="TestScore">
			</div>
			<div class="col-xs-12 col-sm-6 col-md-2 form-group" id='dateLineUp1'>
				<strong>Deadline Date</strong> <input class="form-control"
					id="ms-Deadline">
			</div>
			<div class="col-xs-12 col-sm-6 col-md-2 pull-right form-group"
				id='dateLineUp2'>
				<!-- <label for="dtp_input2" class="control-label" style="margin: 0" >select date:</label> -->
				</br>
				<div class="input-group date form_date " data-date=""
					data-date-format="dd MM yyyy" data-link-field="dtp_input2"
					data-link-format="yyyy-mm-dd">
					<span class="input-group-addon"> <span
						class="glyphicon glyphicon-calendar"></span>
					</span> <input class="form-control" size="6" type="text" value="" readonly>
				</div>
				<input type="hidden" id="dtp_input2" value="" />
			</div>
			<div class="col-xs-12 col-md-10 form-group">
				<strong>Location</strong> <input class="form-control" id="ms-state">
			</div>
			<div class="col-xs-6 col-md-2 pull-right form-group">
				</br>
				<button type="button" class="btn btn-success form-control"
					id="getCriteria">Search</button>
			</div>
		</form>
		<table id="graduateSchoolTable"  class="table table-striped table-bordered" cellspacing="0" width="100%">
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
	<%@ include file="/WEB-INF/includes/graduateSchoolSearchJS.jsp"%>


</body>
</html>