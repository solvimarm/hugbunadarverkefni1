package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class currentCycle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Current Workout Plan</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">         \n");
      out.write("\t\t<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("  \t\t\t<div class=\"col-sm-6\">\n");
      out.write("   \t\t\t\t<div class=\"card card-block\">\n");
      out.write("      \t\t\t\t<h3 class=\"card-title\">MÃ¡nudagur</h3>\n");
      out.write("     \t\t\t\t <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("      \t\t\t\t<a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("    \t\t\t</div>\n");
      out.write("  \t\t\t</div>\n");
      out.write(" \t\t\t <div class=\"col-sm-6\">\n");
      out.write("    \t\t\t<div class=\"card card-block\">\n");
      out.write("      \t\t\t\t<h3 class=\"card-title\">ÃriÃ°judagur</h3>\n");
      out.write("      \t\t\t\t<p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("     \t\t\t\t<a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("    \t\t\t</div>\n");
      out.write("  \t\t\t</div>\n");
      out.write("  \t\t\t<div class=\"col-sm-6\">\n");
      out.write("    \t\t\t<div class=\"card card-block\">\n");
      out.write("      \t\t\t\t<h3 class=\"card-title\">MiÃ°vikudagur</h3>\n");
      out.write("      \t\t\t\t<p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("     \t\t\t\t<a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("    \t\t\t</div>\n");
      out.write("  \t\t\t</div>\n");
      out.write("  \t\t\t<div class=\"col-sm-6\">\n");
      out.write("    \t\t\t<div class=\"card card-block\">\n");
      out.write("      \t\t\t\t<h3 class=\"card-title\">Fimmtudagur</h3>\n");
      out.write("      \t\t\t\t<p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("     \t\t\t\t<a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("    \t\t\t</div>\n");
      out.write("  \t\t\t</div>\n");
      out.write("  \t\t\t<div class=\"col-sm-6\">\n");
      out.write("    \t\t\t<div class=\"card card-block\">\n");
      out.write("      \t\t\t\t<h3 class=\"card-title\">FÃ¶studagur</h3>\n");
      out.write("      \t\t\t\t<p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("     \t\t\t\t<a href=\"#\" class=\"btn btn-primary\">Go somewhere</a>\n");
      out.write("    \t\t\t</div>\n");
      out.write("  \t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
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