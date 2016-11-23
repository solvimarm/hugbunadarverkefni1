package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\t\t<title>Homepage</title>\n");
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
      out.write("  \t\t\t\t<li role=\"presentation\" class=\"active\"><a href=\"homepage\">Home</a></li>\n");
      out.write("\t\t\t\t<li role=\"presentation\"><a href=\"myProfile\">My Profile</a></li>\n");
      out.write("\t\t\t\t<li role=\"presentation\"><a href=\"logout\">Log out</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t\t<h1>Welcome to your homepage!</h1>\n");
      out.write("  \t\t\t\t<p>Now you can start exercising.</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<form method=\"POST\", role=\"form\">\n");
      out.write("\t\t  \t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t   \t\t\t\t<div class=\"card card-block\">\n");
      out.write("\t\t      \t\t\t\t<h3 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day1Weekday}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h3>\n");
      out.write("\t\t      \t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day1Date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t     \t\t\t\t <ul class=\"list-group list-group-flush\">\n");
      out.write("\t\t     \t\t\t\t \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t \t\t\t\t \t\t</ul>\n");
      out.write("\t\t      \t\t\t\t<input type=\"submit\" name=\"day1\" class=\"btn btn-primary\" value=\"Fill in results\"></input>\n");
      out.write("\t\t    \t\t\t</div>\n");
      out.write("\t\t  \t\t\t</div>\n");
      out.write("\t\t \t\t\t <div class=\"col-sm-6\">\n");
      out.write("\t\t    \t\t\t<div class=\"card card-block\">\n");
      out.write("\t\t      \t\t\t\t<h3 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day2Weekday}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h3>\n");
      out.write("\t\t      \t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day2Date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t      \t\t\t\t<ul class=\"list-group list-group-flush\">\n");
      out.write("\t\t     \t\t\t\t \t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t \t\t\t\t \t\t</ul>\n");
      out.write("\t\t      \t\t\t\t<input type=\"submit\" name=\"day2\" class=\"btn btn-primary\" value=\"Fill in results\"></input>\n");
      out.write("\t\t    \t\t\t</div>\n");
      out.write("\t\t  \t\t\t</div>\n");
      out.write("\t\t  \t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t    \t\t\t<div class=\"card card-block\">\n");
      out.write("\t\t      \t\t\t\t<h3 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day3Weekday}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h3>\n");
      out.write("\t\t      \t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day3Date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t      \t\t\t\t<ul class=\"list-group list-group-flush\">\n");
      out.write("\t\t     \t\t\t\t \t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t \t\t\t\t \t\t</ul>\n");
      out.write("\t\t      \t\t\t\t<input type=\"submit\" name=\"day3\" class=\"btn btn-primary\" value=\"Fill in results\"></input>\n");
      out.write("\t\t    \t\t\t</div>\n");
      out.write("\t\t  \t\t\t</div>\n");
      out.write("\t\t  \t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t    \t\t\t<div class=\"card card-block\">\n");
      out.write("\t\t      \t\t\t\t<h3 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day4Weekday}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h3>\n");
      out.write("\t\t      \t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day4Date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t      \t\t\t\t<ul class=\"list-group list-group-flush\">\n");
      out.write("\t\t     \t\t\t\t \t");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t \t\t\t\t \t\t</ul>\n");
      out.write("\t\t      \t\t\t\t<input type=\"submit\" name=\"day4\" class=\"btn btn-primary\" value=\"Fill in results\"></input>\n");
      out.write("\t\t    \t\t\t</div>\n");
      out.write("\t\t  \t\t\t</div>\n");
      out.write("\t\t  \t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t    \t\t\t<div class=\"card card-block\">\n");
      out.write("\t\t      \t\t\t\t<h3 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day5Weekday}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h3>\n");
      out.write("\t\t      \t\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${day5Date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t      \t\t\t\t<ul class=\"list-group list-group-flush\">\n");
      out.write("\t\t     \t\t\t\t \t");
      if (_jspx_meth_c_005fforEach_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t \t\t\t\t \t\t</ul>\n");
      out.write("\t\t      \t\t\t\t<input type=\"submit\" name=\"day5\" class=\"btn btn-primary\" value=\"Fill in results\"></input>\n");
      out.write("\t\t    \t\t\t</div>\n");
      out.write("\t\t  \t\t\t</div>\n");
      out.write("\t\t  \t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t    \t\t\t<div class=\"card card-block\">\n");
      out.write("\t\t      \t\t\t\t<h3 class=\"card-title\">Diet Plan</h3>\n");
      out.write("\t\t      \t\t\t\t<p>Suggested diet plan just for you.</p>\n");
      out.write("\t\t      \t\t\t\t<ul class=\"list-group list-group-flush\">\n");
      out.write("\t\t      \t\t\t\t\t<li class=\"list-group-item\">Breakfast</li>\n");
      out.write("\t\t      \t\t\t\t\t<li class=\"list-group-item\">Lunch</li>\n");
      out.write("\t\t      \t\t\t\t\t<li class=\"list-group-item\">Dinner</li>\n");
      out.write("\t\t      \t\t\t\t</ul>\n");
      out.write("\t\t      \t\t\t\t<input type=\"submit\" name=\"food\" class=\"btn btn-primary\" value=\"Check it out\"></input>\n");
      out.write("\t\t    \t\t\t</div>\n");
      out.write("\t\t  \t\t\t</div>\n");
      out.write("\t\t  \t\t</form>\n");
      out.write("\t\t\t</div>\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</p>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/homepage.jsp(34,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("i");
    // /WEB-INF/pages/homepage.jsp(34,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/homepage.jsp(34,13) '${day1Ex}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${day1Ex}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t    \t\t\t\t\t\t\t<li class=\"list-group-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\n");
          out.write("\t    \t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/pages/homepage.jsp(46,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("i");
    // /WEB-INF/pages/homepage.jsp(46,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/homepage.jsp(46,13) '${day2Ex}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${day2Ex}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t    \t\t\t\t\t\t\t<li class=\"list-group-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\n");
          out.write("\t    \t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/pages/homepage.jsp(58,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("i");
    // /WEB-INF/pages/homepage.jsp(58,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/homepage.jsp(58,13) '${day3Ex}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${day3Ex}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t    \t\t\t\t\t\t\t<li class=\"list-group-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\n");
          out.write("\t    \t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    // /WEB-INF/pages/homepage.jsp(70,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("i");
    // /WEB-INF/pages/homepage.jsp(70,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/homepage.jsp(70,13) '${day4Ex}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${day4Ex}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t    \t\t\t\t\t\t\t<li class=\"list-group-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\n");
          out.write("\t    \t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent(null);
    // /WEB-INF/pages/homepage.jsp(82,13) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("i");
    // /WEB-INF/pages/homepage.jsp(82,13) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/homepage.jsp(82,13) '${day5Ex}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${day5Ex}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t    \t\t\t\t\t\t\t<li class=\"list-group-item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\n");
          out.write("\t    \t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }
}
