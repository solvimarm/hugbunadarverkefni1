package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Login</title>\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"data:image/x-icon;,\" type=\"image/x-icon\"> \r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../css/testcss.css\">       \r\n");
      out.write("\t\t<script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class= \"container\">\t\r\n");
      out.write("\t\t\t<div class = \"row\">\r\n");
      out.write("\t\t\t\t<div class = \"col-md-8\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t<img src=\"src/main/WEB-INF/images/picture.jpg\" />\r\n");
      out.write("\t\t\t<div class = \"row\">\r\n");
      out.write("\t\t\t\t<div class =\"col-md-2\"></div>\r\n");
      out.write("\t\t\t\t<div class = \"col-md-8\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("images/frontb.png\"/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class = \"col-md-2\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class = \"row\">\r\n");
      out.write("\t\t\t\t<form method=\"POST\">\r\n");
      out.write("\t\t\t\t\t<div class = \"col-md-1\">\r\n");
      out.write("\t\t\t\t\t\t<input class =\"btn-primary\" type=\"submit\" name=\"login\" value=\"Login\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class = \"col-md-1\" >\r\n");
      out.write("\t\t\t\t\t\t<input class =\"btn-primary\t\" type=\"submit\" name=\"register\" value=\"Register\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/index.jsp(22,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/images/picture.jpg");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
