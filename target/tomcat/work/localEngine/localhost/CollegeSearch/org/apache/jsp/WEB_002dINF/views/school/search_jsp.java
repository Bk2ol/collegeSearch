package org.apache.jsp.WEB_002dINF.views.school;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(7);
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryCSS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/general.jsp");
    _jspx_dependants.add("/WEB-INF/includes/schoolSearchCSS.jsp");
    _jspx_dependants.add("/WEB-INF/views/header.jsp");
    _jspx_dependants.add("/WEB-INF/views/footer.jsp");
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryJS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/schoolSearchJS.jsp");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"icon\" href=\"http://v3.bootcss.com/favicon.ico\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/bootstrap.min.css\"></link>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/jumbotron.css\"></link>\n");
      out.write('\n');
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/general.css\"  />");
      out.write('\n');
      out.write("<!-- <link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/js/DataTables/media/css/jquery.dataTables.min.css\" /> -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/js/DataTables/media/css/dataTables.bootstrap.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/magicsuggest-min.css\"  />");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t");
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
      out.write("\t<div class=\"container mainContent\" id='checkHightForLineUp'>\n");
      out.write("\t\t<form>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 form-group\">\n");
      out.write("\t\t\t\t<h4>Enter Your Scores</h4>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-2 form-group\">\n");
      out.write("\t\t\t\t<strong>GPA :</strong> <input type=\"text\"\n");
      out.write("\t\t\t\t\tclass=\"form-control form-inline\" style=\"margin: 0\" id=\"GPA\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-8 col-sm-4 col-md-3 form-group\"\n");
      out.write("\t\t\t\tid=\"heightStandard\">\n");
      out.write("\t\t\t\t<strong>English Test</strong> <input class=\"form-control\"\n");
      out.write("\t\t\t\t\tid=\"ms-LanguageTest\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-4 col-sm-2 col-md-1 form-group\">\n");
      out.write("\t\t\t\t<strong id='englishTestLabel'>Score</strong> <input type=\"text\"\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"LanguageScore\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-3 form-group\">\n");
      out.write("\t\t\t\t<strong>Test</strong> <input class=\"form-control\" id=\"ms-Test\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-4 col-sm-2 col-md-1 form-group\">\n");
      out.write("\t\t\t\t<strong>Reading</strong> <input type=\"text\"\n");
      out.write("\t\t\t\t\tclass=\"form-control form-inline\" style=\"margin: 0\" id=\"Reading\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-4 col-sm-2 col-md-1 form-group\">\n");
      out.write("\t\t\t\t<strong>Math</strong> <input type=\"text\"\n");
      out.write("\t\t\t\t\tclass=\"form-control form-inline\" style=\"margin: 0\" id=\"Math\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-4 col-sm-2 col-md-1 form-group\">\n");
      out.write("\t\t\t\t<strong>Essay</strong> <input type=\"text\"\n");
      out.write("\t\t\t\t\tclass=\"form-control form-inline\" style=\"margin: 0\" id=\"Essay\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-md-6 form-group\">\n");
      out.write("\t\t\t\t<strong>SAT II</strong> <input class=\"form-control\" id=\"ms-SatII\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 form-group\">\n");
      out.write("\t\t\t\t<h4>Select Your Preferences</h4>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-sm-3 col-md-2 form-group\"\n");
      out.write("\t\t\t\tid=\"heightForBottomRank\">\n");
      out.write("\t\t\t\t<strong>Rank :</strong> <input type=\"text\"\n");
      out.write("\t\t\t\t\tclass=\"form-control form-inline\" style=\"margin: 0\" id=\"bottomRank\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-sm-3 col-md-2 form-group\"\n");
      out.write("\t\t\t\tid=\"heightForTopRank\">\n");
      out.write("\t\t\t\t</br> <input type=\"text\" class=\"form-control\" style=\"margin: 0\"\n");
      out.write("\t\t\t\t\tid=\"topRank\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-4 form-group\">\n");
      out.write("\t\t\t\t<strong>Total Cost</strong> <input class=\"form-control\" id=\"ms-Cost\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-4 form-group\">\n");
      out.write("\t\t\t\t<strong>Acceptance Rate(%)</strong> <input class=\"form-control\"\n");
      out.write("\t\t\t\t\tid=\"ms-AcceptRate\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-4 form-group\">\n");
      out.write("\t\t\t\t<strong>Type</strong> <input class=\"form-control\" id=\"ms-Type\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-4 form-group\">\n");
      out.write("\t\t\t\t<strong>Setting</strong> <input class=\"form-control\" id=\"ms-Setting\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-4 form-group\">\n");
      out.write("\t\t\t\t<strong>Size</strong> <input class=\"form-control\" id=\"ms-Size\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-md-7 form-group\">\n");
      out.write("\t\t\t\t<strong>Location</strong> <input class=\"form-control\" id=\"ms-State\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-md-3 form-group\">\n");
      out.write("\t\t\t\t<strong>Category</strong> <input class=\"form-control\" id=\"ms-Category\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-2 pull-right form-group\">\n");
      out.write("\t\t\t\t</br>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-success form-control\"\n");
      out.write("\t\t\t\t\tid=\"getCriteria\">Search</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<table id=\"schoolTable\" class=\"table table-striped table-bordered\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("\t\t\t<thead>\n");
      out.write("\t\t\t\t<th>school</th>\n");
      out.write("\t\t\t\t<th>Rank</th>\n");
      out.write("\t\t\t\t<th>Total Cost</th>\n");
      out.write("\t\t\t\t<th>Average GPA</th>\n");
      out.write("\t\t\t\t<th>SAT1/ACT (25th-75th%)</th>\n");
      out.write("\t\t\t\t<th>TOEFL Score (Min/Avg)</th>\n");
      out.write("\t\t\t\t<th>Application Deadline</th>\n");
      out.write("\t\t\t\t<th>Location</th>\n");
      out.write(" \t\t\t\t<th>acceptRate</th>\n");
      out.write("\t\t\t\t<th>Type</th>\n");
      out.write("\t\t\t\t<th>setting</th>\n");
      out.write("\t\t\t\t<th>category</th>\n");
      out.write("\t\t\t\t<th>size</th> \n");
      out.write("\t\t\t<tbody>\n");
      out.write("\n");
      out.write("\t\t\t</tbody>\n");
      out.write("\t\t\t<tfoot>\n");
      out.write("\t\t\t\t<th>school</th>\n");
      out.write("\t\t\t\t<th>Rank</th>\n");
      out.write("\t\t\t\t<th>Total Cost</th>\n");
      out.write("\t\t\t\t<th>Accept Rate</th>\n");
      out.write("\t\t\t\t<th>SAT1/ACT (25th-75th%)</th>\n");
      out.write("\t\t\t\t<th>TOEFL Score (Min/Avg)</th>\n");
      out.write("\t\t\t\t<th>Application Deadline</th>\n");
      out.write("\t\t\t\t<th>Location</th>\n");
      out.write("\t\t\t\t<th>acceptRate</th>\n");
      out.write("\t\t\t\t<th>Type</th>\n");
      out.write("\t\t\t\t<th>setting</th>\n");
      out.write("\t\t\t\t<th>category</th>\n");
      out.write("\t\t\t\t<th>size</th>\n");
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
      out.write("  <script>\n");
      out.write("  $(\".nav a\").on(\"click\", function(){\n");
      out.write("\t   $(\".nav\").find(\".active\").removeClass(\"active\");\n");
      out.write("\t   $(this).parent().addClass(\"active\");\n");
      out.write("\t});\n");
      out.write("  </script>");
      out.write('\n');
      out.write('	');
      out.write("<script src=\"/CollegeSearch/static/js/DataTables/media/js/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/DataTables/media/js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/magicsuggest-min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/school.js\"></script>");
      out.write("\n");
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
