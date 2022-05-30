package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class courseDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Course Detail|Edu-FCourse</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/98df298cac.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/98df298cac.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/home.css\"/>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <link href=\"../css/courseDetail.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <!-- Header side -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../view/base/header.jsp", out, false);
      out.write(" \r\n");
      out.write("        <div class=\"body\">\r\n");
      out.write("            <!--Content course detail-->\r\n");
      out.write("            <div class=\"row text-center content-detail\">\r\n");
      out.write("                <div class=\"col-lg-2 col-sm-12\">\r\n");
      out.write("                    <h4 style=\"text-align: center; margin: 5%;\">All Subject Category</h4>\r\n");
      out.write("                    <div class=\"scroll\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-8 col-sm-12\">\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <div >\r\n");
      out.write("                            <img class=\"d-block w-100\" src=\"../images/courses/anh_course_temp.jpg\" alt=\"First slide\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"ttr-post-title \">\r\n");
      out.write("                        <h1 class=\"post-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Course.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Course.tagline}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("                        <h4> About this Specialization</h4>\r\n");
      out.write("                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Course.briefinfo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-2 col-sm-12  \" id=\"featuredsubjects\">\r\n");
      out.write("                    <div class=\"course-price text-center\"><br><br>\r\n");
      out.write("                        original price <del>$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.PricePackes.get(0).listPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </del>\r\n");
      out.write("                        <h4 class=\"price\"> $");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.PricePackes.get(0).salePrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("                            per month</h4><br><br>\r\n");
      out.write("                        <h6>When you subscribe you'll get access to:</h6>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <h7>Practice material,graded assignments, discussion forums and more.\r\n");
      out.write("                            Certificates to share on your resume, Linkedin, or CV. \r\n");
      out.write("                            24/7 customer support \r\n");
      out.write("                            and Easy cancellation</h7>\r\n");
      out.write("                    </div><br>\r\n");
      out.write("                    <div class=\"course-buy-now text-center\">\r\n");
      out.write("                        <input type=\"button\" value=\"Register This Courses\" class=\"test\">\r\n");
      out.write("                        <p><br>Start ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.now}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>    \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"description \">\r\n");
      out.write("                <h2 class=\"text-center Courses_Specialization \">There are ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Topics.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \r\n");
      out.write("                    Courses in this Specialization</h2>\r\n");
      out.write("                <div class=\"scroll\">      \r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>  \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <h1 class=\"text-center content-detail description\">featured subjects</h1> \r\n");
      out.write("            <div class=\"row \">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"cards col-md-4 col-xs-6\">\r\n");
      out.write("                    <div class=\"course-card\">\r\n");
      out.write("                        <div class=\"card-infor\">\r\n");
      out.write("                            <div class=\"card-img\">\r\n");
      out.write("                                <img src=\"../images/courses/anh_course_temp.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"card-title\">\r\n");
      out.write("                                <a href=\"#\">SWP</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"card-subject\">Soft Ware</p>\r\n");
      out.write("                            <p class=\"card-price\">$99</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cards col-md-4 col-xs-6\">\r\n");
      out.write("                    <div class=\"course-card\">\r\n");
      out.write("                        <div class=\"card-infor\">\r\n");
      out.write("                            <div class=\"card-img\">\r\n");
      out.write("                                <img src=\"../images/courses/anh_course_temp.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-title\">\r\n");
      out.write("                                <a href=\"#\">SWP</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"card-subject\">Soft Ware</p>\r\n");
      out.write("                            <p class=\"card-price\">$99</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"cards col-md-4 col-xs-6\">\r\n");
      out.write("                    <div class=\"course-card \">\r\n");
      out.write("                        <div class=\"card-infor\">\r\n");
      out.write("                            <div class=\"card-img\">\r\n");
      out.write("                                <img src=\"../images/courses/anh_course_temp.jpg\" alt=\"\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"card-title\">\r\n");
      out.write("                                <a href=\"#\">SWP</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"card-subject\">Soft Ware</p>\r\n");
      out.write("                            <p class=\"card-price\">$99</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- footer side -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../view/base/footer.jsp", out, false);
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Categorys}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("Category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <div class=\"subject\">\r\n");
          out.write("                                <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Category.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Topics}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("t");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"row text-center \">\r\n");
          out.write("                            <div class=\"col-lg-3 col-sm-12 text-center nametopic\">\r\n");
          out.write("                                <h6 class=\"Tid\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\r\n");
          out.write("                                <h6 class=\"topicName\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.topicName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\r\n");
          out.write("                            </div>\r\n");
          out.write("                            <div class=\"col-lg-9 col-sm-12 description\">\r\n");
          out.write("                                <h6 class=\"td\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
