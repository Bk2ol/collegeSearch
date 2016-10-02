<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
  <title>US College Search</title>
  <%@ include file="/WEB-INF/includes/bootstrapJqueryCSS.jsp"%>
  <%@ include file="/WEB-INF/includes/general.jsp"%>
</head>

<body>
  <%@ include file="/WEB-INF/views/header.jsp"%>
  <div id="myCarousel" class="carousel slide">
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" 
      class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>   
    <div class="carousel-inner">
      <div class="item active" >
        <div style="position:absolute;z-indent:23;color:white;left: 200px; top: 133px;">
          <h1>US College Search</h1>
          <p>search college and bulid your US study by yourself</p>
          <a herf='#'>get start!</a>
        </div>
        <img src="http://localhost:8080/CollegeSearch/static/images/1.png" alt="First slide">
      </div>
      <div class="item">
       <img src="http://localhost:8080/CollegeSearch/static/images/2.png" alt="Second slide">
      </div>
       <div class="item">
         <img src="http://localhost:8080/CollegeSearch/static/images/3.png" alt="Third slide">
       </div>
    </div>
    <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
    <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
  </div>

  <div class="container mainContent">
    <div class="row">
      <div class="col-md-4">
        <h2>Heading</h2>
        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
        <p><a class="btn btn-default" href="http://v3.bootcss.com/examples/jumbotron/#" role="button">View details »</a></p>
      </div>
      <div class="col-md-4">
        <h2>Heading</h2>
        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
        <p><a class="btn btn-default" href="http://v3.bootcss.com/examples/jumbotron/#" role="button">View details »</a></p>
      </div>
      <div class="col-md-4">
        <h2>Heading</h2>
        <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
        <p><a class="btn btn-default" href="http://v3.bootcss.com/examples/jumbotron/#" role="button">View details »</a></p>
      </div>
    </div>
  </div> <!-- /container -->


<%@ include file="/WEB-INF/views/footer.jsp"%>
<%@ include file="/WEB-INF/includes/bootstrapJqueryJS.jsp"%>

</body>
</html>