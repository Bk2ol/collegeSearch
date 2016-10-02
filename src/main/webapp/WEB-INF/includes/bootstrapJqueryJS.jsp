<script src="/CollegeSearch/static/js/jquery.min.js"></script>
<script src="/CollegeSearch/static/js/bootstrap.min.js"></script>
<script src="/CollegeSearch/static/js/ie10-viewport-bug-workaround.js"></script>
  <script>
  $(".nav a").on("click", function(){
	   $(".nav").find(".active").removeClass("active");
	   $(this).parent().addClass("active");
	});
  </script>