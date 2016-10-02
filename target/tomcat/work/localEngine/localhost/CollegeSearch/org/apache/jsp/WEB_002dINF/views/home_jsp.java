package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryCSS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/general.jsp");
    _jspx_dependants.add("/WEB-INF/views/header.jsp");
    _jspx_dependants.add("/WEB-INF/views/footer.jsp");
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryJS.jsp");
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
      out.write("  <title>US College Search</title>\n");
      out.write("  ");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"icon\" href=\"http://v3.bootcss.com/favicon.ico\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/bootstrap.min.css\"></link>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/jumbotron.css\"></link>\n");
      out.write('\n');
      out.write(' ');
      out.write(' ');
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/general.css\"  />");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  ");
      out.write("  <nav class=\"navbar navbar-default navbar-inverse navbar-fixed-top \">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"navbar-header\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"/CollegeSearch/\">Home</a>\n");
      out.write("        <a class=\"navbar-brand\" href=\"/CollegeSearch/school\">Colleges</a>\n");
      out.write("        <a class=\"navbar-brand\" href=\"/CollegeSearch/graduateSchool\">Grad School</a>\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">GRE/TOFEL</a>\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">About me</a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("<!--       <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("        <form class=\"navbar-form navbar-right\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <input type=\"text\" placeholder=\"Email\" class=\"form-control\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("          </div>\n");
      out.write("          <button type=\"submit\" class=\"btn btn-success\">Sign in</button>\n");
      out.write("          <button type=\"submit\" class=\"btn btn-success\">Sign up</button>\n");
      out.write("        </form>\n");
      out.write("      </div> -->\n");
      out.write("    </div>\n");
      out.write("  </nav>");
      out.write("\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" \n");
      out.write("      class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>   \n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"item active\" >\n");
      out.write("        <div style=\"position:absolute;z-indent:23;color:white;left: 200px; top: 133px;\">\n");
      out.write("          <h1>US College Search</h1>\n");
      out.write("          <p>search college and bulid your US study by yourself</p>\n");
      out.write("          <a herf='#'>get start!</a>\n");
      out.write("        </div>\n");
      out.write("        <img src=\"http://localhost:8080/CollegeSearch/static/images/1.png\" alt=\"First slide\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item\">\n");
      out.write("       <img src=\"http://localhost:8080/CollegeSearch/static/images/2.png\" alt=\"Second slide\">\n");
      out.write("      </div>\n");
      out.write("       <div class=\"item\">\n");
      out.write("         <img src=\"http://localhost:8080/CollegeSearch/static/images/3.png\" alt=\"Third slide\">\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("    <a class=\"carousel-control left\" href=\"#myCarousel\" data-slide=\"prev\">&lsaquo;</a>\n");
      out.write("    <a class=\"carousel-control right\" href=\"#myCarousel\" data-slide=\"next\">&rsaquo;</a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"container mainContent\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <h2>Heading</h2>\n");
      out.write("        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"http://v3.bootcss.com/examples/jumbotron/#\" role=\"button\">View details »</a></p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <h2>Heading</h2>\n");
      out.write("        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"http://v3.bootcss.com/examples/jumbotron/#\" role=\"button\">View details »</a></p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <h2>Heading</h2>\n");
      out.write("        <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"http://v3.bootcss.com/examples/jumbotron/#\" role=\"button\">View details »</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div> <!-- /container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <hr>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <p>© Company 2014</p>\n");
      out.write("    </footer>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write('\n');
      out.write("<script src=\"/CollegeSearch/static/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("  <script>\n");
      out.write("  $(\".nav a\").on(\"click\", function(){\n");
      out.write("\t   $(\".nav\").find(\".active\").removeClass(\"active\");\n");
      out.write("\t   $(this).parent().addClass(\"active\");\n");
      out.write("\t});\n");
      out.write("  </script>");
      out.write("\n");
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
