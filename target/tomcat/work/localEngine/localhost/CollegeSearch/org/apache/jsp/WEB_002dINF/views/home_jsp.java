package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(6);
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryCSS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/generalCSS.jsp");
    _jspx_dependants.add("/WEB-INF/views/header.jsp");
    _jspx_dependants.add("/WEB-INF/views/footer.jsp");
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryJS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/generalJS.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>US College Search</title>\n");
      out.write("<!-- <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/bootstrap.min.css\"></link>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/jumbotron.css\"></link>\n");
      out.write("\n");
      out.write('\n');
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/general.css\"  />");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t  \t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t  \t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t  \t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\" class=\"notActive\">USA College Search</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          \t<ul class=\"nav navbar-nav\">\n");
      out.write("\t            <li><a href=\"/CollegeSearch/\">Home</a></li>\n");
      out.write("\t            <li><a href=\"/CollegeSearch/school\">Colleges</a></li>\n");
      out.write("\t            <li><a href=\"/CollegeSearch/graduateSchool\">Grad School</a></li>\n");
      out.write("\t            <li><a  href=\"/CollegeSearch/GTExperience\">GRE/TOFEL</a></li>\n");
      out.write("          \t</ul>\n");
      out.write("          \t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            \t<li><a href=\"/CollegeSearch/aboutMe\">About me</a></li>\n");
      out.write("          \t</ul>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\t<div id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("\t\t<ol class=\"carousel-indicators\">\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("\t\t\t<li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("\t\t</ol>\n");
      out.write("\t\t<div class=\"carousel-inner\">\n");
      out.write("\t\t\t<div class=\"item active\">\n");
      out.write("\t\t\t\t<!-- <div class=\"carouselInnerDiv\"> -->\n");
      out.write("\t\t\t\t<div class=\"textDestination\">\n");
      out.write("\t\t\t\t\t<h2 class=\"featuredDestination\">\n");
      out.write("\t\t\t\t\t\t<span class='spacer'></span><span class='spacer'></span><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"bold\"> US College Search</br></span><span class='spacer'></span><span\n");
      out.write("\t\t\t\t\t\t\tclass='spacer'></span>Search College and Bulid your US Study By\n");
      out.write("\t\t\t\t\t\tYourself\n");
      out.write("\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<a href=\"/CollegeSearch/school\"> <img\n");
      out.write("\t\t\t\t\tsrc=\"http://localhost:8080/CollegeSearch/static/images/1.png\"\n");
      out.write("\t\t\t\t\talt=\"First slide\">\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t<div class=\"textDestination\">\n");
      out.write("\t\t\t\t\t<h2 class=\"featuredDestination\">\n");
      out.write("\t\t\t\t\t\t<span class='spacer'></span><span class='spacer'></span><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"bold\"> US Graduate College Search</br></span><span\n");
      out.write("\t\t\t\t\t\t\tclass='spacer'></span><span class='spacer'></span>Search Graduate\n");
      out.write("\t\t\t\t\t\tCollege Ranked by Major or Other Different Criteria\n");
      out.write("\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<a href=\"/CollegeSearch/graduateSchool\"> <img\n");
      out.write("\t\t\t\t\tsrc=\"http://localhost:8080/CollegeSearch/static/images/2.png\"\n");
      out.write("\t\t\t\t\talt=\"Second slide\">\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"item\">\n");
      out.write("\t\t\t\t<div class=\"textDestination\">\n");
      out.write("\t\t\t\t\t<h2 class=\"featuredDestination\">\n");
      out.write("\t\t\t\t\t\t<span class='spacer'></span><span class='spacer'></span><span\n");
      out.write("\t\t\t\t\t\t\tclass=\"bold\"> GRE / Tofel Experience</br></span><span\n");
      out.write("\t\t\t\t\t\t\tclass='spacer'></span><span class='spacer'></span>Improve Your Test Score\n");
      out.write("\t\t\t\t\t\tfrom Other People's Experience ! \n");
      out.write("\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<a href=\"/CollegeSearch/GTExperience\"><img\n");
      out.write("\t\t\t\t\tsrc=\"http://localhost:8080/CollegeSearch/static/images/3.png\"\n");
      out.write("\t\t\t\t\talt=\"Third slide\"> </a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<a class=\"carousel-control left\" href=\"#myCarousel\" data-slide=\"prev\">&lsaquo;</a>\n");
      out.write("\t\t<a class=\"carousel-control right\" href=\"#myCarousel\" data-slide=\"next\">&rsaquo;</a>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container mainContent\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<h2>2016 Undergraduate School List</h2>\n");
      out.write("\t\t\t\t<p>List most of undergraduate school in USA. Including the\n");
      out.write("\t\t\t\t\tschool rank, total cost, different percentage of SAT, ACT,\n");
      out.write("\t\t\t\t\tapplication deadline, minium / average toefl score, accept rate\n");
      out.write("\t\t\t\t\tschool type, setting, category,selectivity and population.</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-default\" href=\"/CollegeSearch/school/allSchools\"\n");
      out.write("\t\t\t\t\t\trole=\"button\">View details »</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<h2>2016 Graduate School List</h2>\n");
      out.write("\t\t\t\t<p>List most of graduate school in USA. Including the school\n");
      out.write("\t\t\t\t\trank in special major, degree offered, total cost, general test\n");
      out.write("\t\t\t\t\trequirement in GRE / GMAT / LSAT, language test requirement in\n");
      out.write("\t\t\t\t\tIEITS, application deadline.</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\thref=\"/CollegeSearch/graduateSchool/allGraduateSchools\"\n");
      out.write("\t\t\t\t\t\trole=\"button\">View details »</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t<h2>GRE TOEFL Experience</h2>\n");
      out.write("\t\t\t\t<p>We have all you need to parper the test, high socre experience, \n");
      out.write("\t\t\t\tthe recommend study material, how to improve your english form \n");
      out.write("\t\t\t\treading, writing, listening, speaking.</p>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<a class=\"btn btn-default\"\n");
      out.write("\t\t\t\t\t\thref=\"http://v3.bootcss.com/examples/jumbotron/#\" role=\"button\">View\n");
      out.write("\t\t\t\t\t\tdetails »</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
      out.write("  <div class=\"container\">\n");
      out.write("    <hr>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <p>© Company 2014</p>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write('\n');
      out.write('	');
      out.write("<script src=\"/CollegeSearch/static/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write('\n');
      out.write('	');
      out.write("<script src=\"/CollegeSearch/static/js/general.js\"></script>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
