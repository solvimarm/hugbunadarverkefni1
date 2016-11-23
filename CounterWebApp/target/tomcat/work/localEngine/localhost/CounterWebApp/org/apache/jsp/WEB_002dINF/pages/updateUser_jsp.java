package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<title>Update your user information</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">         \n");
      out.write("\t\t<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<ul class=\"nav nav-tabs\">\n");
      out.write("  \t\t\t\t<li role=\"presentation\"><a href=\"homepage\">Home</a></li>\n");
      out.write("\t\t\t\t<li role=\"presentation\"><a href=\"myProfile\">My Profile</a></li>\n");
      out.write("\t\t\t\t<li role=\"presentation\"><a href=\"logout\">Log out</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t\t<h1>Update Your information!</h1>\n");
      out.write("  \t\t\t\t<p>...</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<form method=\"POST\" role=\"form\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"age\">Type your age</label>\n");
      out.write("\t\t\t\t\t<input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${age}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"text\" class=\"form-control\" name=\"age\" required/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"goal\">Select Goal</label>\n");
      out.write("\t\t\t\t\t<select name=\"goal\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goal}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\n");
      out.write("\t  \t\t\t\t\t<option value=\"stronger\"  selected=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stronger == goal ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Stronger</option>\n");
      out.write("\t  \t\t\t\t\t<option value=\"buffer\" selected=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${buffer == goal ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Buffer</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"leaner\" selected=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${leaner == goal ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Leaner</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"weight\">Type your weight</label>\n");
      out.write("\t\t\t\t\t<input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${weight}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" type=\"double\" pattern=\"^[0-9]+\\.?[0-9]+\" class=\"form-control\" name=\"weight\" required/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<p>If a Goal is changed then you will get a new program on this date ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${update}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t\t\t<input class=\"btn btn-primary\" type=\"submit\" name=\"submit\" value=\"Update\"/>\n");
      out.write("\t\t\t</form>\n");
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
