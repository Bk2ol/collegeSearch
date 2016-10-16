package org.apache.jsp.WEB_002dINF.views.graduateSchool;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AllGraduateSchoolList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(7);
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryCSS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/generalCSS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/schoolSearchCSS.jsp");
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
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"icon\" href=\"favicon.ico\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/general.css\"  />\n");
      out.write('\n');
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/js/DataTables/media/css/dataTables.bootstrap.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/magicsuggest-min.css\"  />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/animate.min.css\"  />");
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
      out.write("\t<div class=\"container mainContent\">\n");
      out.write("\t<center><h1><strong>2016 Graduate School List</strong></h1></center>\n");
      out.write("\t<table id=\"graduateSchoolTable\"  class=\"table table-striped table-bordered table-hover\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>school</th>\n");
      out.write("\t\t\t\t\t<th>major</th>\n");
      out.write("\t\t\t\t\t<th>degree</th>\n");
      out.write("\t\t\t\t\t<th>rank</th>\n");
      out.write("\t\t\t\t\t<th>Test</th>\n");
      out.write("\t\t\t\t\t<th>Language Test</th>\n");
      out.write("\t\t\t\t\t<th>deadline</th>\n");
      out.write("\t\t\t\t\t<th>phone</th>\n");
      out.write("\t\t\t\t\t<th>email</th>\n");
      out.write("\t\t\t\t\t<th>admissionWebpage</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</thead>\n");
      out.write("\t\t\t<tbody>\n");
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t\t<tfoot>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>school</th>\n");
      out.write("\t\t\t\t\t<th>major</th>\n");
      out.write("\t\t\t\t\t<th>degree</th>\n");
      out.write("\t\t\t\t\t<th>rank</th>\n");
      out.write("\t\t\t\t\t<th>Test</th>\n");
      out.write("\t\t\t\t\t<th>Language Test</th>\n");
      out.write("\t\t\t\t\t<th>deadline</th>\n");
      out.write("\t\t\t\t\t<th>phone</th>\n");
      out.write("\t\t\t\t\t<th>email</th>\n");
      out.write("\t\t\t\t\t<th>admissionWebpage</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</tfoot>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
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
      out.write("\t<script src=\"/CollegeSearch/static/js/DataTables/media/js/jquery.dataTables.min.js\"></script>\n");
      out.write("\t<script src=\"/CollegeSearch/static/js/DataTables/media/js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"/CollegeSearch/static/js/bootstrap-notify.min.js\"></script>\n");
      out.write("\t<script src =\"/CollegeSearch/static/js/allGraduateSchoolJS.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\t\n");
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
