package org.apache.jsp.WEB_002dINF.views.graduateSchool;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(8);
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryCSS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/generalCSS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/graduateSchoolSearchCSS.jsp");
    _jspx_dependants.add("/WEB-INF/views/header.jsp");
    _jspx_dependants.add("/WEB-INF/views/footer.jsp");
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryJS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/graduateSchoolSearchJS.jsp");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/general.css\"  />");
      out.write('\n');
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/js/DataTables/media/css/dataTables.bootstrap.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/bootstrap-datetimepicker.min.css\"  />\n");
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
      out.write("\t<div class=\"container mainContent\" id='checkHightForLineUp'>\n");
      out.write("\t\t<form>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-12 col-md-12 form-group\">\n");
      out.write("\t\t\t\t<h4>Enter Your information</h4>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-4 form-group\">\n");
      out.write("\t\t\t\t<strong>Major :</strong> <input class=\"form-control\" id=\"ms-major\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-4 form-group\">\n");
      out.write("\t\t\t\t<strong>Degree :</strong> <input class=\"form-control\" id=\"ms-degree\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-sm-3 col-md-2 form-group\">\n");
      out.write("\t\t\t\t<strong>Rank :</strong> <input type=\"text\"\n");
      out.write("\t\t\t\t\tclass=\"form-control form-inline\" style=\"margin: 0\" id=\"bottomRank\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-sm-3 col-md-2 form-group\">\n");
      out.write("\t\t\t\t</br> <input type=\"text\" class=\"form-control\" id=\"topRank\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-8 col-sm-4 col-md-3 form-group\"\n");
      out.write("\t\t\t\tid=\"checkHightForLineUp1\">\n");
      out.write("\t\t\t\t<strong>English Test</strong> <input class=\"form-control\"\n");
      out.write("\t\t\t\t\tid=\"ms-LanguageTest\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-4 col-sm-2 col-md-1 form-group\">\n");
      out.write("\t\t\t\t<strong id='englishTestLabel'>Score</strong> <input type=\"text\"\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"LanguageScore\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-8 col-sm-4 col-md-3 form-group\">\n");
      out.write("\t\t\t\t<strong>Test</strong> <input class=\"form-control\" id=\"ms-Test\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-4 col-sm-2 col-md-1 form-group\">\n");
      out.write("\t\t\t\t<strong id='testLabel'>Score</strong> <input type=\"text\"\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"TestScore\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-2 form-group\" id='dateLineUp1'>\n");
      out.write("\t\t\t\t<strong>Deadline Date</strong> <input class=\"form-control\"\n");
      out.write("\t\t\t\t\tid=\"ms-Deadline\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6 col-md-2 pull-right form-group\"\n");
      out.write("\t\t\t\tid='dateLineUp2'>\n");
      out.write("\t\t\t\t</br>\n");
      out.write("\t\t\t\t<div class=\"input-group date form_date \" data-date=\"\"\n");
      out.write("\t\t\t\t\tdata-date-format=\"dd MM yyyy\" data-link-field=\"dtp_input2\"\n");
      out.write("\t\t\t\t\tdata-link-format=\"yyyy-mm-dd\">\n");
      out.write("\t\t\t\t\t<span class=\"input-group-addon\"> <span\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-calendar\"></span>\n");
      out.write("\t\t\t\t\t</span> <input class=\"form-control\" size=\"6\" type=\"text\" value=\"\" readonly>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"dtp_input2\" value=\"\" />\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-md-10 form-group\">\n");
      out.write("\t\t\t\t<strong>Location</strong> <input class=\"form-control\" id=\"ms-state\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-6 col-md-2 pull-right form-group\">\n");
      out.write("\t\t\t\t</br>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-success form-control\"\n");
      out.write("\t\t\t\t\tid=\"getCriteria\">Search</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<table id=\"graduateSchoolTable\"  class=\"table table-striped table-bordered table-hover\" cellspacing=\"0\" width=\"100%\">\n");
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
      out.write("<script src=\"/CollegeSearch/static/js/DataTables/media/js/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/DataTables/media/js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/magicsuggest-min.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/graduateSchool.js\"></script>\n");
      out.write("<script src=\"/CollegeSearch/static/js/bootstrap-notify.min.js\"></script>");
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
