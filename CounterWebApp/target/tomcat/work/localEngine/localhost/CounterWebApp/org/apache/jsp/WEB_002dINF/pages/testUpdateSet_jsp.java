package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testUpdateSet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<title>update user</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">         \n");
      out.write("\t\t<script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
<<<<<<< HEAD:CounterWebApp/target/tomcat/work/localEngine/localhost/CounterWebApp/org/apache/jsp/WEB_002dINF/pages/testUpdateSet_jsp.java
      out.write("\t\t\t\t<form method=\"POST\" role=\"form\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label for=\"username\">Type your userName</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"username\"/>\n");
      out.write("\t\t\t\t\t\t<label for=\"dbweight\">Type your dwWeight</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"dbWeight\"/>\n");
      out.write("\t\t\t\t\t\t<label for=\"noOfSet\">Type your noOfSet</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"noOfSet\"/>\n");
      out.write("\t\t\t\t\t\t<label for=\"exerciseID\">Type your exerciseID</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"exerciseID\"/>\n");
      out.write("\t\t\t\t\t\t<label for=\"date\">Type your date</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"date\"/>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"button\" value=\"Submit\"/>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\n");
=======
      out.write("\t\t<div class = \"row\">\n");
      out.write("\t\t\t<div class =\"col-md-2\"></div>\n");
      out.write("\t\t\t<div class = \"col-md-8\">\n");
      out.write("\t\t\t\t<img src=\"/frontb.png\" alt=\"\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class = \"col-md-2\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class = \"row\">\n");
      out.write("\t\t\t<form method=\"POST\">\n");
      out.write("\t\t\t\t<div class = \"col-md-1\">\n");
      out.write("\t\t\t\t\t<input class =\"btn-primary\" type=\"submit\" name=\"login\" value=\"Login\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class = \"col-md-1\" >\n");
      out.write("\t\t\t\t\t<input class =\"btn-primary\t\" type=\"submit\" name=\"register\" value=\"Register\" />\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
>>>>>>> 93637e2a9f26bcd2a354ba9e0a2f3be16cc8a72e:CounterWebApp/target/tomcat/work/localEngine/localhost/CounterWebApp/org/apache/jsp/WEB_002dINF/pages/index_jsp.java
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
