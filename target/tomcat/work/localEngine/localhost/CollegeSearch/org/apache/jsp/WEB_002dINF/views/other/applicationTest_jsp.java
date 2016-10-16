package org.apache.jsp.WEB_002dINF.views.other;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class applicationTest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(7);
    _jspx_dependants.add("/WEB-INF/includes/bootstrapJqueryCSS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/generalCSS.jsp");
    _jspx_dependants.add("/WEB-INF/includes/graduateSchoolSearchCSS.jsp");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/bootstrap-datetimepicker.min.css\"  />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/magicsuggest-min.css\"  />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/CollegeSearch/static/css/animate.min.css\"  />");
      out.write("\n");
      out.write("</head>\n");
      out.write("</head>\n");
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
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<article class=\"post\">\n");
      out.write("\t\t\t<div class=\"post-head\">\n");
      out.write("\t\t\t\t<h1 class=\"post-title\">Foolproof Guide To A 340 on GRE</h1>\n");
      out.write("\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t<span class=\"author\">Author：crazyrobin</span> &bull;\n");
      out.write("\t\t\t\t\t<time class=\"post-date\" datetime=\"2013-3-9 \">2013-3-9 </time>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"featured-media\">\n");
      out.write("\t\t\t\t<img\n");
      out.write("\t\t\t\t\tsrc=\"http://localhost:8080/CollegeSearch/static/images/GRE340.png\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"post-content\">\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tThere may be thousands of Gre experience on the internet. But some\n");
      out.write("\t\t\t\t\tmay lack of details, some may be tedious to find the real useful\n");
      out.write("\t\t\t\t\tcontent. This GRE experience written by crazyrobin is one of the\n");
      out.write("\t\t\t\t\tbest experience. The author tells how to crack the every kind of\n");
      out.write("\t\t\t\t\tproblem in details, what study material you need, how to train your\n");
      out.write("\t\t\t\t\tspeed and gives you the a lot of example. The content includes:</br>\n");
      out.write("\t\t\t\t\t1.test-day experience</br> 2.the importance of getting and staying\n");
      out.write("\t\t\t\t\tmotivated the importance of proper nutrition, warm-up, and sleep </br>3.creating\n");
      out.write("\t\t\t\t\tor following a specific study plan </br>4.the importance of proper\n");
      out.write("\t\t\t\t\ttiming (including the importance of having time to correct\n");
      out.write("\t\t\t\t\tmistakes) </br>5.indicating your confidence in your answer </br>6.logical\n");
      out.write("\t\t\t\t\treasoning on gre </br>6.reading comprehensive and pear</br>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"post-permalink\">\n");
      out.write("\t\t\t\t<a href=\"http://bbs.gter.net/thread-1510435-1-1.html\"\n");
      out.write("\t\t\t\t\ttarget=\"_blank\" class=\"btn btn-primary\">View details »</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<footer class=\"post-footer\"> </footer> </article>\n");
      out.write("\n");
      out.write("\t\t\t<article class=\"post\">\n");
      out.write("\t\t\t<div class=\"post-head\">\n");
      out.write("\t\t\t\t<h1 class=\"post-title\">写一点关于IBT备考资料选择的建议</h1>\n");
      out.write("\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t<span class=\"author\">Author：秋雨荆州</span> &bull;\n");
      out.write("\t\t\t\t\t<time class=\"post-date\" datetime=\"2012-9-9 \">2012-9-9 </time>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"featured-media\">\n");
      out.write("\t\t\t\t<img\n");
      out.write("\t\t\t\t\tsrc=\"http://localhost:8080/CollegeSearch/static/images/studystress.jpg\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"post-content\">\n");
      out.write("\t\t\t\t<p>备考托福最好的材料就是OG和TPO。新的备考材料层出不穷，但是这两个材料互为表里，绝对是各位版友必\n");
      out.write("\t\t\t\t\t须认真研究的。OG充分阐述了ETS的各种要求，也给出了很多不错的注意点、训练建议；TPO就是托福的退役\n");
      out.write("\t\t\t\t\t真题。目前可以免费下到的是1~24，越到后面的套题越接近最近的考试难度。本帖的介绍分三大块，第一块综\n");
      out.write("\t\t\t\t\t合模考软件，第二块专项练习材料，第三块词汇材料选择......</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"post-permalink\">\n");
      out.write("\t\t\t\t<a href=\"http://bbs.gter.net/thread-1449469-1-1.html\"\n");
      out.write("\t\t\t\t\ttarget=\"_blank\" class=\"btn btn-primary\">View details »</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<footer class=\"post-footer\"> </footer> </article>\n");
      out.write("\n");
      out.write("\t\t\t<article class=\"post\">\n");
      out.write("\t\t\t<div class=\"post-head\">\n");
      out.write("\t\t\t\t<h1 class=\"post-title\">破解托福口语高分</h1>\n");
      out.write("\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t<span class=\"author\">Author：crazyrobin</span> &bull;\n");
      out.write("\t\t\t\t\t<time class=\"post-date\" datetime=\"2015-10-10 \">2015-10-10 </time>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"featured-media\">\n");
      out.write("\t\t\t\t<img\n");
      out.write("\t\t\t\t\tsrc=\"http://localhost:8080/CollegeSearch/static/images/maxresdefault.jpg\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"post-content\">\n");
      out.write("\t\t\t\t<p>托福口语分为2个部分，independent task, 也就是常见的口语第一题和第二题 (task 1, task\n");
      out.write("\t\t\t\t\t2), 另外便是Integrated task, 也就是常见的口语 第三题到第六题，这其中又两个系列， campus\n");
      out.write("\t\t\t\t\tsituation (task 3 & task 5) 和academic lecture (task 4 & task 6)\n");
      out.write("\t\t\t\t\t下面会用具体的列子分析每一道题考察的点， Task 1 & Task 2 Familiar topic Task 1\n");
      out.write("\t\t\t\t\t这道题会给你一个熟悉的话题让你谈谈一些经历和理解。 答题要点......</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"post-permalink\">\n");
      out.write("\t\t\t\t<a href=\"http://bbs.gter.net/thread-1596093-1-1.html\"\n");
      out.write("\t\t\t\t\ttarget=\"_blank\" class=\"btn btn-primary\">View details »</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<footer class=\"post-footer\"> </footer> </article>\n");
      out.write("\t\t\t<article class=\"post\">\n");
      out.write("\t\t\t<div class=\"post-head\">\n");
      out.write("\t\t\t\t<h1 class=\"post-title\">托福综合写作误区解读+TPO实例写作</h1>\n");
      out.write("\t\t\t\t<div class=\"post-meta\">\n");
      out.write("\t\t\t\t\t<span class=\"author\">Author：秋雨荆州</span> &bull;\n");
      out.write("\t\t\t\t\t<time class=\"post-date\" datetime=\"2012-6-27 \">2012-6-27 </time>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"featured-media\">\n");
      out.write("\t\t\t\t<img\n");
      out.write("\t\t\t\t\tsrc=\"http://localhost:8080/CollegeSearch/static/images/study.jpg\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"post-content\">\n");
      out.write("\t\t\t\t<p>一直觉得综合写作是托福IBT考试中在短时间里最容易练出成果练到最高水准的。然而看了很多同学的习作，以及考试最后的判分，却发现结果却并不如人意。\n");
      out.write("\t\t\t\t\t说综合写作能短时间上手原因如下：听力材料相比listening section要容易，阅读材料相比reading\n");
      out.write("\t\t\t\t\tsection要容易，所考查的组织语言要求相比 independent\n");
      out.write("\t\t\t\t\twriting也要容易。唯一要做的就是先听听力记下笔记，然后联系阅读材料，组织成一篇文章。\n");
      out.write("\t\t\t\t\t很多版友在准备综合作文时候陷入了一些误区，根据昨天备考小组内部的讨论，sin姐的各种神级答疑解惑，收集总结如下......</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"post-permalink\">\n");
      out.write("\t\t\t\t<a href=\"http://bbs.gter.net/thread-1596093-1-1.html\"\n");
      out.write("\t\t\t\t\ttarget=\"_blank\" class=\"btn btn-primary\">View details »</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<footer class=\"post-footer\"> </footer> </article>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");
      out.write("\n");
      out.write("    <hr>\n");
      out.write("    <footer class=\" footer-basic-centered\">\n");
      out.write("        <p class=\"footer-company-motto\">USA College Search</p>\n");
      out.write("\n");
      out.write("\t\t\t<p class=\"footer-links\">\n");
      out.write("\t\t\t\t<a href=\"/CollegeSearch/\">Home</a>\n");
      out.write("\t\t\t\t·\n");
      out.write("\t\t\t\t<a href=\"/CollegeSearch/school\">Colleges</a>\n");
      out.write("\t\t\t\t·\n");
      out.write("\t\t\t\t<a href=\"/CollegeSearch/graduateSchool\">Grad School</a>\n");
      out.write("\t\t\t\t·\n");
      out.write("\t\t\t\t<a  href=\"/CollegeSearch/GTExperience\">GRE/TOFEL</a>\n");
      out.write("\t\t\t\t·\n");
      out.write("\t\t\t\t<a href=\"/CollegeSearch/aboutMe\">About me</a>\n");
      out.write("\n");
      out.write("\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t<!-- \t<p class=\"footer-company-name\">Company Name &copy; 2015</p> -->\n");
      out.write("    </footer>\n");
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
