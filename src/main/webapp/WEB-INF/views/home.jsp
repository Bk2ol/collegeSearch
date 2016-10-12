<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>US College Search</title>
<%@ include file="/WEB-INF/includes/bootstrapJqueryCSS.jsp"%>
<%@ include file="/WEB-INF/includes/generalCSS.jsp"%>
</head>

<body>
	<%@ include file="/WEB-INF/views/header.jsp"%>
	<div id="myCarousel" class="carousel slide">
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="item active">
				<!-- <div class="carouselInnerDiv"> -->
				<div class="textDestination">
					<h2 class="featuredDestination">
						<span class='spacer'></span><span class='spacer'></span><span
							class="bold"> US College Search</br></span><span class='spacer'></span><span
							class='spacer'></span>Search College and Bulid your US Study By
						Yourself
					</h2>
				</div>
				<a href="/CollegeSearch/school"> <img
					src="http://localhost:8080/CollegeSearch/static/images/1.png"
					alt="First slide">
				</a>
			</div>
			<div class="item">
				<div class="textDestination">
					<h2 class="featuredDestination">
						<span class='spacer'></span><span class='spacer'></span><span
							class="bold"> US Graduate College Search</br></span><span
							class='spacer'></span><span class='spacer'></span>Search Graduate
						College Ranked by Major or Other Different Criteria
					</h2>
				</div>
				<a href="/CollegeSearch/graduateSchool"> <img
					src="http://localhost:8080/CollegeSearch/static/images/2.png"
					alt="Second slide">
				</a>
			</div>
			<div class="item">
				<div class="textDestination">
					<h2 class="featuredDestination">
						<span class='spacer'></span><span class='spacer'></span><span
							class="bold"> GRE / Tofel Experience</br></span><span
							class='spacer'></span><span class='spacer'></span>Improve Your Test Score
						from Other People's Experience ! 
					</h2>
				</div>
				<a href="/CollegeSearch/GTExperience"><img
					src="http://localhost:8080/CollegeSearch/static/images/3.png"
					alt="Third slide"> </a>
			</div>
		</div>
		<a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
		<a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
	</div>

	<div class="container mainContent">
		<div class="row">
			<div class="col-md-4">
				<h2>2016 Undergraduate School List</h2>
				<p>List most of undergraduate school in USA. Including the
					school rank, total cost, different percentage of SAT, ACT,
					application deadline, minium / average toefl score, accept rate
					school type, setting, category,selectivity and population.</p>
				<p>
					<a class="btn btn-default" href="/CollegeSearch/school/allSchools"
						role="button">View details »</a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>2016 Graduate School List</h2>
				<p>List most of graduate school in USA. Including the school
					rank in special major, degree offered, total cost, general test
					requirement in GRE / GMAT / LSAT, language test requirement in
					IEITS, application deadline.</p>
				<p>
					<a class="btn btn-default"
						href="/CollegeSearch/graduateSchool/allGraduateSchools"
						role="button">View details »</a>
				</p>
			</div>
			<div class="col-md-4">
				<h2>GRE TOEFL Experience</h2>
				<p>We have all you need to parper the test, high socre experience, 
				the recommend study material, how to improve your english form 
				reading, writing, listening, speaking.</p>
				<p>
					<a class="btn btn-default"
						href="http://v3.bootcss.com/examples/jumbotron/#" role="button">View
						details »</a>
				</p>
			</div>
		</div>
	</div>
	<!-- /container -->


	<%@ include file="/WEB-INF/views/footer.jsp"%>
	<%@ include file="/WEB-INF/includes/bootstrapJqueryJS.jsp"%>
	<%@ include file="/WEB-INF/includes/generalJS.jsp"%>
</body>
</html>